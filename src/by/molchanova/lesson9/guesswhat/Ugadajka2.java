package by.molchanova.lesson9.guesswhat;
/*
System.err.println("#1.in"); -> System.err.println(".   #2.in");->
System.err.println(".   .   #3.in");-> System.err.println(".   .   .   #4.in"); ->
System.err.println(".   .   .   #4.THROW"); -> new Error()
 */
public class Ugadajka2 {
	public static void main(String[] args) {
		System.err.println("#1.in");
		f();
		System.err.println("#1.out");
	}

	public static void f() {
		System.err.println(".   #2.in");
		g();
		System.err.println(".   #2.out");
	}

	public static void g() {
		System.err.println(".   .   #3.in");
		h();
		System.err.println(".   .   #3.out");
	}

	@SuppressWarnings("unused")
	public static void h() {
		System.err.println(".   .   .   #4.in");
		if (true) {
			System.err.println(".   .   .   #4.THROW");
			throw new Error();
		}
		System.err.println(".   .   .   #4.out");
	}
}
