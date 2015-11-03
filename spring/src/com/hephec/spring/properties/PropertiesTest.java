package com.hephec.spring.properties;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	@Test
	public void test(){
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_properties.xml");
		DataSource dataSource=(DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
	}
}
