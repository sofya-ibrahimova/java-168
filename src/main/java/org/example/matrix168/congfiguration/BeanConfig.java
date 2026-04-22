package org.example.matrix168.congfiguration;

import org.example.matrix168.model.Car;
import org.example.matrix168.model.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration // класс упраляет созданием бинов
//public class BeanConfig {
//    private Engine engine;
//@Autowired // найдет бин и передаст car
//private Engine engine;
//
//    @Autowired //найдет бин и передаст в сеттер
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

//public BeanConfig(Engine engine ){ //аннотация здесь не нужна
//    this.engine = engine;
//}
//
//    @Bean
//    public Car getBean() {
//        return new Car(engine);
//    }
//}
