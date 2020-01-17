package com.u7007.cms.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 图片评论实体
 * @author yxs
 * @date 2020/01/05 18:43
 */
@Getter
@Setter
public class ImageComment {
	// 主键ID
	private Integer commentId;
	// 用户名
	private String username;
	// 图片标识
	private Integer imageId;
	// 评论内容
	private String content;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;


}
