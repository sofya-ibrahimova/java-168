package mentor.lesson8;
import org.apache.poi.ss.extractor.ExcelExtractor;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main8 {
    public Main8() throws IllegalAccessException {
    }

    public static void main(String[] args) throws IllegalAccessException {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Sevda", 19, 89));
        list.add(new Student("Jale", 17, 99));
        list.add(new Student("Konul", 20, 80));

//
//        User user = new User("Kamila", 20, "DVC45");
//        String json = JSonSerializer.toJSon(user);
//        System.out.println(json);

        RegisterRequest rr = new RegisterRequest(null,null, null);
        System.out.println(Validator.validate(rr));
    }
}
