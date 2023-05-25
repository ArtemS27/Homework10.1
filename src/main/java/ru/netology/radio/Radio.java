package ru.netology.radio;
public class Radio {
    public int numberOfRadioStation;
    public int setRadioStation;
    public int volume;

    public void nextRadioStation(){
        if(numberOfRadioStation == 9){
            numberOfRadioStation = 0;
        } else {
            numberOfRadioStation ++;
        }
    }
    public void previousRadioStation(){
        if(numberOfRadioStation == 0){
            numberOfRadioStation = 9;
        } else {
          numberOfRadioStation --;
        }
    }

    public void setRadioStation(){
        if(setRadioStation <= 9 && setRadioStation >= 0) {
            numberOfRadioStation = setRadioStation;
        }
    }

    public void increaseVolume(){
        if(volume < 100){
            volume++;
        }
    }

    public void decreaseVolume(){
        if(volume > 0){
            volume--;
        }
    }
}
