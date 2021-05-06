package com.DesignPattern.abstractfactory;

public class CourseFactory extends SourceCourseFactory {

	
	@Override
	public Course getCourse(String courseType) 
	{
		
		if(courseType.equalsIgnoreCase("programming"))
		{
			return new ProgrammingCourse();
			
		}
		
		else if(courseType.equalsIgnoreCase("non programming"))
		{
			
			return new NonProgrammingCourse();
		}
		
		else
		{
			return null;
		}
		
	}

	@Override
	public Source getSourse(String sourceType) {
		return null;
	}
	
}
