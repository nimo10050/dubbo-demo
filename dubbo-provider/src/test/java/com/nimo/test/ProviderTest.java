package com.nimo.test;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

	
	public static void main(String[] args) throws Exception {
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
		//context.registerBean(User.class);
		//context.refresh();
		System.out.println(context.getBeanDefinition("user"));
		System.out.println(context.getBean(User.class)==null);*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	    context.start();
	    System.in.read(); // 按任意键退出
	}
	
}
