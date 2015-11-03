package com.hephec.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("autowire.xml");
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
		Address address2=(Address) ctx.getBean("address2");
		System.out.println(address2);
	}
}
