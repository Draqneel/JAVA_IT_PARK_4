package com.company;

public class NewThrow implements Runnable {
    String throwName;

    NewThrow (String throwName){
        this.throwName = throwName;
    }

    @Override
    public void run() {
        for (int i = 0; i<9; i++){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException();
            }
            System.out.println(throwName + " time to activate main thread " + (i+1));

        }
    }
}
