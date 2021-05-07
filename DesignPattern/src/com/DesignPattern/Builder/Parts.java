package com.DesignPattern.Builder;

public class Parts {
	
	private StringBuilder Wheels;
	private StringBuilder Body;
	private StringBuilder Chases;
	private StringBuilder AirBags;
	
	public Parts(Assemble Ass) {
		this.AirBags = Ass.AirBags;
		this.Body = Ass.Body;
		this.Chases = Ass.Chases;
		this.Wheels = Ass.Wheels;
	}
	
	public StringBuilder getWheels() {
		return Wheels;
	}


	public StringBuilder getBody() {
		return Body;
	}


	public StringBuilder getChases() {
		return Chases;
	}


	public StringBuilder getAirBags() {
		return AirBags;
	}


	public static class Assemble{
		
		private StringBuilder Wheels;
		private StringBuilder Body;
		private StringBuilder Chases;
		private StringBuilder AirBags;
		
		public Assemble(){
			
		}
		
		
		public Assemble setWheels(StringBuilder Wheels) {
			this.Wheels=Wheels;
			return this;
		}
		
		public Assemble setBody(StringBuilder Body) {
			this.Body=Body;
			return this;
		}
		
		public Assemble setChases(StringBuilder Chases) {
			this.Chases=Chases;
			return this;
		}
		
		public Assemble setAirBags(StringBuilder AirBags) {
			this.AirBags=AirBags;
			return this;
		}
		
		public Parts BuildCar() {
			return new Parts(this);
			
		}
		
	}

}
