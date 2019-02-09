package com.uetty.dbo.learn.facade.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

	@Autowired(required=false)
	HttpServletRequest request;
	
}
