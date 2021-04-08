package by.molchanova.lesson7.clonning;

class Car implements Cloneable {
    public String color;

    Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" + "color car='" + color + '\'' + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
