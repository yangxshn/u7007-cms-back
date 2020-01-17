package com.u7007.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.News;
import com.u7007.cms.entity.NewsComment;
import com.u7007.cms.mapper.NewsMapper;
import com.u7007.cms.service.NewsService;

/**
 * @desc 新闻业务逻辑层实现
 * @author yxs
 * @date 2020/1/2 21:02
 */
@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsMapper newsMapper;
	
	public Response<List<News>> getNewsList() {
		return Response.success("查询成功",newsMapper.getNewsList());
	}

	public Response<News> getNewsInfo(Integer newsId) {
		News newsInfo = newsMapper.getNewsInfo(newsId);
		if(newsInfo==null) {
			return Response.error("新闻信息不存在");
		}
		// 更新点击次数
		newsMapper.updateClickNum(newsId);
		return Response.success("查询成功",newsInfo);
	}

	public Response<List<NewsComment>> getNewsCommentList(Integer newsId, Integer pageIndex) {
		News newsInfo = newsMapper.getNewsInfo(newsId);
		if(newsInfo==null) {
			return Response.error("新闻信息不存在");
		}
		PageHelper.startPage(pageIndex, 10);
		List<NewsComment> commentList = newsMapper.getCommentListByNewsId(newsId);
		PageInfo<NewsComment> pageInfo = new PageInfo<NewsComment>(commentList);
		return Response.success("查询成功",pageInfo.getList());
	}

	public Response<String> postNewsComment(Integer newsId, String content) {
		News newsInfo = newsMapper.getNewsInfo(newsId);
		if(newsInfo==null) {
			return Response.error("新闻信息不存在");
		}
		NewsComment comment = new NewsComment();
		comment.setNewsId(newsId);
		comment.setContent(content);
		comment.setUsername("test1");
		Integer result = newsMapper.addNewsComment(comment);
		if(result == 1) {
			return Response.success("发表成功");
		}
		return Response.error("发表失败，请稍后重试");
	}

	

}
