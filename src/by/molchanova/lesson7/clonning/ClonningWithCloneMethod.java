package by.molchanova.lesson7.clonning;

public class ClonningWithCloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Car car = new Car("white");
//		Car car2 = car;
//		car2.color = "red";
//        System.out.println(car.color);

		Person person = new Person(car, 25, "Vasya");

		Person clone = person.clone();
		System.out.println(person);
		System.out.println(clone);
        System.out.println("+++++++++++++++++");

		person.name = new String("Petya");
		person.age = 20;
		clone.car.color = "red";
		System.out.println(person);
		System.out.println(clone);
	}
}
