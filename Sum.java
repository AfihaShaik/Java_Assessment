package com.test;

 

public class Sum {
	interface A{

		int sum(int x,int y);

	}
	interface B{

		String upperCase(String x);

	}
	public static void main(String[] args) {
		A a = (m,n)->m+n;

		System.out.println(a.sum(1, 2));

		B b = str->str.toUpperCase();

		System.out.println(b.upperCase("good morning"));

	}

 

}
