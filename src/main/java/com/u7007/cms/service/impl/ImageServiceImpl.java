package com.u7007.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Image;
import com.u7007.cms.entity.ImageCategory;
import com.u7007.cms.entity.ImageComment;
import com.u7007.cms.entity.ImageThumbnail;
import com.u7007.cms.mapper.ImageMapper;
import com.u7007.cms.service.ImageService;

/**
 * @desc 图片业务逻辑层实现
 * @author yxs
 * @date 2020/1/2 21:00
 */
@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	private ImageMapper imageMapper;
	
	public Response<List<ImageCategory>> getImageCategoryList() {
		return Response.success("查询成功",imageMapper.getImageCategoryList());
	}

	public Response<List<Image>> getImageList(Integer catId) {
		return Response.success("查询成功",imageMapper.getImageList(catId));
	}

	public Response<Image> getImageInfo(Integer imageId) {
		Image imageInfo = imageMapper.getImageInfo(imageId);
		if(imageInfo == null) {
			return Response.error("图片信息不存在");
		}
		imageMapper.updateClickNum(imageId);
		return Response.success("查询成功",imageInfo);
	}

	public Response<List<ImageComment>> getImageCommentList(Integer imageId, Integer pageIndex) {
		Image imageInfo = imageMapper.getImageInfo(imageId);
		if(imageInfo == null) {
			return Response.error("图片信息不存在");
		}
		PageHelper.startPage(pageIndex, 10);
		List<ImageComment> commentList = imageMapper.getCommentListByImageId(imageId);
		PageInfo<ImageComment> pageInfo = new PageInfo<ImageComment>(commentList);
		return Response.success("查询成功",pageInfo.getList());
	}

	public Response<String> postImageComment(Integer imageId, String content) {
		Image imageInfo = imageMapper.getImageInfo(imageId);
		if(imageInfo == null) {
			return Response.error("图片信息不存在");
		}
		ImageComment comment = new ImageComment();
		comment.setImageId(imageId);
		comment.setContent(content);
		comment.setUsername("test1");
		Integer result = imageMapper.addImageComment(comment);
		if(result == 1) {
			return Response.success("发表成功");
		}
		return Response.error("发表失败，请稍后重试");
	}

	public Response<List<ImageThumbnail>> getImageThumbnail(Integer imageId) {
		Image imageInfo = imageMapper.getImageInfo(imageId);
		if(imageInfo == null) {
			return Response.error("图片信息不存在");
		}
		return Response.success("查询成功",imageMapper.getImageThumbnail(imageId));
	}

}
