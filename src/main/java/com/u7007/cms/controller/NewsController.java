package com.u7007.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.News;
import com.u7007.cms.entity.NewsComment;
import com.u7007.cms.service.NewsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @desc 新闻处理器
 * @author yxs
 * @date 2020/1/2 21:05
 */
@RequestMapping("/api")
@RestController
@Api(tags = "新闻模块")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@GetMapping("/getNewsList")
	@ApiOperation("获取新闻列表")
	public Response<List<News>> getNewsList() {
		return newsService.getNewsList();
	}
	
	@GetMapping("/getNewsInfo/{newsId}")
	@ApiOperation("获取新闻信息")
	@ApiImplicitParam(paramType="path", name = "newsId", value = "新闻标识", required = true, dataType = "int")
	public Response<News> getNewsInfo(@PathVariable("newsId") Integer newsId){
		return newsService.getNewsInfo(newsId);
	}
	
	@GetMapping("/getNewsCommentList/{newsId}")
	@ApiOperation("获取新闻评论列表")
	@ApiImplicitParams({@ApiImplicitParam(name = "newsId", value = "新闻标识", required = true, dataType = "int",paramType="path"),
						@ApiImplicitParam(name = "pageIndex", value = "当前页", required = true, dataType = "int",paramType="query")})
	public Response<List<NewsComment>> getNewsCommentList(@PathVariable("newsId") Integer newsId,
														  @RequestParam("pageIndex") Integer pageIndex) {
		return newsService.getNewsCommentList(newsId,pageIndex);
	}
	
	@PostMapping("/postNewsComment/{newsId}")
	@ApiOperation("发表新闻评论")
	@ApiImplicitParams({@ApiImplicitParam(name = "newsId", value = "新闻标识", required = true, dataType = "int",paramType="path"),
						@ApiImplicitParam(name = "content", value = "评论内容", required = true, dataType = "string",paramType="query")})
	public Response<String> postNewsComment(@PathVariable("newsId") Integer newsId,
											@RequestParam("content") String content){
		return newsService.postNewsComment(newsId,content);
		
	}
	
	
}
