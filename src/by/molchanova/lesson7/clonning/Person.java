package by.molchanova.lesson7.clonning;

class Person implements Cloneable {
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
    protected Person clone() throws CloneNotSupportedException {
        //return (Person)super.clone();
        return new Person(new Car(this.car.color), this.age, this.name);
    }
}
