package com.company;

public class ArrayList {
    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 100;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;
    // для сортировки выбором
    private int temp;
    private int imin;
    private int min;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    /**
     * Добавить элемент в конец
     * switch 2.1
     *
     * @param element
     */
    public void add(int element) {
        if (count < elements.length) {
            elements[count] = element;
            count++;
        } else {
            // TODO: увеличение размера массива
            System.err.println("Нет места");
        }
    }

    /**
     * Добавить элемент в начало списка, со сдвигом вправо
     * switch 2.2
     *
     * @param element
     */
    public void addToBegin(int element) {
        if (count < elements.length) {
            for (int i = count; i > 0; i--) {
                 elements[i] = elements[i - 1];
            }
            elements[0] = element;
            count++;
        } else {
            System.out.println("Нет места");
        }
    }


    /**
     * Вставить элемент в заданную позицию со сдвигом
     * switch 2.3
     *
     * @param element сам элемент
     * @param index   индекс, куда надо вставить
     */
    public void insert(int element, int index) {
        if (index >= 0 && index <= count) {
            if (index == count ) {
                elements[count] = element;
            } else {
                for (int i = count; i > index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
            }
            count++;

        } else {
            System.out.println("Пусткой индекс");
        }

    }

    /**
     * Получить элемент по индексу
     * switch 2.4
     *
     * @param index
     * @return сам элемент по заданному индексу
     */
    public int get(int index) {
        if (elements[index] != 0) {
            return elements[index];
        } else {
            return -1;
        }
    }

    /**
     * Заменить элемент в заданной позиции новым элементом
     * switch 2.5
     *
     * @param index
     * @param element
     */
    public void replace(int index, int element) {
        if (elements[index] != 0) {
            elements[index] = element;
        } else {
            System.out.println("Пуской индекс");
        }
    }

    // switch 2.6
    public void sort() {
        for (int i = 0; i < count; i++) {
            min = elements[i];
            imin = i;
            for (int j = i + 1; j < count; j++) {
                if (elements[j] < min) {
                    imin = j;
                }
            }
            if (i != imin) {
                temp = elements[i];
                elements[i] = elements[imin];
                elements[imin] = temp;
                temp = 0;
            }
        }
    }

    //switch 2.7
    public void reverse() {
        for (int i = 0; i < count % 2; i++) {
            temp = elements[i];
            elements[i] = elements[count - i - 1];
            elements[count - i - 1] = temp;
        }
        temp = 0;

    }

    //switch 2.8
    public void remove(int index) {
        if (index >= 0 && index < count) {
            if (index == count - 1) {
                elements[count - 1] = 0;
            } else {
                for (int i = index; i < count; i++) {
                    elements[i] = elements[i + 1];
                }
                elements[count - 1] = 0;
            }
            count--;
        } else {
            System.out.println("Пусткой индекс");
        }

    }

    /**
     * Вернуть индекс элемента, если элемента нет = -1
     * switch 2.9
     *
     * @param element
     * @return
     */
    public int find(int element) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //удобство вывода
    public int getElements(int index) {
        return elements[index];
    }

}
