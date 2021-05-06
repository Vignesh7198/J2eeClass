package com.DesignPattern.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class AbstractHead {
	public static Map Mape= new HashMap<>();


	public static void main(String[] args) {

		
		SourceCourseFactory course = FactoryCreator.getSourceCourseFactory("course");
		
		System.out.println(course.getCourse("programming").getCourseName());
		
		SourceCourseFactory source = FactoryCreator.getSourceCourseFactory("source");

		System.out.println(source.getSourse("online").getSourceName());

		
	
				
	}

}
