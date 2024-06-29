package com.exe;

public class DemoClassCastExe {
	public static void main(String[] args) {
		int a=102;
		int b=a;
		float c=b;
		char ch=(char) a;
		Object o=new Object();
		String s=(String) o;
		System.out.println(s);
	}
}