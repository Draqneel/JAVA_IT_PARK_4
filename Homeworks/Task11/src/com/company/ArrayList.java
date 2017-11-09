package com.company;

public class ArrayList<T> implements List<T>{
    private final int INITIAL_SIZE = 100;
    private Object elements[];
    private int count;

    public ArrayList() {
        elements = new Object[INITIAL_SIZE];
        count = 0;
    }

    public void add(T element) {
        if (count == elements.length) {
            Object[] tempArray = new Object[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
            }
            elements = tempArray;
        }
        elements[count] = element;
        count++;
    }

    @Override
    public void addToBegin(Object object) {
        if (count == elements.length) {
            Object[] tempArray = new Object[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
            }
            elements = tempArray;
        }
        for (int i = count; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
        elements[0] = object;
        count++;
    }

    @Override
    public T get(int index) {
        if (index >= count) {
            return null;
        }
        return (T) elements[index];
    }

    @Override
    public void remove(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(elements[i])) {
                for (; i < count - 1; i++) {
                    elements[i] = elements[i + 1];
                }
                count--;
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return count;
    }

    public void swap(int i, int j) {
        if (i >= 0 && i < count && j >= 0 && j < count) {
            Object temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public T next() {
            if (currentIndex < count)
                return (T) elements[currentIndex++];
            else
                return null;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }
    }
}
