package ru.netology.radio;

public class Radio {
    private int numberOfRadioStation;
    private int volume;

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public void setNumberOfRadioStation(int setNumberOfRadioStation) {
        if(setNumberOfRadioStation < 0){
            return;
        }
        if(setNumberOfRadioStation > 9){
            return;
        }
        numberOfRadioStation = setNumberOfRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int setVolume){
        if(setVolume < 0){
            return;
        }
        if(setVolume > 100){
            return;
        }
        volume = setVolume;
    }

    public void nextRadioStation() {
        if (numberOfRadioStation == 9) {
            numberOfRadioStation = 0;
        } else {
            numberOfRadioStation++;
        }
    }

    public void previousRadioStation() {
        if (numberOfRadioStation == 0) {
            numberOfRadioStation = 9;
        } else {
            numberOfRadioStation--;
        }
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
