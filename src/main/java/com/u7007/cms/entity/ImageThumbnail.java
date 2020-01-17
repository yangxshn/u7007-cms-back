package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 图片缩略图实体
 * @author yxs
 * @date 2020/01/05 18:43
 */
@Getter
@Setter
public class ImageThumbnail {
	// 缩略图标识
	private Integer id;
	// 图片标识
	private Integer imageId;
	// 地址
	private String src;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
}
