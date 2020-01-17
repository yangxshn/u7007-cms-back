package com.u7007.cms.mapper.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * @desc 图片持久层 
 * @author yxs
 * @date 2019/12/24 21:35
 */
public class ImageMapperProvider {

	public String getImageList(@Param("catId") Integer catId) {
		SQL sql = new SQL();
		sql.FROM("u7007_cms_image");
		sql.SELECT("imageId,title,imageUrl,summary");
		if(catId != 0) {
			sql.WHERE("catId=#{catId}");
		}
		return sql.toString();
	}
	
}
