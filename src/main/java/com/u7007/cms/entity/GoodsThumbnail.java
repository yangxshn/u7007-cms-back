package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 商品缩略图实体
 * @author yxs
 * @date 2020/01/05 18:43
 */
@Getter
@Setter
public class GoodsThumbnail {
	// 缩略图标识
	private Integer id;
	// 商品标识
	private Integer goodsId;
	// 地址
	private String src;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
}
