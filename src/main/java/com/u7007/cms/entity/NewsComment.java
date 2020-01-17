package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 新闻评论实体
 * @author yxs
 * @date 2020/01/05 18:43
 */
@Getter
@Setter
public class NewsComment {
	// 主键ID
	private Integer commentId;
	// 用户名
	private String username;
	// 新闻标识
	private Integer newsId;
	// 评论内容
	private String content;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;


}
