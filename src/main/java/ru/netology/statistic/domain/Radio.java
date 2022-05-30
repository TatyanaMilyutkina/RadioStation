package ru.netology.statistic.domain;

public class Radio {

    //Запоминаем номер станции

    private int radioStation;

    public void setRadioStation(int numStation) {

        if (numStation > 9) {
            return;
        }

        if (numStation < 0) {
            return;
        }
        radioStation = numStation;
    }

    public int getRadioStation() {
        return radioStation;
    }

    //Следующая станция

    private int nextStation;

    public void setNextStation() {

        nextStation = radioStation;
        if (nextStation < 9 && nextStation >= 0) {
            nextStation = nextStation + 1;
        }
        if (nextStation == 9) {
            nextStation = 0;
        }
    }

    public int getNextStation() {
        return nextStation;
    }

    //Предыдущая станция

    private int prevStation;

    public void setPrevStation() {
        prevStation = radioStation - 1;

        if (prevStation <= 9 && prevStation > 0) {
            return;
        }
        if (prevStation == -1) {
            prevStation = 9;
        }
    }

    public int getPrevStation() {
        return prevStation;
    }

    private int volumeRadio;

    public void setVolumeStation(int numVolume) {
        if (numVolume > 10) {
            return;
        }
        if (numVolume < 0) {
            return;
        }
        volumeRadio = numVolume;
    }

    public int getVolumeStation() {
        return volumeRadio;
    }

    private int nextVolume;

    public void setNextVolume() {

        nextVolume = volumeRadio;
        if (nextVolume < 10 && nextVolume >= 0) {
            nextVolume = nextVolume + 1;
        }
        if (nextVolume == 10) {
            nextVolume = 0;
        }
    }

    public int getNextVolume() {
        return nextVolume;
    }

    private int prevVolume;

    public void setPrevVolume() {
        prevVolume = volumeRadio -1;

        if (prevVolume <= 10 && prevVolume > 0) {
            return;
        }
        if (prevVolume == -1) {
            prevVolume = 10;
        }
    }

    public int getPrevVolume() {
        return prevVolume;
    }
}