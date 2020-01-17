package com.u7007.cms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Goods;
import com.u7007.cms.entity.GoodsComment;
import com.u7007.cms.entity.GoodsThumbnail;
import com.u7007.cms.mapper.GoodsMapper;
import com.u7007.cms.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsMapper goodsMapper;

	public Response<List<Goods>> getGoodsList(Integer pageIndex) {
		PageHelper.startPage(pageIndex, 10);
		List<Goods> goodsList = goodsMapper.getGoodsList();
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(goodsList);
		return Response.success("查询成功",pageInfo.getList());
	}

	public Response<List<GoodsThumbnail>> getGoodsThumbnail(Integer goodsId) {
		return Response.success("查询成功",goodsMapper.getGoodsThumbnail(goodsId));
	}

	public Response<Goods> getGoodsInfo(Integer goodsId) {
		Goods goodsInfo = goodsMapper.getGoodsInfo(goodsId);
		if(goodsInfo == null) {
			return Response.error("商品信息不存在");
		}
		goodsMapper.updateClickNum(goodsId);
		return Response.success("查询成功",goodsInfo);
	}

	public Response<Goods> getGoodsDesc(Integer goodsId) {
		Goods goodsInfo = goodsMapper.getGoodsDesc(goodsId);
		if(goodsInfo == null) {
			return Response.error("商品信息不存在");
		}
		return Response.success("查询成功",goodsInfo);
	}

	public Response<List<GoodsComment>> getGoodsCommentList(Integer goodsId, Integer pageIndex) {
		Goods goodsInfo = goodsMapper.getGoodsDesc(goodsId);
		if(goodsInfo == null) {
			return Response.error("商品信息不存在");
		}
		PageHelper.startPage(pageIndex, 10);
		List<GoodsComment> commentList = goodsMapper.getCommentListByGoodsId(goodsId);
		PageInfo<GoodsComment> pageInfo = new PageInfo<GoodsComment>(commentList);
		return Response.success("查询成功",pageInfo.getList());
	}

	public Response<String> postGoodsComment(Integer goodsId, String content) {
		Goods goodsInfo = goodsMapper.getGoodsDesc(goodsId);
		if(goodsInfo == null) {
			return Response.error("商品信息不存在");
		}
		GoodsComment comment = new GoodsComment();
		comment.setGoodsId(goodsId);
		comment.setContent(content);
		comment.setUsername("test1");
		Integer result = goodsMapper.addGoodsComment(comment);
		if(result == 1) {
			return Response.success("发表成功");
		}
		return Response.error("发表失败，请稍后重试");
	}

	public Response<List<Goods>> getShopcarList(String goodsIds) {
		List<Goods> goodsList = new ArrayList<Goods>();
		String[] split = goodsIds.split(",");
		for (String strGoodsId : split) {
			try {
				Integer goodsId = Integer.parseInt(strGoodsId);
				Goods goodsInfo = goodsMapper.getGoodsInfo(goodsId);
				if(goodsInfo != null) {
					goodsList.add(goodsInfo);
				}
			} catch (Exception e) {}
			
		}
		
		return Response.success("查询成功",goodsList);
	}

}
