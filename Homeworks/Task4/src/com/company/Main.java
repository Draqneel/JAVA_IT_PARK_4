package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList lists[] = new ArrayList[5];
        boolean a[] = new boolean[5];
        // МЕНЮ
        // 1. Создать список (0..4) - создаете нужный список
        // 2. Показть все списки (показываются только ненулевые)
        // 3. Работа со списком - попросить ввести номер спика
        //       1. Добавить
        //       2. Удалить
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать список");
            System.out.println("2. Показать все списки");
            System.out.println("3. Работа со списком");
            int command = scanner.nextInt();
            int commandSwitchTwo;
            int listNumber;
            int elementMenu;
            int indexMenu;
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0..4]");
                    listNumber = scanner.nextInt();
                    if (listNumber > 4 && listNumber < 0) {
                        System.out.println("Uncorrect number;");
                        break;
                    } else {
                        lists[listNumber] = new ArrayList();
                        a[listNumber] = true;
                        break;
                    }
                case 2:
                    for (int i = 0; i < lists.length; i++) {
                        if (a[i] == true) {
                            for (int j = 0; j < 100; j++) {
                                System.out.print(lists[i].getElements(j) + " ");
                                if (j % 10 == 9) {
                                    System.out.println();
                                }

                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Выберите лист с которым хотите работать [0..4]");
                    listNumber = scanner.nextInt();
                    if (listNumber > 4 || listNumber < 0) {
                        break;
                    } else {
                        System.out.println("Меню(2):");
                        System.out.println("1) Добавить элемент в конец");
                        System.out.println("2) Добавить элемент в начало");
                        System.out.println("3) Вставить элемент в заданную позицию");
                        System.out.println("4) Получить элемент по идексу");
                        System.out.println("5) Заменить элемент в заданной позиции");
                        System.out.println("6) Отсортировать список");
                        System.out.println("7) Развернуть список");
                        System.out.println("8) Удалить элемент по индексу");
                        System.out.println("9) Вернуть интекс элемента");
                        System.out.println();
                        commandSwitchTwo = scanner.nextInt();
                        // работаем с меню 2.1
                        switch (commandSwitchTwo) {
                            case 1:
                                System.out.println("Введите элемент который хотите добавить в конец");
                                elementMenu = scanner.nextInt();
                                lists[listNumber].add(elementMenu);
                                break;
                            case 2:
                                System.out.println("Введите элемент который хотите добавить в начало");
                                elementMenu = scanner.nextInt();
                                lists[listNumber].addToBegin(elementMenu);
                                break;
                            case 3:
                                System.out.println("Введите элемент который хотите добавить ");
                                elementMenu = scanner.nextInt();
                                System.out.println("Введите позицию данного элемента ");
                                indexMenu = scanner.nextInt();
                                lists[listNumber].insert(elementMenu, indexMenu);
                                break;
                            case 4:
                                System.out.println("Введите индекс искомого элемента");
                                indexMenu = scanner.nextInt();
                                if (lists[listNumber].get(indexMenu) == -1) {
                                    System.out.println("Элемент отсутствует");
                                } else {
                                    System.out.println(lists[listNumber].get(indexMenu));
                                }
                                break;
                            case 5:
                                System.out.println("Ввежите позицию на которой вы бы хотели заменить элемент");
                                indexMenu = scanner.nextInt();
                                System.out.println("Введите новый элемент");
                                elementMenu = scanner.nextInt();
                                lists[listNumber].replace(indexMenu, elementMenu);
                                break;
                            case 6:
                                lists[listNumber].sort();
                                break;
                            case 7:
                                lists[listNumber].reverse();
                                break;
                            case 8:
                                System.out.println("Элемент пож каким индексом вы хотели бы удалить?");
                                indexMenu = scanner.nextInt();
                                lists[listNumber].remove(indexMenu);
                                break;
                            case 9:
                                System.out.println("Введите элемент, индекс которого нужно найти");
                                elementMenu = scanner.nextInt();
                                if (lists[listNumber].find(elementMenu) == -1) {
                                    System.out.println("Такого элемента нет");
                                } else {
                                    System.out.println(lists[listNumber].find(elementMenu));
                                }
                                break;
                            default:
                                System.out.println("Команда не найдена");
                                break;
                        }


                    }


                    break;
                default:
                    System.out.println("ERROR : Неверное значение");
                    break;
            }
        }
    }
}
