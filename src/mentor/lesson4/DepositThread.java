package mentor.lesson4;

public class DepositThread extends Thread {

    private BankAccountClass bankAccountClass;
    private String name;


    DepositThread(BankAccountClass bankAccountClass, String name) {
        this.name  = name;
        this.bankAccountClass = bankAccountClass;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccountClass.deposit();
//        System.out.println(name + ": " + bankAccountClass.getBalance());

    }
}

