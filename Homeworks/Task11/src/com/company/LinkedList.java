package com.company;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
    }

    public void addToBegin(T object) {
        Node<T> newNode = new Node<>(object);
        if (head == null) {
            tail = newNode;
        }

        // для нового узла следующий элемент -
        // тот, который был первым в списке
        newNode.next = head;
        // теперь первый элемент списка - новый
        head = newNode;
        count++;
    }

    private static class Node<E> {
        // значение, которое хранит узел
        E value;
        // указатель на следующий узел
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }

    private class LinkedListIterator implements Iterator<T>{

        private Node<T> currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T value = currentNode.value;
            currentNode = currentNode.next;
            return value;
        }

    }
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public int size() {
        return count;
    }

}
