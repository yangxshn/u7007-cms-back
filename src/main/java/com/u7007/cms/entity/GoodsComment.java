package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 商品评论实体
 * @author yxs
 * @date 2020/01/05 18:43
 */
@Getter
@Setter
public class GoodsComment {
	// Date
	private Integer commentId;
	// 用户名
	private String username;
	// 商品标识
	private Integer goodsId;
	// 评论内容
	private String content;
	// 创建时间
	private Date createTime;
	// 创建时间
	private Date updateTime;
}
