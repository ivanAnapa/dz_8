package ru.netology.radio;

public class Radio {

    private int currentStationNumber;
    private int currentVolumeLevel;

    public void setStation(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void next() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else currentStationNumber++;
    }

    public void prev() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else currentStationNumber--;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolumeLevel = newVolume;
    }

    public void volumeUp() {
        if (currentVolumeLevel == 10) {
            return;
        }
        else currentVolumeLevel++;
    }

    public void volumeDown() {
        if (currentVolumeLevel == 0) {
            return;
        }
        else currentVolumeLevel--;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

}
