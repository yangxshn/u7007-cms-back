package com.u7007.cms.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 商品实体
 * @author yxs
 * @date 2019/12/24 21:07
 */
@Getter
@Setter
public class Goods {
	// 商品标识
	private Integer goodsId;
	// 商品货号
	private String goodsCode;
	// 商品标题
	private String title;
	// 摘要
	private String summary;
	// 详情
	private String content;
	// 点击次数
	private Integer clickNum;
	// 图片地址
	private String imageUrl;
	// 库存
	private Integer stock;
	// 出售价格
	private BigDecimal sellPrice;
	// 市场价格
	private BigDecimal marketPrice;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
	// 数量
	private Integer count = 1;
}
