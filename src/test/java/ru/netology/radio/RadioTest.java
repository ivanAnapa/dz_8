package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/setStationTestData.csv"})
    public void stationsSwitching(int newStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStationNumber);
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Set station should be fixed");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextStationTestData.csv"})
    public void nextStation(int newStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStationNumber);
        radio.next();
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Something wrong with 'Next' btn");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStationTestData.csv"})
    public void prevStation(int newStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStationNumber);
        radio.prev();
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Something wrong with 'Prev' btn");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/setVolumeTestData.csv"})
    public void setVolumeLevel(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(newVolume);
        Assertions.assertEquals(expected, radio.getCurrentVolumeLevel(), "Volume regulator is broken");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/volumeUpTestData.csv"})
    public void volumeUp(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(newVolume);
        radio.volumeUp();
        Assertions.assertEquals(expected, radio.getCurrentVolumeLevel(), "'Volume Up' btn is broken");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/volumeDownTestData.csv"})
    public void volumeDown(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(newVolume);
        radio.volumeDown();
        Assertions.assertEquals(expected, radio.getCurrentVolumeLevel(), "'Volume Down' btn is broken");
    }

}
