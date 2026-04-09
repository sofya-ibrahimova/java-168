public class RetaleCustomer extends Customer1 {
    String FIN;
    String birthday;


    RetaleCustomer(String FIN, String birthday, String name, String email) {
        super(name, email);
        this.FIN = FIN;
        this.birthday = birthday;
    }
    void showRetaleCustomerInfo(){
        super.showCustomerInfo();
        System.out.println("FIN: " + FIN + " " + "birthday: " + birthday);
    }
}

