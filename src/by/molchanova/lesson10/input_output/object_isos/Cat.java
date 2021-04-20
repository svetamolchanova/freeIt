package by.molchanova.lesson10.input_output.object_isos;

import java.io.*;

class Cat implements Serializable {

	private static final long serialVersionUID = 5566504814284968257L;

	private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age, Body body) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
