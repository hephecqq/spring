package com.hephec.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@Test
	public void testBean() {
		
//		HelloWorld hello=new HelloWorld();
//		hello.setName("何鹏");
//		hello.hello();
		//1.创建Spring的IOC容器对象
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
		//2.从IOC容器中获取Bean实例
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("HelloWorld");
		
		//3.调用hello方法
		helloWorld.hello();
		
	}
}
