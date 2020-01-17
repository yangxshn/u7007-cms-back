package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 图片实体
 * @author yxs
 * @date 2019/12/24 21:07
 */
@Getter
@Setter
public class Image {
	// 图片标识
	private Integer imageId;
	// 分类标识
	private Integer catId;
	// 标题
	private String title;
	// 图片地址
	private String imageUrl;
	// 摘要
	private String summary;
	// 详情
	private String content;
	// 点击次数
	private Integer clickNum;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
}
