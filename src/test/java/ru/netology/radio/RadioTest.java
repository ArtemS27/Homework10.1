package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStationIfMax() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(9);

        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void previousRadioStation() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(5);
        radio.previousRadioStation();

        int expected = 4;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void previousRadioStationIfMin() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(0);

        radio.previousRadioStation();
        int expected = 9;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStation() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(2);

        int expected = 2;
        int actual = radio.getNumberOfRadioStation();


        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStationOverMaxLimit() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStationOverMinLimit() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(-3);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolume(){
        Radio radio = new Radio();

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeIfMax(){
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume(){
        Radio radio = new Radio();
        radio.setVolume(20);

        radio.decreaseVolume();
        int expected = 19;
        int actual = radio.getVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeIfMin(){
        Radio radio = new Radio();

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeOverMinLimit(){
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeOverMaxLimit(){
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(actual, expected);
    }
}
