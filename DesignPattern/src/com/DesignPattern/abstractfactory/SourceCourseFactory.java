package com.DesignPattern.abstractfactory;

public abstract class SourceCourseFactory {

	public abstract Source getSourse(String sourceType);

	public abstract Course getCourse(String courseType);
	
	}


