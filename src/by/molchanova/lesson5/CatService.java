package by.molchanova.lesson5;

public interface CatService extends AnimalService {

    int COUNTER = 0;
    String name = "Tom";

    void findMeal();

    default void findDish() {
        System.out.println("find your dish");
    }
}
