package by.molchanova.lesson7.clonning;

public class PersonForClonningWithConstructor {
    private int age;
    private String name;
    
    public PersonForClonningWithConstructor(int age, String name){
        this.age=age;
        this.name=name;
    }
    
    // конструктор копии
    public PersonForClonningWithConstructor(PersonForClonningWithConstructor other) {
        this(other.getAge(), other.getName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
    	PersonForClonningWithConstructor original = new PersonForClonningWithConstructor(18, "Petya");
    	PersonForClonningWithConstructor clone = new PersonForClonningWithConstructor(original);
    	clone.age = 20;
        System.out.println(original);
        System.out.println(clone);
    }
}
