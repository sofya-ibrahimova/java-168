package lesson22;

import java.util.Arrays;

public class CustomStringBuilder {

    private char[] value;
    private int size;


    CustomStringBuilder() {
        value = new char[16];
        size = 0;
    }

    CustomStringBuilder(String str) {
        int pow =4;
        double capacity = Math.pow(2, pow);
        while (str.length()> capacity){
            pow++;
            capacity = Math.pow(2, pow);
        }
        value = new char[(int) capacity];
        for (int i = 0; i < str.length(); i++) {
            value[size++] = str.charAt(i);
        }
    }

    public void append(String str) {
        if (value.length < str.length() + size) {
           resize(str.length() + size);
        }
        for (int i = 0; i < str.length(); i++) {
            value[size++] = str.charAt(i);
        }
    }

    public void resize(int newCapacity) {
        char[] newValue = new char[newCapacity];
        for (int i = 0; i < size; i++) {
            newValue[i] = value[i];
        }
        value = newValue;
    }

    public String reverse() {
        for (int i = 0; i < size / 2; i++) {
            char temp = value[i];
            value[i] = value[size - i - 1];
            value[size - i - 1] = temp;
        }
        return this.toString();
    }

    @Override
    public String toString() {
        char[] newValue = new char[size];
        for (int i = 0; i < size; i++) {
            newValue[i] = value[i];
        }
        return new String(newValue);
    }

    public char[] getValue() {
        return value;
    }

    public int getSize() {
        return size;
    }
}