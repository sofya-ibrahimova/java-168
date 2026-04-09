package Lesson28;

public class Customer {

    private String name;
    private int age;
    private String ID;

   public Customer(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;

    }

    @Override
    public int hashCode() {
        int hash = 0;
        char[] array = ID.toCharArray();
        for (int i = 0; i < array.length; i++) {
            hash += array[i];
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Customer customer = (Customer) obj;
        return name.equals(customer.name) && age == customer.age && ID.equals(customer.ID);
    }
}
