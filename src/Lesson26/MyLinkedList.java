package Lesson26;

import Lesson27.MyQueue;
import org.w3c.dom.Node;

public class MyLinkedList<T> implements MyQueue<T> {

    private static Node head;
    private static Node tail;
    private int size;

    private static class Node<T> {
        Node<T> prev;
        Node<T> next;
        T item;

        Node(T element, Node<T> prev, Node<T> next) {
            this.next = next;
            this.prev = prev;
            item = element;

        }

    }

    public void add(T element) {
        Node l = tail;
        Node newNode = new Node(element, l, null);
        tail = newNode;
        if (l == null) {
            head = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<T> get0(int size) {
        checkCondition(size);
        if (this.size - size > size) {
            Node<T> x = head;
            for (int i = 0; i < size; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<T> x = tail;
            for (int i = 0; i < size; i++) {
                x = x.prev;
            }
            return x;
        }
    }

    public T get(int size) {
        return get0(size).item;
    }

    public int size() {
        return size;
    }

    public T remove(int index) {
        checkCondition(index);
        Node<T> toRemoveNode = get0(index);
        if (index == 0) {
            head = toRemoveNode.next;
            toRemoveNode.next.prev = null;
        } else if (index == size - 1) {
            tail = toRemoveNode.prev;
            toRemoveNode.prev.next = null;
        } else {
            toRemoveNode.next.prev = toRemoveNode.prev;
            toRemoveNode.prev.next = toRemoveNode.next;
        }
        return toRemoveNode.item;
    }

    public void checkCondition(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException();
        }
    }

    @Override
    public T pool() {
        Node<T> f = head;
        return (f==null) ? null : unlinkFirst(f);
    }

    @Override
    public T peek() {
        return (T) head.item;
    }

    private T unlinkFirst(Node<T> f) {
        Node<T> forReturn = f;
        Node h = head;
        head = head.next;
        h = null;
        return (T) forReturn;
    }

//    private T data;
//    private Node<T> head;
//    private Node<T> tail;
//
//    private static class Node<T> {
//        T item;
//        Node<T> next;
//        Node<T> last;
//
//        Node(T data, Node last, Node next) {
//            item = data;
//            this.next = next;
//            this.last = last;
//        }
//
//        private void add(T element){}
//
//    }


}

