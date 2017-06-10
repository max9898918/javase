package com.m17_6;

import java.io.IOException;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			y();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void y() throws IOException{
		throw new IOException("Caugth in main");
	}
}
