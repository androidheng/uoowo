package com.uoowo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui")
public class EasyUiController {

	@RequestMapping("/index")
	public String index(){
		return "uis";
	}
	
}
