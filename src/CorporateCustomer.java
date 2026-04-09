public class CorporateCustomer extends Customer1{
    String TIN;
    String creationDate;

    CorporateCustomer(String TIN, String creationDate, String name, String email){
        super(name, email);
        this.TIN = TIN;
        this.creationDate = creationDate;

    }

    void showCorporateInfo(){
        super.showCustomerInfo();
        System.out.println("TIN: " + TIN + "creation date: " + creationDate);
    }

}
