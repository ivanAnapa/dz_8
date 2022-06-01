package ru.netology.radio;

public class Radio {

    private int currentStationNumber;
    private int minStationNumber;
    private int maxStationNumber;
    private int newNumberOfStations;
    private int currentVolumeLevel;

    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
        newNumberOfStations = 10;
        maxStationNumber = newNumberOfStations - 1;
    }

    public Radio(int newNumberOfStations) {
        this.newNumberOfStations = newNumberOfStations;
        maxStationNumber = newNumberOfStations - 1;
    }


    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber++;
        }
    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber--;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentVolumeLevel(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolumeLevel = newVolume;
    }

    public void volumeUp() {
        if (currentVolumeLevel == maxVolume) {
            return;
        } else {
            currentVolumeLevel++;
        }
    }

    public void volumeDown() {
        if (currentVolumeLevel == minVolume) {
            return;
        } else {
            currentVolumeLevel--;
        }
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

}
