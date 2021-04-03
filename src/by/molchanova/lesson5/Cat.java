package by.molchanova.lesson5;

public class Cat extends Animal implements CatService, Runnable {

    private static Integer count = 0;
    private static final Gender MAX_CAT = new Gender("Female");
    public static String countName;
    private CatStatus status;

    static {
        System.out.println(count);
        System.out.println("countName: " + countName);
        countName = new String("Tom");
        System.out.println("countName default: " + countName);
        MAX_CAT.setGender("Male");
        //MAX_CAT = new Gender("Male"); // невозможно
    }

    private boolean isChild;

    {
        System.out.println("isChild: " + isChild);
        isChild = true;
        System.out.println("isChild default: " + isChild);
        status = CatStatus.HOME;
    }

    public static void printCounter() {
        System.out.println(count);
    }

    public Cat(String color, int age) {
        super(color, age, "Tom");
        this.color = color;
        this.age = age;
        count++;
        System.out.println("count: " + count);
    }

    public Cat() {
        System.out.println("He is born");
        this.age = 1;
        count++;
    }

    @Override
    public String speak() {
        return "meow";
    }

    public String speak(final String word) {
        //word = new String();
        return word;
    }

    public String speak(String otherWord, int i) {
        return "test";
    }

    @Override
    public void run() {
        printCounter();
        System.out.println("Cat runs");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cat run away. Lose object");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "status=" + status +
                ", isChild=" + isChild +
                '}';
    }

    @Override
    public void findMeal() {
        System.out.println("FIND!");
    }
}
