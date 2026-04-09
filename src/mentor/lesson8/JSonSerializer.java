package mentor.lesson8;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class JSonSerializer {

    public static String toJSon(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        Map<String, Object> map = new HashMap<>();
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {

                JsonField jsonField = field.getAnnotation(JsonField.class);
                String key = jsonField.value().isEmpty() ? field.getName() : jsonField.value();
                field.setAccessible(true);
                map.put(key, field.get(object));
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        sb.append("{");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!first) sb.append(",");
            first = false;

            sb.append("\"").append(entry.getKey()).append("\"");
            Object o = entry.getValue();
            if (o instanceof Number || o instanceof Boolean) {
                sb.append(o);
            } else {
                sb.append("\"").append(o).append("\"");
            }
            sb.append("}");
        }
        return sb.toString();

    }


//
//    public static String toJSon(Object object) throws IllegalAccessException {
//
//        Field[] field = object.getClass().getDeclaredFields();
//
//        Map<String, Object> map = new HashMap<>();
//        for (Field field1 : field) {
//            if (field1.isAnnotationPresent(JsonField.class)) {
//
//                JsonField jsonField = field1.getAnnotation(JsonField.class);
//                String key = jsonField.value().isEmpty() ? field1.getName() : jsonField.value();
//                field1.setAccessible(true);
//                map.put(key, field1.get(object));
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        boolean first = true;
//        sb.append("{");
//        for (Map.Entry<String, Object> entry : map.entrySet()) {
//            if (!first) sb.append(",");
//            first = false;
//
//            sb.append("\"").append(entry.getKey()).append("\":");
//            Object o = entry.getValue();
//            if (o instanceof Number || o instanceof Boolean) {
//                sb.append(o);
//            } else {
//                sb.append("\"").append(o).append("\"");
//            }
//        }
//
//        return sb.toString();
//    }
}
