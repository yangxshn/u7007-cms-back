package com.u7007.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.u7007.cms.entity.Image;
import com.u7007.cms.entity.ImageCategory;
import com.u7007.cms.entity.ImageComment;
import com.u7007.cms.entity.ImageThumbnail;
import com.u7007.cms.mapper.provider.ImageMapperProvider;

/**
 * @desc 图片持久层 
 * @author yxs
 * @date 2019/12/24 21:35
 */
@Mapper
public interface ImageMapper {
	
	@Select("SELECT catId,title FROM u7007_cms_image_category")
	List<ImageCategory> getImageCategoryList();
	
	@SelectProvider(type = ImageMapperProvider.class,method = "getImageList")
	List<Image> getImageList(@Param("catId") Integer catId);
	
	@Select("SELECT imageId,title,clickNum,content,createTime FROM u7007_cms_image WHERE imageId=#{imageId}")
	Image getImageInfo(@Param("imageId") Integer imageId);
	
	@Update("UPDATE u7007_cms_image SET clickNum=clickNum+1 WHERE imageId=#{imageId}")
	Integer updateClickNum(@Param("imageId") Integer imageId);
	
	@Select("SELECT username,content,createTime,commentId FROM u7007_cms_image_comment WHERE imageId=#{imageId} ORDER BY commentId DESC")
	List<ImageComment> getCommentListByImageId(@Param("imageId") Integer imageId);
	
	@Insert("INSERT INTO u7007_cms_image_comment (imageId,content,username) VALUES (#{imageId},#{content},#{username})")
	Integer addImageComment(ImageComment comment);
	
	@Select("SELECT id,imageId,src FROM u7007_cms_image_thumbnail WHERE imageId=#{imageId}")
	List<ImageThumbnail> getImageThumbnail(@Param("imageId") Integer imageId);
	
}
