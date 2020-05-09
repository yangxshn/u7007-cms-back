package com.u7007.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping("/info")
	@ResponseBody
	public String info(){
		return "Hello Docker";
	}

}
