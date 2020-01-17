package com.u7007.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @desc 视图处理器
 * @author yxs
 * @date 2020/1/2 21:05
 */
@Controller
public class ViewController {
	
	@GetMapping(value = "/")
	public String index() {
		return "/index";
	}

}
