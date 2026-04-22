package org.example.matrix168;

import org.example.matrix168.model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication(scanBasePackages = {
        "org.example.matrix168",
        "org.example.jdbc_task"
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
