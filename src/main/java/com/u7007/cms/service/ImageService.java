package com.u7007.cms.service;

import java.util.List;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Image;
import com.u7007.cms.entity.ImageCategory;
import com.u7007.cms.entity.ImageComment;
import com.u7007.cms.entity.ImageThumbnail;

/**
 * @desc 图片业务逻辑层
 * @author yxs
 * @date 2020/1/2 21:00
 */
public interface ImageService {
	
	Response<List<ImageCategory>> getImageCategoryList();
	
	Response<List<Image>> getImageList(Integer catId);

	Response<Image> getImageInfo(Integer imageId);
	
	Response<List<ImageComment>> getImageCommentList(Integer imageId,Integer pageIndex);
	
	Response<String> postImageComment(Integer imageId,String content);
	
	Response<List<ImageThumbnail>> getImageThumbnail(Integer imageId);
}
