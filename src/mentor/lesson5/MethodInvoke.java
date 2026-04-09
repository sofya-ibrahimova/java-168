package mentor.lesson5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MethodInvoke methodInvoke = new MethodInvoke();
        Method method = methodInvoke.getClass().getDeclaredMethod("sum", int.class, int.class);
        method.setAccessible(true);
        method.invoke(methodInvoke, 3, 10); //Метод invoke всегда возвращает Object

    }

}
