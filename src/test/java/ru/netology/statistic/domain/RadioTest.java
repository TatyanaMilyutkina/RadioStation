package ru.netology.statistic.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    void normalParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(3);
        station.setVolumeStation(5);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 3;
        int expectedVolume = 5;
        int expectedNextStation = 4;
        int expectedNextVolume = 6;
        int expectedPrevStation = 2;
        int expectedPrevVolume = 4;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }

    @Test
    void highParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(30);
        station.setVolumeStation(40);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;
        int expectedPrevStation = 9;
        int expectedPrevVolume = 10;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }

    @Test
    void lowParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(-9);
        station.setVolumeStation(-10);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;
        int expectedPrevStation = 9;
        int expectedPrevVolume = 10;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }

    @Test
    void granLowParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(0);
        station.setVolumeStation(0);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 0;
        int expectedVolume = 0;
        int expectedNextStation = 1;
        int expectedNextVolume = 1;
        int expectedPrevStation = 9;
        int expectedPrevVolume = 10;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }

    @Test
    void granHighParamRadio() {
        Radio station = new Radio();

        station.setRadioStation(9);
        station.setVolumeStation(10);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 9;
        int expectedVolume = 10;
        int expectedNextStation = 0;
        int expectedNextVolume = 0;
        int expectedPrevStation = 8;
        int expectedPrevVolume = 9;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }

    @Test
    void granHighParamRadioForNextPrev() {
        Radio station = new Radio();

        station.setRadioStation(8);
        station.setVolumeStation(9);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 8;
        int expectedVolume = 9;
        int expectedNextStation = 0;
        int expectedNextVolume = 0;
        int expectedPrevStation = 7;
        int expectedPrevVolume = 8;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }

    @Test
    void granLowParamRadioForNextPrev() {
        Radio station = new Radio();

        station.setRadioStation(1);
        station.setVolumeStation(1);
        station.setNextStation();
        station.setNextVolume();
        station.setPrevStation();
        station.setPrevVolume();

        int actualStation = station.getRadioStation();
        int actualVolume = station.getVolumeStation();
        int actualNextStation = station.getNextStation();
        int actualNextVolume = station.getNextVolume();
        int actualPrevStation = station.getPrevStation();
        int actualPrevVolume = station.getPrevVolume();

        int expectedStation = 1;
        int expectedVolume = 1;
        int expectedNextStation = 2;
        int expectedNextVolume = 2;
        int expectedPrevStation = 0;
        int expectedPrevVolume = 0;

        assertEquals(expectedStation, actualStation);
        assertEquals(expectedVolume, actualVolume);
        assertEquals(expectedNextStation, actualNextStation);
        assertEquals(expectedNextVolume, actualNextVolume);
        assertEquals(expectedPrevStation, actualPrevStation);
        assertEquals(expectedPrevVolume, actualPrevVolume);
    }
}
