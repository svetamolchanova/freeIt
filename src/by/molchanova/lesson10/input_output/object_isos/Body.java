package by.molchanova.lesson10.input_output.object_isos;

import java.io.*;

public class Body implements Serializable {

    private static final long serialVersionUID = 556650481428496111L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body(String name) {
        this.name = name;
    }
}
