package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

	@ResponseBody
	@GetMapping("/arun")
	public String p1()
	{
		return "Arun Prajapati";
	}
}
