package com.nimo.service;

import org.springframework.stereotype.Service;

import com.nimo.api.IndexService;

@Service("indexService")
public class IndexServiceImpl implements IndexService{

	public void play() {
		System.out.println("play.....");
	}
	
	public String getName(){
		return "xiaoming";
	}

}
