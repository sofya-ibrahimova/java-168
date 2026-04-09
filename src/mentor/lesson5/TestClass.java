package mentor.lesson5;

import java.lang.reflect.Field;

public class TestClass {
    @MyAnno
    String name;

    String surname;

    @MyAnno
    int age;

    public TestClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void test1(){

    }
    public void test2(int a, int b){
        System.out.println(a + b);

    }

    public void test3(int a){

    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
