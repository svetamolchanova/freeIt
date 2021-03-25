package by.molchanova.lesson1;

public class Building {

    public String address;
    private int size;

    public void setSize(int size) {
        this.size = size;
        this.getSize();
    }

    public int getSize() {
        System.out.println(size);
        return size;
    }

}
