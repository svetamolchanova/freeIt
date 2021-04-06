package by.molchanova.lesson6.inner;

public class Outer5 {

	public void method() {
		
		final int x = 3;
		
		class Inner1 {
			
			void print() {
				System.out.println("Inner1");
				System.out.println("x=" + x);
			}
		}

		Inner1 obj = new Inner1();
		obj.print();
	}
	
}
