package com.uetty.dbo.learn.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@EnableAutoConfiguration
@ImportResource(locations= {"classpath:spring-dubbo.xml"})
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
//		DubboContextWrapper.initDubboContext();
	}
}
