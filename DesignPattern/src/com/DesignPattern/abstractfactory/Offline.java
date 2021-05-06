package com.DesignPattern.abstractfactory;

public class Offline implements Source {

	@Override
	public String getSourceName() {
		return "Books";
	}
	
}
