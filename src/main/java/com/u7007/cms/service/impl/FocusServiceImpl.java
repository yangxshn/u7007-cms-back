package com.u7007.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Focus;
import com.u7007.cms.mapper.FocusMapper;
import com.u7007.cms.service.FocusService;

/**
 * @desc 轮播图业务逻辑层实现
 * @author yxs
 * @date 2019/12/24 21:35
 */
@Service
public class FocusServiceImpl implements FocusService{
	@Autowired
	private FocusMapper focusMapper;
	
	public Response<List<Focus>> getFocusList() {
		return Response.success("查询成功",focusMapper.getFocusList());
	}

}
