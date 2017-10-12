package com.company;

public class Channel {

    private String name;
    private Broadcast[] broadcasts;

    public Channel(Broadcast[] broadcasts, String name) {
        this.broadcasts = broadcasts;
        this.name = name;
    }

    public String getToShow() {
        for (int i = 0; i < broadcasts.length; i++) {
            if (broadcasts[i].isNow()) {
                return "Канал - " + name + "\nПередача - " + broadcasts[i].getVideo();
            }
        }
        return "";
    }
}