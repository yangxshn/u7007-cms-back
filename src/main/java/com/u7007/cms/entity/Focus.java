package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 轮播图实体
 * @author yxs
 * @date 2019/12/24 21:07
 */
@Getter
@Setter
public class Focus {
	// 主键
	private Integer focusId;
	// 轮播图图片
	private String focusImg;
	// 跳转地址
	private String focusUrl;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
}
