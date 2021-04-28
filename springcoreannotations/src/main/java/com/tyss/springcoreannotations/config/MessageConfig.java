package com.tyss.springcoreannotations.config;

import org.springframework.context.annotation.Bean;

import com.tyss.springcoreannotations.Message;
import com.tyss.springcoreannotations.MyBeanFactoryPP;
import com.tyss.springcoreannotations.MyBeanPP;

public class MessageConfig {
	@Bean(name="msgBean")
	public Message getMsg() {
		Message message =new Message();
		message.setMsg("now im emp of te");
		return message;
	}
	@Bean
	public MyBeanFactoryPP getMBFPP() {
		return new MyBeanFactoryPP();
	}
	@Bean
	public MyBeanPP getMBPP() {
		return new MyBeanPP();
	}
}
