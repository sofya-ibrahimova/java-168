import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] array = new Customer[3];
        int count = 0;
        a: while (true) {
            System.out.println("secin: \nnew customer  - 1 \nshow customer - 2 \nexit - 3"); //delete
            int number = sc.nextInt();
            Customer newCustomer;
            switch (number) {
                case 1:
                        if (count == array.length){
                            System.out.println("siyahi doludur");
                            break ;
                        }else {
                        System.out.println("ad: ");
                        String name = sc.next();
                        System.out.println("yas:");
                        int age = sc.nextInt();
                        newCustomer = new Customer(name, age);
                            array[count++] = newCustomer;
                        }
                    break ;
                case 2:
                    if (count == 0) System.out.println("no customer");
                    for (int i = 0; i < count; i ++ ){
                        array[i].printInfoFromArray();
                    }
                    System.out.println();
                    break;
                case 3:
                    break a;
                default:
                    System.out.println("yalniz 1, 2 ve ya 3");
                    break;
            }
        }

    }
}