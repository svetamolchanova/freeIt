package by.molchanova.lesson6.inner;

import java.util.*;

// Методы внутреннего класса имеют прямой доступ ко всем полям и методам
// внешнего класса.
public class Outer1 {
	
	private String str;
	Date date;

	Outer1() {
		str = "string in outer";
		date = new Date();
	}
	
	public class Inner {
	    private String str;
			
		public Inner() {
			super();
			this.str = "string in inner";
		}

		public void method() {
			System.out.println(str);
			System.out.println(date.getTime());
		}
	}

	public void method() {
	    Inner inner = new Inner();
	    inner.method();
    }
}
