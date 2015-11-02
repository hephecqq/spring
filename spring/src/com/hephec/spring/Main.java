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
		//HelloWorld helloWorld=(HelloWorld) ctx.getBean("HelloWorld");
		
		//3.调用hello方法
		//helloWorld.hello();
		
		//利用类型IOC容器中的Bean，但要求IOC容器中必须置于一个该类型的Bean
//		HelloWorld helloWorld1=ctx.getBean(HelloWorld.class);
//		helloWorld1.hello();
		//依赖注入方式
		//属性注入
		//构造器注入
//		Car car=ctx.getBean(Car.class);
//		System.out.println(car);
		
//		Car car2=(Car) ctx.getBean("car2");
//		System.out.println(car2);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
	}
}
