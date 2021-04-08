package by.molchanova.lesson7.annotations.services.impl;

import by.molchanova.lesson7.annotations.*;

@MyAnnotationService(name = "simpleService")
public class SimpleServiceImpl{

	@MyAnnotationInit(suppressException = true)
	public void initService() {
		System.out.println("From initService() method");
	}
	@MyAnnotationInit
	private static void printMe(){
		System.out.println("From private method");
	}

}
