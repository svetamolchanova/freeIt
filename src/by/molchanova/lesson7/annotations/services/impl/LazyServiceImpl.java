package by.molchanova.lesson7.annotations.services.impl;

import by.molchanova.lesson7.annotations.*;
import by.molchanova.lesson7.annotations.services.*;

@MyAnnotationService(name = "lazyService", lazyLoad = true)
public class LazyServiceImpl implements LazyService
{

	@MyAnnotationInit(suppressException = true)
	public void lazyInit() throws Exception
	{
		System.out.println("From public lazyInit() method");
	}

	@MyAnnotationInit(suppressException = false)
	private void secondLazyInit()
	{
		System.out.println("From private secondLazyInit() method");
	}

}
