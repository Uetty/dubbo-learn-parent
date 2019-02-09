package com.uetty.dbo.service.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

	@Autowired(required=false)
	HttpServletRequest request;
	
}
