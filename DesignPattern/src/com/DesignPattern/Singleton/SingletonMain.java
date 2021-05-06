package com.DesignPattern.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
			Singleton sin = Singleton.getInstance();
			Singleton sin2 = Singleton.getInstance();
			
			System.out.println(sin.hashCode());
			System.out.println(sin2.hashCode());

	}

}
