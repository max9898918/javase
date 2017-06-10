package com.m17_6;

public class Sample {
	long length;
	public Sample(long l){length = l;}
	public static void main(String[] args) {
		Sample s1,s2,s3;
		s1 = new Sample(21L);
		s2 = new Sample(21L);
		s3 = s2;
		System.out.println(s2 != s3);
		
	}
}
