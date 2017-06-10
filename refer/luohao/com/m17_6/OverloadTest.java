package com.m17_6;

public class OverloadTest {
	public void method(Object o){
		System.out.println("object");
	}
	
	public void method(String s){
		System.out.println("string");
	}
	
	public static void main(String[] args) {
		OverloadTest load = new OverloadTest();
		load.method(null);
	}
}
