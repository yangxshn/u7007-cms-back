package com.u7007.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.u7007.cms.entity.Goods;
import com.u7007.cms.entity.GoodsComment;
import com.u7007.cms.entity.GoodsThumbnail;

/**
 * @desc 商品数据持久层 
 * @author yxs
 * @date 2019/12/24 21:35
 */
@Mapper
public interface GoodsMapper {
	
	@Select("SELECT goodsId,title,summary,content,clickNum,imageUrl,stock,createTime,sellPrice,marketPrice FROM u7007_cms_goods ORDER BY goodsId DESC")
	List<Goods> getGoodsList();
	
	@Select("SELECT id,goodsId,src FROM u7007_cms_goods_thumbnail WHERE goodsId=#{goodsId}")
	List<GoodsThumbnail> getGoodsThumbnail(@Param("goodsId") Integer goodsId);
	
	@Select("SELECT goodsId,goodsCode,title,createTime,stock,marketPrice,sellPrice,imageUrl FROM u7007_cms_goods WHERE goodsId=#{goodsId}")
	Goods getGoodsInfo(@Param("goodsId") Integer goodsId);
	
	@Update("UPDATE u7007_cms_goods SET clickNum=clickNum+1 WHERE goodsId=#{goodsId}")
	Integer updateClickNum(@Param("goodsId") Integer goodsId);
	
	@Select("SELECT title,content FROM u7007_cms_goods WHERE goodsId=#{goodsId}")
	Goods getGoodsDesc(@Param("goodsId") Integer goodsId);
	
	@Select("SELECT username,content,createTime,commentId FROM u7007_cms_goods_comment WHERE goodsId=#{goodsId} ORDER BY commentId DESC")
	List<GoodsComment> getCommentListByGoodsId(@Param("goodsId") Integer goodsId);
	
	@Insert("INSERT INTO u7007_cms_goods_comment (goodsId,content,username) VALUES (#{goodsId},#{content},#{username})")
	Integer addGoodsComment(GoodsComment comment);

}
