package com.DesignPattern.Prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		Cloning c1 = new Cloning();
	    Cloning c2 = c1.clone();
		
		c1.a=200;

		System.out.println(c1.a);
		
		

		System.out.println(c2.a);
	}

}
