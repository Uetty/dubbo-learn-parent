package com.uetty.dbo.service.mapper;

import com.uetty.dbo.api.entity.Config;

public interface ConfigMapper {
    int insert(Config record);

    int insertSelective(Config record);
    
    Config getConfig(String name);
}