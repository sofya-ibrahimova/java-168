package mentor.lesson5;

import java.lang.reflect.Field;

public class UpdateField{

    public static <T> void updateField(T object, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
       Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, newValue);
    }

   public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        TestClass testClass = new TestClass("Aynur", "Ibrahimova", 32);
        UpdateField.updateField(testClass, "age", 30);
        System.out.println(testClass);
    }
}
