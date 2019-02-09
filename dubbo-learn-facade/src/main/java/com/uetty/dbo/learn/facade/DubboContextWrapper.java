package com.uetty.dbo.learn.facade;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboContextWrapper {

	public static ClassPathXmlApplicationContext context;
	
	public static void initDubboContext() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-dubbo.xml"});
		context.start();
		DubboContextWrapper.context = context;
	}
	
//	public static void main(String[] args) {
//		
//        // Obtaining a remote service proxy
//        DemoService demoService = (DemoService)context.getBean("demoService");
//        // Executing remote methods
//        String hello = demoService.sayHello("world");
//        // Display the call result
//        System.out.println(hello);
//	}
	
}
