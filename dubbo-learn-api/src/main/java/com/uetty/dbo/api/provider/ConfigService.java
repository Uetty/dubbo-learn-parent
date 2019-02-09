package com.uetty.dbo.api.provider;

import com.uetty.dbo.api.entity.Config;

public interface ConfigService {

	Config getConfig(String name);
}
