package by.molchanova.lesson6.nested;

/*
 * Класс, вложенный в интерфейс, статический по умолчанию.
*/
public interface InterfaceNestedExample {
	int x = 10;

	class InnerInInterface {
		public void meth() {
			System.out.println("From static class defined into interface");
		}
	}
}
