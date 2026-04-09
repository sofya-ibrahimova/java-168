package mentor.lesson4;

public class WithdrawThread extends Thread {

    private BankAccountClass bankAccountClass;
    private String name;

    WithdrawThread(BankAccountClass bankAccountClass, String name) {
        this.bankAccountClass = bankAccountClass;
        this.name = name;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccountClass.withdraw();
//        System.out.println(name + ": " + bankAccountClass.getBalance());
    }

}
