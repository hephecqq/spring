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
		//HelloWorld helloWorld=(HelloWorld) ctx.getBean("HelloWorld");
		
		//3.����hello����
		//helloWorld.hello();
		
		//��������IOC�����е�Bean����Ҫ��IOC�����б�������һ�������͵�Bean
//		HelloWorld helloWorld1=ctx.getBean(HelloWorld.class);
//		helloWorld1.hello();
		//����ע�뷽ʽ
		//����ע��
		//������ע��
//		Car car=ctx.getBean(Car.class);
//		System.out.println(car);
		
//		Car car2=(Car) ctx.getBean("car2");
//		System.out.println(car2);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
	}
}
