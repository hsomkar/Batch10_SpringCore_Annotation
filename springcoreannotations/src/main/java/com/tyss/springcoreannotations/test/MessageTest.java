package com.tyss.springcoreannotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tyss.springcoreannotations.Message;
import com.tyss.springcoreannotations.config.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		Message message=context.getBean(Message.class);
		System.out.println(message);
		((AbstractApplicationContext)context).close();
	}

}
