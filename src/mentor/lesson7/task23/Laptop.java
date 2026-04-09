package mentor.lesson7.task23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Laptop {

    private String brand;
    private int ram;
    private int price;

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;


    }

    public static void main(String[] args) {

        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Acer", 8, 2000));
        list.add(new Laptop("Asus", 8, 2300));
        list.add(new Laptop("Macbook", 16, 3000));
        list.add(new Laptop("Acer", 16, 3100));
        list.add(new Laptop("Acer", 16, 3200));

        Comparator<Laptop> comparator = Comparator.comparing(Laptop:: getBrand )
                .thenComparing(Laptop :: getRam)
                .thenComparing(Laptop :: getPrice);

        list.sort(comparator);
        System.out.println(list);
    }

}
