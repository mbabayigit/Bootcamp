package com.eteration.springbootasd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@RequestMapping("/bootcamp")
	@ResponseBody
	public String firstController() {
		return "hello bootcamp";
	}
}
