package by.molchanova.lesson13.java8features.examples;

public class UserNew {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserNew{" +
                "name='" + name + '\'' +
                '}';
    }
}
