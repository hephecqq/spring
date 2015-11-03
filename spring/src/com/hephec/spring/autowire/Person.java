package com.hephec.spring.autowire;

public class Person {

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car
				+ "]";
	}
	private String name;
	public Person() {
		super();
	}
	public Person(String name, Address address, Car car) {
		super();
		this.name = name;
		this.address = address;
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	private Address address;
	private Car car;
}
