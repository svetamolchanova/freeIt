package by.molchanova.lesson1;

public class Example {

    public static void main(String[] args) {
        Building house = new Building();
        house.address = "Minsk";
        house.setSize(5);
        int floor = house.getSize();
        System.out.println(floor);

        Building office = new Building();
        office.address = "Brest";
        office.setSize(14);
    }
}
