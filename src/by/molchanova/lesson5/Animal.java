package by.molchanova.lesson5;

public abstract class Animal {

    private static int countAnimal;

    static {
        System.out.println("countAnimal");
        countAnimal = 0;
    }

    protected String name;
    protected String color;
    protected int age;
    private Season season;

    public String getName() {
        return this.name;
    }

    public Animal(String color, int age, Season season) {
        this.color = color;
        this.age = age;
        this.season = season;
        countAnimal++;
        System.out.println("countAnimal: " + countAnimal);
    }

    public Animal() {
        countAnimal++;
        System.out.println("countAnimal: " + countAnimal);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Season getSeasonWalk(Season season) {
        this.season = season;
        return season;
    }

    public Season getSeason() {
        return this.season;
    }

    public String speak() {
        return "Hello";
    }

    protected abstract void run();
}
