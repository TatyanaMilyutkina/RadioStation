package ru.netology.statistic.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStation.csv"})
    public void prevParamRadioStation(int station, int expected) {
        Radio prev = new Radio();
        prev.prevStation(station);
        int actual = prev.prevStation(station);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevCountStation.csv"})
    public void prevCountParamRadioStation(int station, int expected, int maxCountStation) {
        Radio prev = new Radio(maxCountStation);
        prev.prevStation(station);
        int actual = prev.prevStation(station);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/numStation.csv"})
    public void numParamRadioStation(int station, int expected) {
        Radio num = new Radio();
        num.setRadioStation(station);
        int actual = num.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/numCountStation.csv"})
    public void numCountParamRadioStation(int station, int expected, int maxCountStation) {
        Radio numCount = new Radio(maxCountStation);
        numCount.setRadioStation(station);
        int actual = numCount.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextStation.csv"})
    public void nextParamRadioStation(int station, int expected) {
        Radio next = new Radio();
        next.nextStation(station);
        int actual = next.nextStation(station);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextCountStation.csv"})
    public void nextCountParamRadioStation(int station, int expected, int maxCountStation) {
        Radio next = new Radio(maxCountStation);
        next.nextStation(station);
        int actual = next.nextStation(station);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevVolume.csv"})
    public void prevParamRadioVolume(int volume, int expected) {
        Radio prev = new Radio();
        prev.prevVolume(volume);
        int actual = prev.prevVolume(volume);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/numVolume.csv"})
    public void numParamRadioVolume(int volume, int expected) {
        Radio num = new Radio();
        num.setVolumeStation(volume);
        int actual = num.getVolumeStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextVolume.csv"})
    public void nextParamRadioVolume(int volume, int expected) {
        Radio next = new Radio();
        next.nextVolume(volume);
        int actual = next.nextVolume(volume);
        assertEquals(expected, actual);
    }
}