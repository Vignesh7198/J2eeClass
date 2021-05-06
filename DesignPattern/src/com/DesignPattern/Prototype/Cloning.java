package com.DesignPattern.Prototype;

public class Cloning implements Cloneable {
	
	int a=100;
	int b=200;
	@Override
	public Cloning clone() throws CloneNotSupportedException {
		return (Cloning) super.clone();
	}

	
	
		
		
	}

