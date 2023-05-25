package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImageOp;

public class RadioTest {

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation(5);

        int expected = 6;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void nextRadioStationIfMax() {
        Radio radio = new Radio();
        radio.nextRadioStation(9);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void previousRadioStation() {
        Radio radio = new Radio();
        radio.previousRadioStation(5);

        int expected = 4;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void previousRadioStationIfMin() {
        Radio radio = new Radio();
        radio.previousRadioStation(0);

        int expected = 9;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(2);

        int expected = 2;
        int actual = radio.getNumberOfRadioStation();


        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStationOverMaxLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setRadioStationOverMinLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(-3);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.volume = 20;

        radio.increaseVolume();
        int expected = 21;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeIfMax() {
        Radio radio = new Radio();
        radio.volume = 100;

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 20;

        radio.decreaseVolume();
        int expected = 19;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.volume = 0;

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(actual, expected);
    }
}
