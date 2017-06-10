package com.reflect;

import java.io.Serializable;

import a110_other.A004_InnerClass.Tests;

public class Person extends Base<Tests> implements IBase,Serializable{
	private int age;
	private String name;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
}
