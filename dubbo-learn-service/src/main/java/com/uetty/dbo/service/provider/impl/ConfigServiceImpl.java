package com.uetty.dbo.service.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uetty.dbo.api.entity.Config;
import com.uetty.dbo.api.provider.ConfigService;
import com.uetty.dbo.service.mapper.ConfigMapper;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	ConfigMapper configMapper;
	
	@Override
	public Config getConfig(String name) {
		return configMapper.getConfig(name);
	}

	
}
