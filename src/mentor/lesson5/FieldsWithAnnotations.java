package mentor.lesson5;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FieldsWithAnnotations {

    public static <T> List<String>  targetFields(T object){
        List<String> list = new ArrayList<>();

        Class<?> clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            if (field.isAnnotationPresent(MyAnno.class)){
                list.add(field.getName());
            }
        }return list;
    }

   public static void main(String[] args) {
        TestClass testClass = new TestClass("Aynur", "Ibrahimova", 32);
        System.out.println(targetFields(testClass));

    }
}
