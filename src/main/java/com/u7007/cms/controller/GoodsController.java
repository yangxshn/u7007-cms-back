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
import com.u7007.cms.entity.Goods;
import com.u7007.cms.entity.GoodsComment;
import com.u7007.cms.entity.GoodsThumbnail;
import com.u7007.cms.service.GoodsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @desc 商品处理器
 * @author yxs
 * @date 2019/12/24 21:05
 */
@RequestMapping("/api")
@RestController
@Api(tags = "商品模块")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/getGoodsList")
	@ApiOperation("获取商品列表")
	@ApiImplicitParams({@ApiImplicitParam(name = "pageIndex", value = "当前页", required = true, dataType = "int",paramType="query")})
	public Response<List<Goods>> getGoodsList(@RequestParam("pageIndex") Integer pageIndex){
		return goodsService.getGoodsList(pageIndex);
	}
	
	@GetMapping("/getGoodsThumbnail/{goodsId}")
	@ApiOperation("获取商品缩略图列表")
	@ApiImplicitParams({@ApiImplicitParam(name = "goodsId", value = "商品标识", required = true, dataType = "int",paramType="path")})
	public Response<List<GoodsThumbnail>> getGoodsThumbnail(@PathVariable("goodsId") Integer goodsId){
		return goodsService.getGoodsThumbnail(goodsId);
	}
	
	@GetMapping("/getGoodsInfo/{goodsId}")
	@ApiOperation("获取商品信息")
	@ApiImplicitParams({@ApiImplicitParam(name = "goodsId", value = "商品标识", required = true, dataType = "int",paramType="path")})
	public Response<Goods> getGoodsInfo(@PathVariable("goodsId") Integer goodsId){
		return goodsService.getGoodsInfo(goodsId);
	}
	
	@GetMapping("/getGoodsDesc/{goodsId}")
	@ApiOperation("获取商品详情")
	@ApiImplicitParams({@ApiImplicitParam(name = "goodsId", value = "商品标识", required = true, dataType = "int",paramType="path")})
	public Response<Goods> getGoodsDesc(@PathVariable("goodsId") Integer goodsId){
		return goodsService.getGoodsDesc(goodsId);
	}
	
	@GetMapping("/getGoodsCommentList/{goodsId}")
	@ApiOperation("获取商品评论列表")
	@ApiImplicitParams({@ApiImplicitParam(name = "goodsId", value = "商品标识", required = true, dataType = "int",paramType="path"),
						@ApiImplicitParam(name = "pageIndex", value = "当前页", required = true, dataType = "int",paramType="query")})
	public Response<List<GoodsComment>> getGoodsCommentList(@PathVariable("goodsId") Integer goodsId,
														  @RequestParam("pageIndex") Integer pageIndex) {
		return goodsService.getGoodsCommentList(goodsId, pageIndex);
	}
	
	@PostMapping("/postGoodsComment/{goodsId}")
	@ApiOperation("发表商品评论")
	@ApiImplicitParams({@ApiImplicitParam(name = "goodsId", value = "商品标识", required = true, dataType = "int",paramType="path"),
						@ApiImplicitParam(name = "content", value = "评论内容", required = true, dataType = "string",paramType="query")})
	public Response<String> postGoodsComment(@PathVariable("goodsId") Integer goodsId,
											@RequestParam("content") String content){
		return goodsService.postGoodsComment(goodsId,content);
	}
	
	@GetMapping("/getShopcarList/{goodsIds}")
	@ApiOperation("获取购物车列表")
	@ApiImplicitParams({@ApiImplicitParam(name = "goodsIds", value = "商品标识列表", required = true, dataType = "string",paramType="path")})
	public Response<List<Goods>> getShopcarList(@PathVariable("goodsIds") String goodsIds){
		return goodsService.getShopcarList(goodsIds);
	}
}
