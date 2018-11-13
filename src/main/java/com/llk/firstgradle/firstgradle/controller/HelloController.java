package com.llk.firstgradle.firstgradle.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/*
 * user 控制器
 */
@RestController

public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
	
}
