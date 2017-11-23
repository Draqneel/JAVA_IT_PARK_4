package com.company;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        ChickenThread thread1 = new ChickenThread();
        EggThread thread2 = new EggThread();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        for (int i =0; i<100; i++){
            System.out.println("Human");
        }

    }
}
