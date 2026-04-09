package Lesson26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {
    private T[] elementData;
    private static final Object[] elementData0 = new Object[0];
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    MyArrayList() {
        this.elementData = (T[]) elementData0;
    }

    private T[] grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity == 0 ? DEFAULT_CAPACITY : oldCapacity + (oldCapacity >> 1);
        T[] newElementData = (T[]) new Object[newCapacity];
        System.arraycopy(elementData, 0, newElementData, 0, oldCapacity);
        return newElementData;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void add(T object) {
        if (size == elementData.length) {
            elementData = grow();
        }
        elementData[size++] = object;
    }

    public T remove(int index) {
        condition(index);
        T removedObject = elementData[index];
        int newSize = size - 1;
        System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        elementData[size = newSize] = null;
        return removedObject;
    }

    public T get(int index) {
        condition(index);
        return elementData[index];
    }

    public int size() {
        return size;
    }

    private void condition(int index) {
        if (index < 0 || index > elementData.length) {
            throw new RuntimeException();
        }
    }


}



