package by.molchanova.lesson6.inner;

import java.util.*;

// Доступ к элементам внутреннего класса возможен только из внешнего класса через
// объект внутреннего класса.

public class Outer2 {
	private Inner inner;
	private String str;
	private Date date;

	Outer2() {
		str = "string in outer";
		date = new Date();
		inner = new Inner();
	}
	
	public void callMethodInInner() {
		inner.method();
	}

	class Inner {
		
		public void method() {
			System.out.println(str);
			System.out.println(date.getTime());
		}
		
	}

}
