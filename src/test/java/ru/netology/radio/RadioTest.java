package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImageOp;

public class RadioTest {

    @Test
    void nextRadioStation(){
        Radio radio = new Radio();
        radio.numberOfRadioStation = 5;

        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.numberOfRadioStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void nextRadioStationIfMax(){
        Radio radio = new Radio();
        radio.numberOfRadioStation = 9;

        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.numberOfRadioStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void previousRadioStation(){
        Radio radio = new Radio();
        radio.numberOfRadioStation = 5;

        radio.previousRadioStation();
        int expected = 4;
        int actual = radio.numberOfRadioStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void previousRadioStationIfMin(){
        Radio radio = new Radio();
        radio.numberOfRadioStation = 0;

        radio.previousRadioStation();
        int expected = 9;
        int actual = radio.numberOfRadioStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStation(){
        Radio radio = new Radio();
        radio.numberOfRadioStation = 3;
        radio.setRadioStation = 2;

        radio.setRadioStation();
        int expected = radio.setRadioStation;
        int actual = radio.numberOfRadioStation;


        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStationOverLimit(){
        Radio radio = new Radio();
        radio.numberOfRadioStation = 3;
        radio.setRadioStation = 11;

        radio.setRadioStation();
        int expected = 3;
        int actual = radio.numberOfRadioStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolume(){
        Radio radio = new Radio();
        radio.volume = 20;

        radio.increaseVolume();
        int expected = 21;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeIfMax(){
        Radio radio = new Radio();
        radio.volume = 100;

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume(){
        Radio radio = new Radio();
        radio.volume = 20;

        radio.decreaseVolume();
        int expected = 19;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeIfMin(){
        Radio radio = new Radio();
        radio.volume = 0;

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }
}
