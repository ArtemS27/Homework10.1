package ru.netology.radio;

public class Radio {
    private int currentNumberOfRadioStation;
    private int volume;
    private int numbersRadioStations = 10;
    private int maxNumberOfRadioStation = 9;
    private int minNumberOfRadioStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int numbersRadioStations) {
        this.numbersRadioStations = numbersRadioStations;
        maxNumberOfRadioStation = numbersRadioStations - 1;
    }

    public int getNumberOfRadioStation() {
        return currentNumberOfRadioStation;
    }

    public void setNumberOfRadioStation(int setNumberOfRadioStation) {
        if (setNumberOfRadioStation < minNumberOfRadioStation) {
            return;
        }
        if (setNumberOfRadioStation > maxNumberOfRadioStation) {
            return;
        }
        currentNumberOfRadioStation = setNumberOfRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int setVolume) {
        if (setVolume < minVolume) {
            return;
        }
        if (setVolume > maxVolume) {
            return;
        }
        volume = setVolume;
    }

    public int getMaxNumberOfRadioStation(){
        return maxNumberOfRadioStation;
    }

    public void nextRadioStation() {
        if (currentNumberOfRadioStation == maxNumberOfRadioStation) {
            currentNumberOfRadioStation = minNumberOfRadioStation;
        } else {
            currentNumberOfRadioStation++;
        }
    }

    public void previousRadioStation() {
        if (currentNumberOfRadioStation == minNumberOfRadioStation) {
            currentNumberOfRadioStation = maxNumberOfRadioStation;
        } else {
            currentNumberOfRadioStation--;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}
