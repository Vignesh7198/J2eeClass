package com.DesignPattern.abstractfactory;

public class SourceFactory extends SourceCourseFactory {

	
	@Override
	public Source getSourse(String sourceType) 
	{
		
		if(sourceType.equalsIgnoreCase("online"))
		{
			return new Online();
			
		}
		
		else if(sourceType.equalsIgnoreCase("offline"))
		{
			
			return new Offline();
		}
		
		else
		{
			return null;
		}
		
	}

	@Override
	public Course getCourse(String courseType) {
		return null;
	}
	
	
}
