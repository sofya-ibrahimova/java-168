package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "org.example.matrix168",
        "org.example.product_management_api",
        "org.example.MiniLibraryApplicationSystem"
})
public class Matrix168Application {

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(Matrix168Application.class, args);
    }
}
//      Car car = applicationContext.getBean("getBean", Car.class);
//      car.start();
//
//    }

//}
