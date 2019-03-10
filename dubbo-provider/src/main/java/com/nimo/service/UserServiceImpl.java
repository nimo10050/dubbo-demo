package com.nimo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nimo.api.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	public List<String> findAllUser(){
		List<String> list = new ArrayList<String>();
		list.add("zahngsan");
		list.add("lisi");
		list.add("wangwu");
		return list;
	}

	@Override
	public void save(String name) {
		System.out.println("save..to..db");
	}
	
}
