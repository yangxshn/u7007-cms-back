package com.u7007.cms.service;

import java.util.List;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Goods;
import com.u7007.cms.entity.GoodsComment;
import com.u7007.cms.entity.GoodsThumbnail;

/**
 * @desc 商品业务逻辑层
 * @author yxs
 * @date 2019/12/24 21:35
 */
public interface GoodsService {

	Response<List<Goods>> getGoodsList(Integer pageIndex);
	
	Response<List<GoodsThumbnail>> getGoodsThumbnail(Integer goodsId);
	
	Response<Goods> getGoodsInfo(Integer goodsId);
	
	Response<Goods> getGoodsDesc(Integer goodsId);
	
	Response<List<GoodsComment>> getGoodsCommentList(Integer goodsId,Integer pageIndex);
	
	Response<String> postGoodsComment(Integer goodsId,String content);
	
	Response<List<Goods>> getShopcarList(String goodsIds);
	
}
