package ru.netology.statistic.domain;

public class Radio {

    private int radioStation;
    private int volumeRadio;

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

    //Следующая станция

    public int nextStation() {

        int nextStation = radioStation + 1;
        if (nextStation < 9) {
            nextStation = nextStation;
        }
        if (nextStation == 10) {
            nextStation = 0;
        }
        return nextStation;
    }

    public int nextVolume() {

        int nextVolume = volumeRadio;
        if (nextVolume < 10) {
            nextVolume = nextVolume + 1;
        }
        if (nextVolume == 10) {
            nextVolume = 10;
        }
        return nextVolume;
    }

    public int prevStation(int station) {

        int prevStation = station;


        if (prevStation <= 9 && prevStation >= -1) {
            prevStation = prevStation - 1;
        }
        if (prevStation == -1) {
            prevStation = 9;
        }

        if (prevStation > 9 || prevStation <= 0) {
            prevStation = 0;
        }

        return prevStation;
    }

    public int prevVolume(int volume) {
        int prevVolume = volume;

        if (prevVolume > 10 || prevVolume < 0) {
            prevVolume = 0;
        }

        if (prevVolume < 10 && prevVolume > 0) {
            prevVolume = prevVolume - 1;
        }

        if (prevVolume == 10) {
            prevVolume = 10;
        }
        if (prevVolume == 0) {
            prevVolume = 0;
        }
        return prevVolume;

    }

}