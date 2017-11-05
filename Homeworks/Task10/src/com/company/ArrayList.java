package com.company;

public class ArrayList implements List {
    private final int INITIAL_SIZE = 100;
    private int count;
    private Object[] elements;

    public ArrayList() {
        elements = new Object[INITIAL_SIZE];
        count = 0;
    }

    @Override
    public void add(Object element) {
        elements[count] = element;
        count++;
    }

    @Override
    public void addToBegin(Object object) {
       for (int i=count; i>0;i--){
           elements[i] = elements[i-1];
           elements[0] = object;
       }
       count++;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public void remove(Object object) {
        int index = -1;
        for(int i =0; i<count;i++){
           if (elements[i]==object){
               index = i;
               break;
           }
        }
        if (index != -1) {
            for (int i = index; i < count; i++) {
                elements[i] = elements[i+1];
            }
            count--;
        }

    }

    @Override
    public int indexOf(Object object) {
        int index = -1;
        for (int i = 0; i<count;i++){
            if (elements[i]==object){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new arrayListIterator();
    }

    public class arrayListIterator implements Iterator{
        int index = 0;

        @Override
        public Object next() {

            index++;
            return elements[index];
        }

        @Override
        public boolean hasNext() {
            return index != count-1;
        }

//        public boolean hasNext(int index) {
//            return index != count;
//        }
}


}
