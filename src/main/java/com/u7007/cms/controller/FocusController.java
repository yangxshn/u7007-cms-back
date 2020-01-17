package com.u7007.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.u7007.cms.common.base.Response;
import com.u7007.cms.entity.Focus;
import com.u7007.cms.service.FocusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @desc 轮播图处理器
 * @author yxs
 * @date 2019/12/24 21:05
 */
@RequestMapping("/api")
@RestController
@Api(tags = "轮播图模块")
public class FocusController {
	@Autowired
	private FocusService focusService;
	
	@GetMapping("/getFocusList")
	@ApiOperation("获取轮播图列表")
	public Response<List<Focus>> getFocusList() {
		return focusService.getFocusList();
	}
}
