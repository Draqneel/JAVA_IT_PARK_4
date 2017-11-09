package com.company;


public class Main {

    public static void main(String[] args) {
            DataReader dataReader = new DataReader("C:\\Users\\Draqneel\\Desktop\\JAVA_IT_PARK_4\\Homeworks\\Task11\\src\\com\\company\\file.txt");

            ArrayList<LinkedList<Human>> lists = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                lists.add(new LinkedList<Human>());
            }

            String currentName = dataReader.readString();
            int currentAge = dataReader.readInteger();
            while (!currentName.equals("")) {
                lists.get(currentAge).add(new Human(currentAge, currentName));
                currentName = dataReader.readString();
                currentAge = dataReader.readInteger();
            }


            for (int i = 0; i < 100; i++) {
                if (lists.get(i).size() != 0) {
                    Iterator iterator = lists.get(i).iterator();
                    while (iterator.hasNext()) {
                        System.out.print(iterator.next());
                    }
                    System.out.println();
                }
            }





        }
}


/*
1)Написать алгоритм добавления имён людям (++)
2)Протестить алгоритм на выводе массива людей (++)
3)Написать ArrayList (++)
4)Связать ArrayList с LinkedList (++)
5)Разобраться с итераторами ()
6)Продакшн, друзья! ()
 */