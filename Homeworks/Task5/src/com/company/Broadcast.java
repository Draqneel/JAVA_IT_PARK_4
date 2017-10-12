package com.company;

import java.time.LocalTime;

public class Broadcast {

    private LocalTime begin;
    private LocalTime end;
    private String name;

    public Broadcast(LocalTime begin, LocalTime end, String name) {
        this.begin = begin;
        this.end = end;
        this.name = name;
    }

    public boolean isNow() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(begin) && now.isBefore(end)) {
            return true;
        }
        return false;
    }

    public String getVideo() {
        return name;
    }
}
