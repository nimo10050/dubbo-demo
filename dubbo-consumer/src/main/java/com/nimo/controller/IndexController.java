package com.nimo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nimo.api.IndexService;
import com.nimo.api.UserService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("index")
	@ResponseBody
	public String index() {
		
		indexService.play();
		
		return indexService.getName();
	}
	
	@RequestMapping("user/list")
	@ResponseBody
	public List<String> findAllUser(){
		return userService.findAllUser();
	}
	
	@RequestMapping("user/save")
	@ResponseBody
	public String saveUser() {
		try {
			userService.save("maliu");
		}catch(Exception e) {
			return "fail";
		}
		return "success";
	}
}
