package com.hephec.spring;

public class HelloWorld {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void hello(){
		
		System.out.println("Hello World..."+name);
	}
}
