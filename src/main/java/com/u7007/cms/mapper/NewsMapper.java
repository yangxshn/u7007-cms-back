package com.u7007.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.u7007.cms.entity.News;
import com.u7007.cms.entity.NewsComment;

/**
 * @desc 新闻数据持久层 
 * @author yxs
 * @date 2020/1/2 20:57
 */
@Mapper
public interface NewsMapper {
	
	@Select("SELECT newsId,title,newsImg,clickNum,createTime FROM u7007_cms_news")
	List<News> getNewsList();
	
	@Select("SELECT newsId,title,newsImg,clickNum,createTime,details FROM u7007_cms_news WHERE newsId=#{newsId}")
	News getNewsInfo(@Param("newsId") Integer newsId);
	
	@Update("UPDATE u7007_cms_news SET clickNum=clickNum+1 WHERE newsId=#{newsId}")
	Integer updateClickNum(@Param("newsId") Integer newsId);
	
	@Select("SELECT username,content,createTime,commentId FROM u7007_cms_news_comment WHERE newsId=#{newsId} ORDER BY commentId DESC")
	List<NewsComment> getCommentListByNewsId(@Param("newsId") Integer newsId);
	
	@Insert("INSERT INTO u7007_cms_news_comment (newsId,content,username) VALUES (#{newsId},#{content},#{username})")
	Integer addNewsComment(NewsComment comment);
}
