package lesson20;

import java.io.*;

public class Lesson20 {
    public static void main(String[] args) {

//        Car car = new Car("jeep", 2024, "yellow");
//       try(FileOutputStream fos = new FileOutputStream("test.txt", false);
//       BufferedOutputStream bos = new BufferedOutputStream(fos);
//       ObjectOutputStream oos = new ObjectOutputStream(bos)){
//       oos.writeObject(car);
//       }
//       catch (IOException e){
//           e.printStackTrace();
//       }
//
//       try (FileInputStream fis = new FileInputStream("test.txt");
//       BufferedInputStream bis = new BufferedInputStream(fis);
//       ObjectInputStream ois = new ObjectInputStream(bis)){
//           Car car1 = (Car) ois.readObject();
//           System.out.println(car1.toString());
//       } catch (IOException  | ClassNotFoundException e){
//           e.printStackTrace();
//       }

Customer [] cust = new Customer[20];
try (FileInputStream fis = new FileInputStream("customers.dat");
ObjectInputStream ois = new ObjectInputStream(fis)){
    cust = (Customer[]) ois.readObject();
    for (int i = 0; i < cust.length; i++){
        if (cust[i] != null)
        System.out.println(cust[i].toString());
    }
 } catch (IOException | ClassNotFoundException e){
    System.out.println(e.getMessage());
 }



    }
}
