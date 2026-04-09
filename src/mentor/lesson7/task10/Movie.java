package mentor.lesson7.task10;

import java.util.Comparator;

public class Movie  {

    private String name;
    private int year;
    private double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }


}
