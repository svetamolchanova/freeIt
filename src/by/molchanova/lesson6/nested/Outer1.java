package by.molchanova.lesson6.nested;

public class Outer1 {
	private int x = 3;
	private static int y = 4;

	/*
	 * Статический вложенный класс для доступа к нестатическим членам и методам
	 * внешнего класса должен создавать объект внешнего класса.
	 */
	static class Inner1 {
		public void method() {
			Outer1 out = new Outer1();
			System.out.println("From Inner1: Outer1.x=" + out.x);
            System.out.println("Static value" + y);
		}
	}

	/*
	 * Вложенный класс имеет доступ к статическим полям и методам внешнего
	 * класса.
	 */
	static class Inner2 {
		public void method() {
			System.out.println("From Inner2: Outer1.y=" + y);
			// System.out.println("x="+x); // ERROR
			Outer1 out = new Outer1();
			System.out.println("From Inner2: Outer1.x=" + out.x);
		}
	}

	/*
	 * Статический метод вложенного класса вызывается при указании полного
	 * относительного пути к нему.
	 */
	static class Inner3 {
		public static void method() {
			System.out.println("From Inner3 static method");
		}
		public void printMe(){
			System.out.println("From non static method Inner3");
		}
	}

	/*
	 * Подкласс вложенного класса не наследует возможность доступа к членам
	 * внешнего класса, которым наделен его суперкласс.
	 */
	static class Inner4 {
		public static void method() {
			System.out.println("From Inner4: Outer1.y=" + y);
		}
	}

}
