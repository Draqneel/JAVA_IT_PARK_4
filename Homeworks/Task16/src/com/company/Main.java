package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        NewThrow newThrow = new NewThrow("BabyThrow");
	Thread thread = new Thread(newThrow);
	thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new IllegalArgumentException();
        }
        System.out.println("Main thread ended");
    }
}
