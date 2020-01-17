package com.u7007.cms.service;

import java.util.List;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Focus;

/**
 * @desc 轮播图业务逻辑层
 * @author yxs
 * @date 2019/12/24 21:35
 */
public interface FocusService {
	
	Response<List<Focus>> getFocusList();
	
}
