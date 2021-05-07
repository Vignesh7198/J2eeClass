package com.DesignPattern.Builder;

public class Car {

	public static void main(String[] args) {

		Parts.Assemble AssembleVehicle = new Parts.Assemble();
		
		
		Parts Lamborgini = AssembleVehicle.setAirBags(new StringBuilder().append("Have AirBags")).setBody(new StringBuilder().append("Metal")).BuildCar();
		
		
		System.out.println(Lamborgini.getBody());
		
		System.out.println(Lamborgini.getAirBags());
		System.out.println(Lamborgini.getChases());
		System.out.println(Lamborgini.getWheels());


		
	}

}
