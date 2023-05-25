package ru.netology.radio;

public class Radio {
    private int numberOfRadioStation;
    public int volume;

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public void nextRadioStation(int currentRadioStation) {
        if (currentRadioStation == 9) {
            numberOfRadioStation = 0;
        } else {
            numberOfRadioStation = currentRadioStation + 1;
        }
    }

    public void previousRadioStation(int currentRadioStation) {
        if (currentRadioStation == 0) {
            numberOfRadioStation = 9;
        } else {
            numberOfRadioStation = currentRadioStation - 1;
        }
    }

    public void setRadioStation(int setRadioStation) {
        if (setRadioStation > 9) {
            return;
        }
        if (setRadioStation < 0) {
            return;
        }
        numberOfRadioStation = setRadioStation;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
