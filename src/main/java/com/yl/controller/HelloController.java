package com.yl.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello")
public class HelloController {
	
	@RequestMapping("index")
	public String index(){
		return "hello";
	}
	
	@RequestMapping("register")
	public String register(){
		return "member/register";
	}

}
