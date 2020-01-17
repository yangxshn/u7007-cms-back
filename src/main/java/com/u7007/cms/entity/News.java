package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 新闻实体
 * @author yxs
 * @date 2020/01/02 20:52
 */
@Getter
@Setter
public class News {
	// 新闻标识
	private Integer newsId;
	// 标题
	private String title;
	// 新闻图片
	private String newsImg;
	// 点击数量
	private Long clickNum;
	// 详情
	private String details;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;

}
