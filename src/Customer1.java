public class Customer1 {
    String name;
    String email;

    Customer1 (String name, String email){
        this.name = name;
        this.email = email;
    }

    void showCustomerInfo (){
        System.out.println("name: " + name + " " + "email: " + email);
    }

}
