package lesson25;

public class MyStack<T> {

    private T[] stack;
    private int size;


    void set(T object) {
        if (stack == null) {
            stack = (T[]) new Object[10];
        }
        if (size != stack.length) {
            stack[size++] = object;
        } else stack = newCapacity();
    }

    T get() {
        T value = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return value;
    }
    private T[] newCapacity(){
        T[] newStack = (T[]) new Object[size*2];
        return newStack;
    }
}
