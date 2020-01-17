package com.u7007.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.u7007.cms.entity.Focus;

/**
 * @desc 轮播图数据持久层 
 * @author yxs
 * @date 2019/12/24 21:35
 */
@Mapper
public interface FocusMapper {
	@Select("SELECT focusId,focusImg,focusUrl FROM u7007_cms_focus")
	List<Focus> getFocusList();
	
}
