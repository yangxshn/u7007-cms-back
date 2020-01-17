package com.u7007.cms.service;

import java.util.List;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.News;
import com.u7007.cms.entity.NewsComment;

/**
 * @desc 新闻业务逻辑层
 * @author yxs
 * @date 2020/1/2 21:00
 */
public interface NewsService {
	
	Response<List<News>> getNewsList();
	
	Response<News> getNewsInfo(Integer newsId);
	
	Response<List<NewsComment>> getNewsCommentList(Integer newsId,Integer pageIndex);
	
	Response<String> postNewsComment(Integer newsId,String content);

}
