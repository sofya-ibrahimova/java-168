package mentor.lesson3;

public class Book {
    private String name;
    private String author;
    private int price;

    Book (String name, String author, int price){
        this.name = name;
        this.author =author;
        if (price > 0){
            this.price = price;
        }
    }

    public void setPrice(int price) {
        if (price > 0){
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
