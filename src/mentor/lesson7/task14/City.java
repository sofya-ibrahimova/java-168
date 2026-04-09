package mentor.lesson7.task14;

public class City implements Comparable<City> {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        if (this.population > o.population) return 1;
        if (this.population < o.population) return -1;
        return 0;
    }
}
