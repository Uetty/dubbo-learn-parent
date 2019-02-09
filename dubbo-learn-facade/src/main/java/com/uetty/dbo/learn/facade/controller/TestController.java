package com.uetty.dbo.learn.facade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uetty.dbo.api.entity.Config;
import com.uetty.dbo.api.provider.ConfigService;

@RestController
@RequestMapping("test")
public class TestController extends BaseController {

	@Autowired
	ConfigService configService;
	
	@RequestMapping("/ceshi")
	public Config ceshi() {
		
		Config config = configService.getConfig("greet");
			
		return config;
	}

}
