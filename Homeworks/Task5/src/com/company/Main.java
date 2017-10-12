package com.company;

import java.util.Scanner;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Channel[] channels = new Channel[3];

        Broadcast[] broadcastsTNT = new Broadcast[3];
        channels[0] = new Channel(broadcastsTNT, "ТНТ");
        broadcastsTNT[2] = new Broadcast(LocalTime.parse("00:00"), LocalTime.parse("12:00"), "Музыкальные клипы");
        broadcastsTNT[0] = new Broadcast(LocalTime.parse("12:00"), LocalTime.parse("20:00"), "Камеди клаб");
        broadcastsTNT[1] = new Broadcast(LocalTime.parse("20:00"), LocalTime.parse("23:59"), "Дом 2");

        Broadcast[] broadcasts1 = new Broadcast[3];
        channels[1] = new Channel(broadcasts1, "Первый");
        broadcasts1[0] = new Broadcast(LocalTime.parse("00:00"), LocalTime.parse("21:00"), "Как хорошо жить в Росии");
        broadcasts1[1] = new Broadcast(LocalTime.parse("21:00"), LocalTime.parse("21:40"), "Врямя");
        broadcasts1[2] = new Broadcast(LocalTime.parse("21:40"), LocalTime.parse("23:59"), "Ментовские сериалы");

        Broadcast[] broadcastsRenTV = new Broadcast[3];
        channels[2] = new Channel(broadcastsRenTV, "RenTV");
        broadcastsRenTV[0] = new Broadcast(LocalTime.parse("00:00"), LocalTime.parse("12:00"), "Необъяснимо но факт");
        broadcastsRenTV[1] = new Broadcast(LocalTime.parse("12:00"), LocalTime.parse("18:00"), "Тайное мировое правитильство");
        broadcastsRenTV[2] = new Broadcast(LocalTime.parse("18:00"), LocalTime.parse("23:59"), "Инопланетяне среди нас");

        //создаем хардвер
        TV tv = new TV(channels, "Samsung");
        TVRemote remote = new TVRemote(tv);
        remote.showAppearens();

        //действия пользователя
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Нажать на кнопку: ");
            remote.pushButton(scanner.nextInt());
        }
    }
}