package by.molchanova.lesson6.inner;

public class Outer6 {
	
	int count = 0;

	class InnerClass {
		int count = 10000;

		public void display() {
			System.out.println("Outer: " + Outer6.this.count);
			System.out.println("Inner: " + count);
		}
	}
}
