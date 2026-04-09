package lesson20;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerProcess {
    Customer[] customers;
    private int size;


    {
        customers = new Customer[10];
    }

    Scanner sc = new Scanner(System.in);

    public void addCustomer() throws InvalidInputException {
        downloadSavedCustomers();
        setSize();
        System.out.println("input name and surname");
        String name = sc.next();
        String surname = sc.next();
        if (name.matches(".*\\d.*") || surname.matches(".*\\d.*")) {
            throw new InvalidInputException("name and surname must contain letters only!");
        }
        Customer customer = new Customer(name, surname);
        System.out.println("age");
        try {
            int age = sc.nextInt();
            customer.setAge(age);
        }catch (InputMismatchException e){
            throw new InvalidInputException("Not correct age input!");
        }
        if (size == customers.length) {
            Customer[] customer1 = new Customer[customers.length * 2];
            for (int i = 0; i < customers.length; i++) {
                customer1[i] = customers[i];
            }
            customers = customer1;
        }
        customers[size++] = customer;
        updateCustomers();
        System.out.println("Customer added!");
    }

    public void printAllCustomers() {
        downloadSavedCustomers();
        setSize();
        if (size == 0) {
            System.out.println("no customer found!");
        } else {
            for (int i = 0; i < size; i++) {
                {
                    System.out.println(i + ". " + customers[i].toString());
                }
            }
        }
    }


    public void updateCustomer() throws InvalidInputException {
        downloadSavedCustomers();
        setSize();
        System.out.println("enter your old name and surname");
        String oldName = sc.next();
        String oldSurname = sc.next();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (customers[i].getName().equalsIgnoreCase(oldName)
                    && customers[i].getSurName().equalsIgnoreCase(oldSurname)) {
                System.out.println("enter new name and surname");
                String newName = sc.next();
                String newSurname = sc.next();
                System.out.println("age");
                try {
                    int age = sc.nextInt();
                    customers[i].setAge(age);
                }catch (InputMismatchException e){
                    throw new InvalidInputException("Not correct age input!", e);
                }
                if (newName.matches(".*\\d.*") || newSurname.matches(".*\\d.*")) {
                    throw new InvalidInputException("only letters!");
                }
                customers[i].setName(newName);
                customers[i].setSurName(newSurname);

                flag = true;
                updateCustomers();
                System.out.println("Updated!");
                break;
            }
        }
        if (!flag) {
            System.out.println("Customer not found!");
        }
    }

    public void deleteCustomer() {
        downloadSavedCustomers();
        setSize();
        System.out.println("enter name and surname customer for delete");
        String name = sc.next();
        String surname = sc.next();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (customers[i].getName().equalsIgnoreCase(name)
                    && customers[i].getSurName().equalsIgnoreCase(surname)) {
                for (int j = i; j < size - 1; j++) {
                    customers[j] = customers[j + 1];
                }
                flag = true;
                customers[size - 1] = null;
                size--;
                updateCustomers();
                break;
            }
        }
        if (!flag) {
            System.out.println("Customer not found!");
        }
    }

    public void updateCustomers() {
        try (FileOutputStream fos = new FileOutputStream("customers.dat", false);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(customers); //???
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void downloadSavedCustomers() {
        try (FileInputStream fis = new FileInputStream("customers.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            customers = (Customer[]) ois.readObject();
            {
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setSize() {
        int count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                count++;
            } else {
                break;
            }
            size = count;
        }

    }

}
