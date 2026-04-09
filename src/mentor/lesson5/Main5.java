package mentor.lesson5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        getMethodsAndParameters(TestClass.class);
  List<Integer> list = new ArrayList<>();      ;




    }

//Bir classin methodlarinin siyahisini ve onlarin parametr saylarini capa veren method yaz\
    public static void getMethodsAndParameters(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ": " + method.getParameterCount());
        }
    }
}







