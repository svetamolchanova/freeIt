package by.molchanova.lesson7.clonning;

public class ClonningStaticClassExample {

	static class Person implements Cloneable {
		String name;
		int age;
		Car car;

		Person(Car car, int age, String name) {
			this.car = car;
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name + " {" + "age=" + age + ", car=" + car + '}';
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
		    return super.clone();
			//return new Person(new Car(this.car.color), this.age, this.name);
		}
	}

	static class Car /*implements Cloneable*/{
		public String color;

		Car(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "{" + "color car='" + color + '\'' + '}';
		}

//		@Override
//		protected Object clone() throws CloneNotSupportedException {
//			return super.clone();
//		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Car car = new Car("white");
		Person person = new Person(car, 25, "Vasya");

		Person clone = (Person) person.clone();
		System.out.println(person);
		System.out.println(clone);
		
		person.name = new String("Petya");
		clone.car.color = "red";
		System.out.println(person);
		System.out.println(clone);
	}
}
