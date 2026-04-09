package Lesson26;

import java.util.LinkedList;

public interface MyList<T> {


    T get(int size);

    int size();

    boolean isEmpty();

    void add(T object);

    T remove(int index);


}
