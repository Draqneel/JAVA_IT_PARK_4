package com.company;

public class TVRemote {
    private TV tvToControl;

    public TVRemote(TV tvToControl) {
        this.tvToControl = tvToControl;
    }

    public void showAppearens() {
        System.out.println("Какую кнопку на пульте нажать?\n" +
                " 0 - кнопка включения/выключения\n" +
                " 1 - канал №1\n" +
                " 2 - канал №2\n" +
                " 3 - канал №3");
    }

    public boolean pushButton(int button) {
        switch (button) {
            case 0:
                tvToControl.turnOnOrOff();
                break;
            case 1:
                tvToControl.swichTo(0);
                break;
            case 2:
                tvToControl.swichTo(1);
                break;
            case 3:
                tvToControl.swichTo(2);
                break;
            default:
                System.out.println("Пальцами по кнопкам попадай!");
        }
        return false;
    }
}
