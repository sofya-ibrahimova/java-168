package mentor.lesson8;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {

    public static List<String> validate(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        List<String> list = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                String o = (String) field.get(object);
                if (o == null || o.isEmpty()) {
                    list.add(field.getName() + " must not be null");
                }
            }
        }
        return list;
    }
}
