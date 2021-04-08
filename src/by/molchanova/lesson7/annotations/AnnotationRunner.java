package by.molchanova.lesson7.annotations;

import by.molchanova.lesson7.annotations.services.impl.*;
import java.lang.reflect.*;

public class AnnotationRunner extends Object {

	private static int myAnnInitCounter = 0;

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		inspectService(SimpleServiceImpl.class);
//		inspectService(LazyServiceImpl.class);
//		inspectService(String.class);
	}

	static void inspectService(Class<?> serviceClass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		LazyServiceImpl lsi;
//		if(serviceClass.isAnnotationPresent(MyAnnotationService.class)){
//			MyAnnotationService mas = serviceClass.getAnnotation(MyAnnotationService.class);
//			System.out.println(mas);
//
//			if(serviceClass.isAnnotationPresent(MyAnnotationInit.class)){
//				MyAnnotationInit mai = serviceClass.getAnnotation(MyAnnotationInit.class);
//				if(mai.suppressException()){
//					SimpleServiceImpl ssi = new SimpleServiceImpl();
//					System.out.println(ssi);
//				}
//			}
//		}

//		Method [] methods = serviceClass.getMethods();
//		for(Method m : methods){
//			if(m.getAnnotation(MyAnnotationInit.class) != null){
//				if(m.getAnnotation(MyAnnotationInit.class).suppressException() == false){
//					System.out.println("Here we will pass all Exceptions: method = " + m);
//				}
//			}
//		}

		Method[] allMethods = serviceClass.getDeclaredMethods();
		for(Method m : allMethods){
			if(m.getAnnotation(MyAnnotationInit.class) != null){
				if(m.getAnnotation(MyAnnotationInit.class).suppressException() == false){
					myAnnInitCounter++;
					System.out.println("Here we will pass all Exceptions: method = " + m);
					m.setAccessible(true);
					m.invoke(new LazyServiceImpl(), null);
				}else{
					System.out.println("Here we should to proceed Exceptions: method = " + m);
				}
			}
		}

	}
}
