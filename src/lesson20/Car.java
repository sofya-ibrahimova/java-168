package lesson20;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int year;
    private transient String colour;

    public Car(String name, int year, String colour) {
        this.name = name;
        this.year = year;
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
