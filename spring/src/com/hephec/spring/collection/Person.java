package com.hephec.spring.collection;

import java.util.List;

public class Person {

	private String name;
	private int age;
	private List<Car> car;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		super();
	}
	public Person(String name, int age, List<Car> car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
}
