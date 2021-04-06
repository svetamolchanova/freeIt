package by.molchanova.lesson6.inner;


// Доступ к переменной типа final static возможен во внешнем классе через имя
// внутреннего класса.
public class Outer4 {
	
	Inner inner;

	Outer4() {
		inner = new Inner();
	}

	public void callMethodInInner() {
		System.out.println(Inner.prfsi_polr);
		System.out.println(Inner.pubfsi_pole);
	}


	class Inner {
		public final static int pubfsi_pole = 22;
		private final static int prfsi_polr = 33;

	}
}
