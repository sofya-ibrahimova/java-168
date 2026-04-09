package lesson24;

import java.time.LocalDate;

public class Customer {
    private LocalDate birthday;
    private String finCode;
    private String name;


    Customer(LocalDate birthday, String finCode, String name) {
        this.birthday = birthday;
        this.finCode = finCode;
        this.name = name;
    }
}
