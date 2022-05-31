package ru.netology.statistic.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevVolume.csv"})
    public void prevParamRadioVolume(int volume, int expected) {
        Radio prev = new Radio();
        prev.prevVolume(volume);
        int actual = prev.prevVolume(volume);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStation.csv"})
    public void prevParamRadioStation(int station, int expected) {
        Radio prev = new Radio();
        prev.prevStation(station);
        int actual = prev.prevStation(station);
        assertEquals(expected, actual);
    }

    @Test
    void normalParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(3);
        station.setVolumeStation(5);
        station.nextStation();
        station.nextVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();

        int expectedStation = 3;
        int expectedVolume = 5;
        int expectedNextStation = 4;
        int expectedNextVolume = 6;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void highParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(30);
        station.setVolumeStation(40);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void lowParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(-9);
        station.setVolumeStation(-10);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void granLowParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(0);
        station.setVolumeStation(0);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void granHighParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(9);
        station.setVolumeStation(10);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 9;
        int expectedVolume = 10;
        int expectedNextStation = 0;
        int expectedNextVolume = 10;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void granHighParamRadioForNextPrev() {
        Radio station = new Radio();

        station.setRadioStation(8);
        station.setVolumeStation(9);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 8;
        int expectedVolume = 9;
        int expectedNextStation = 9;
        int expectedNextVolume = 10;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void granLowParamRadioForNextPrev() {
        Radio station = new Radio();

        station.setRadioStation(1);
        station.setVolumeStation(1);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 1;
        int expectedVolume = 1;
        int expectedNextStation = 2;
        int expectedNextVolume = 2;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }

    @Test
    void granLowNegativeParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(-1);
        station.setVolumeStation(-1);
        station.nextStation();
        station.nextVolume();


        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.nextStation();
        int actualNextVolume = station.nextVolume();


        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;


        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);

    }
}
