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
import com.u7007.cms.entity.Image;
import com.u7007.cms.entity.ImageCategory;
import com.u7007.cms.entity.ImageComment;
import com.u7007.cms.entity.ImageThumbnail;
import com.u7007.cms.service.ImageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @desc 轮播图处理器
 * @author yxs
 * @date 2019/12/24 21:05
 */
@RequestMapping("/api")
@RestController
@Api(tags = "图片模块")
public class ImageController {
	@Autowired
	private ImageService imageService;
	
	@GetMapping("/getImageCategoryList")
	@ApiOperation("获取图片分类列表")
	public Response<List<ImageCategory>> getImageCategoryList(){
		return imageService.getImageCategoryList();
	}
	
	@GetMapping("/getImageList/{catId}")
	@ApiOperation("获取图片列表")
	@ApiImplicitParam(paramType="path", name = "catId", value = "分类标识", required = true, dataType = "int")
	public Response<List<Image>> getImageList(@PathVariable("catId") Integer catId){
		return imageService.getImageList(catId);
	}
	
	@GetMapping("/getImageInfo/{imageId}")
	@ApiOperation("获取图片信息")
	@ApiImplicitParam(paramType="path", name = "imageId", value = "图片标识", required = true, dataType = "int")
	public Response<Image> getImageInfo(@PathVariable("imageId") Integer imageId){
		return imageService.getImageInfo(imageId);
	}
	
	@GetMapping("/getImageCommentList/{imageId}")
	@ApiOperation("获取图片评论列表")
	@ApiImplicitParams({@ApiImplicitParam(name = "imageId", value = "图片标识", required = true, dataType = "int",paramType="path"),
						@ApiImplicitParam(name = "pageIndex", value = "当前页", required = true, dataType = "int",paramType="query")})
	public Response<List<ImageComment>> getImageCommentList(@PathVariable("imageId") Integer imageId,
														  @RequestParam("pageIndex") Integer pageIndex) {
		return imageService.getImageCommentList(imageId,pageIndex);
	}
	
	@PostMapping("/postImageComment/{imageId}")
	@ApiOperation("发表图片评论")
	@ApiImplicitParams({@ApiImplicitParam(name = "imageId", value = "图片标识", required = true, dataType = "int",paramType="path"),
						@ApiImplicitParam(name = "content", value = "评论内容", required = true, dataType = "string",paramType="query")})
	public Response<String> postImageComment(@PathVariable("imageId") Integer imageId,
											@RequestParam("content") String content){
		return imageService.postImageComment(imageId,content);
		
	}
	
	@GetMapping("/getImageThumbnail/{imageId}")
	@ApiOperation("获取图片缩略图")
	@ApiImplicitParam(paramType="path", name = "imageId", value = "图片标识", required = true, dataType = "int")
	public Response<List<ImageThumbnail>> getImageThumbnail(@PathVariable("imageId") Integer imageId){
		return imageService.getImageThumbnail(imageId);
	}
	
}
