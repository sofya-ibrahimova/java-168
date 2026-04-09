package mentor.lesson7.task11;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Task11 {
    public static void main(String[] args) {

        StringTransformer stringTransformer = (string) -> string.toUpperCase(Locale.ROOT); //специальная нейтральная локаль из класса Locale
        System.out.println(stringTransformer.transform("Hello world!"));
        StringTransformer stringTransformer1 = (string) -> string.toLowerCase();
        System.out.println(stringTransformer1.transform("HELLO WORLD!"));
        StringTransformer stringTransformer2 = (string) -> new StringBuilder(string).reverse().toString();
        System.out.println((stringTransformer2.transform("Hello world!")));
    }
}
