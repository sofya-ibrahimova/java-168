package mentor.lesson7.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable {

    private long id;
    private String title;
    private int price;

    Book(long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if (this.price > ((Book) o).price) {
            return 1;
        }
        if (this.price < ((Book) o).price) {
            return -1;
        }
        return 0;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String
    toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(18883, "AAA", 15));
        books.add(new Book(18325, "BBB", 19));
        books.add(new Book(22283, "CCC", 20));
        books.add(new Book(11283, "DDD", 21));
        books.sort(null);
        System.out.println(books);

        books.sort(Comparator.comparing(Book:: getPrice).reversed());
        System.out.println(books);

    }
}
