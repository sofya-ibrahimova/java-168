package mentor.lesson3;

public class Order {
    private Customer customer;
    private Book[] books = new Book[5];
    private int bookCount;

    Order(Customer customer){
        this.customer = customer;

    }

    public void addBook (Book book){
        if (bookCount == books.length){
            System.out.println("Maksimal kitab sayi!");
        }else {
            books[bookCount++] = book;
        }
    }

    public void getTotaPrice (){
        int sum = 0;
        for (int i =0; i < bookCount; i++){
           sum += books[i].getPrice();
        }
        System.out.println("total price: " + sum);
    }

    public void printOrderDetails(){
        customer.printInfo();
        for (int i = 0; i < bookCount; i++){
            System.out.println(books[i].toString());
        }
    }

}
