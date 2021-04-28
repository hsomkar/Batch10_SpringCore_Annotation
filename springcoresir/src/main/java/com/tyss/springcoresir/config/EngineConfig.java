package com.tyss.springcoresir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcoresir.bean.Engine;

@Configuration
public class EngineConfig {
	
	@Bean
	public Engine getEngine(){
		Engine engine=new Engine();
		engine.setCc(100);
		engine.setType("Diesel");
		return engine;
	}
}
