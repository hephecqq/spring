package com.hephec.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@Test
	public void testBean() {
		
//		HelloWorld hello=new HelloWorld();
//		hello.setName("����");
//		hello.hello();
		//1.����Spring��IOC��������
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
		//2.��IOC�����л�ȡBeanʵ��
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("HelloWorld");
		
		//3.����hello����
		helloWorld.hello();
		
	}
}
