package ru.netology.statistic.domain;

public class Radio {

    private int maxRadioStation = 10;
    private int minRadioStation;
    private int currentStation;
    private int countStation = 10;
    private int maxVolumeRadio = 100;
    private int minVolumeRadio;
    private int currentVolumeRadio;

    public Radio(int countStation) {
        this.maxRadioStation = countStation;
        maxRadioStation = maxRadioStation - 1;
    }

    public Radio() {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation - 1;
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        this.currentStation = currentStation;
        return currentStation;
    }

    public void setRadioStation(int numStation) {

        if (numStation > maxRadioStation) {
            return;
        }

        if (numStation < 0) {
            return;
        }

        currentStation = numStation;

    }

    public int getRadioStation() {
        return currentStation;
    }

    public void setVolumeStation(int numVolume) {
        if (numVolume > maxVolumeRadio) {
            return;
        }
        if (numVolume < 0) {
            return;
        }
        currentVolumeRadio = numVolume;
    }

    public int getVolumeStation() {
        return currentVolumeRadio;
    }


    public int nextStation(int numStation) {

        int nextStation = numStation + 1;
        if (nextStation < maxRadioStation) {
            nextStation = nextStation;
        }
        if (nextStation > maxRadioStation) {
            nextStation = 0;
        }
        if (nextStation == maxRadioStation) {
            nextStation = 0;
        }
        return nextStation;
    }

    public int nextVolume(int volume) {

        int nextVolume = volume;
        if (nextVolume < maxVolumeRadio) {
            nextVolume = nextVolume + 1;
        }
        if (nextVolume == maxVolumeRadio) {
            nextVolume = maxVolumeRadio;
        }
        return nextVolume;
    }

    public int prevStation(int station) {
        int prevStation = station;


        if (prevStation <= maxRadioStation && prevStation >= -1) {
            prevStation = prevStation - 1;
        }
        if (prevStation == -1) {
            prevStation = maxRadioStation;
        }

        if (prevStation > maxRadioStation || prevStation <= 0) {
            prevStation = 0;
        }

        return prevStation;
    }


    public int prevVolume(int volume) {
        int prevVolume = volume;

        if (prevVolume > maxVolumeRadio || prevVolume < 0) {
            prevVolume = 0;
        }

        if (prevVolume < maxVolumeRadio && prevVolume > 0) {
            prevVolume = prevVolume - 1;
        }

        if (prevVolume == maxVolumeRadio) {
            prevVolume = maxVolumeRadio;
        }
        if (prevVolume == 0) {
            prevVolume = 0;
        }
        return prevVolume;

    }
}