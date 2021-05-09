package com.oak.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jdk.internal.vm.annotation.Contended;

@Controller
public class apiConroller {

	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}

	@RequestMapping("/hy")
	public String hy()
	{
		return "hy";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}

}
