package Lesson28;

import org.w3c.dom.Node;

public class MyHashMap<K, V> {
    private K key;
    private V value;
    Node<K, V> next;

    Node<K, V>[] elements;

    MyHashMap() {
    }


    private static class Node<K, V> {
        V value;
        K key;
        Node<K, V> next;

        Node(V value, K key, Node<K, V> next) {
            this.value = value;
            this.key = key;
            this.next = next;
        }
    }

    public void put(V value, K key) {
        if (elements == null || elements.length == 0) {
            elements = (Node<K, V>[]) new Node[16];
        }
        int index = key.hashCode() % elements.length;
        if (elements[index] == null) {
            elements[index] = new Node<>(value, key, null);
        } else {
            while (elements[index].next != null) {
                index++;
            }
            elements[index].next = new Node<>(value, key, null);
        }
    }

    public V get(Object key) {
        return (V) elements[key.hashCode() % elements.length];
    }



}
