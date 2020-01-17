package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 图片分类实体
 * @author yxs
 * @date 2019/12/24 21:07
 */
@Getter
@Setter
public class ImageCategory {
	// 分类标识
	private Integer catId;
	// 标题
	private String title;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;

}
