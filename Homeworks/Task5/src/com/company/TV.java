package com.company;

public class TV {
    private Channel[] channels;
    private String model;
    private boolean turnOn;
    private int indOfCurrentChannel;

    public TV(Channel[] channels, String model) {
        this.channels = channels;
        this.model = model;
        turnOn = false;
        indOfCurrentChannel = 0;
    }

    public void turnOnOrOff() {
        if (turnOn) {
            System.out.println("ВЫКЛЮЧЕНИЕ!!!");
            turnOn = false;
        } else {
            turnOn = true;
            show();
        }
    }

    private void show() {
        if (turnOn) {
            System.out.println(channels[indOfCurrentChannel].getToShow());
        }
    }

    public void swichTo(int indOfChannnel) {
        if (turnOn) {
            indOfCurrentChannel = indOfChannnel;
            show();
        }
    }
}
