package com.nimo.service;

import com.nimo.api.IndexService;

public class IndexServiceImpl implements IndexService{

	public void play() {
		System.out.println("play.....");
	}
	
	public String getName(){
		return "xiaoming";
	}

}
