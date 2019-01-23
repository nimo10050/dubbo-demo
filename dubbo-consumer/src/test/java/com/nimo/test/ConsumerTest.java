package com.nimo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nimo.api.IndexService;


public class ConsumerTest {

	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        IndexService indexService  = (IndexService)context.getBean("indexService"); // 获取远程服务代理
       //indexService.play(); // 执行远程方法
        System.out.println(indexService.getName());
	}
}
