package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    // 1. Tests with default number of stations: set station
    @ParameterizedTest
    @CsvFileSource(resources = {"/setStationTestData.csv"})
    public void stationsSwitching(int currentStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(currentStationNumber);
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Set station should be fixed");
    }

    // 2. Tests with changed number of stations: set station
    @ParameterizedTest
    @CsvFileSource(resources = {"/setStationTestData (Updated Radio).csv"})
    public void updatedRadioStationsSwitching(int newNumberOfStations, int currentStationNumber, int expected) {
        Radio radio = new Radio(newNumberOfStations);
        radio.setCurrentStationNumber(currentStationNumber);
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Set station should be fixed");
    }

    // 3. Tests with default number of stations: press "Next station" button
    @ParameterizedTest
    @CsvFileSource(resources = {"/nextStationTestData.csv"})
    public void nextStation(int currentStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(currentStationNumber);
        radio.next();
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Something wrong with 'Next' btn");
    }

    // 4. Tests with changed number of stations: press "Next station" button
    @ParameterizedTest
    @CsvFileSource(resources = {"/nextStationTestData (Updated radio).csv"})
    public void nextStationUpdRadio(int newNumberOfStations, int currentStationNumber, int expected) {
        Radio radio = new Radio(newNumberOfStations);
        radio.setCurrentStationNumber(currentStationNumber);
        radio.next();
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Something wrong with 'Next' btn");
    }

    // 5. Tests with default number of stations: press "Previous station" button
    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStationTestData.csv"})
    public void prevStation(int newStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(newStationNumber);
        radio.prev();
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Something wrong with 'Prev' btn");
    }

    // 6. Tests with changed number of stations: press "Previous station" button
    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStationTestData (Updated radio).csv"})
    public void prevStationUpdRadio(int newNumberOfStations, int newStationNumber, int expected) {
        Radio radio = new Radio(newNumberOfStations);
        radio.setCurrentStationNumber(newStationNumber);
        radio.prev();
        Assertions.assertEquals(expected, radio.getCurrentStationNumber(), "Something wrong with 'Prev' btn");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/setVolumeTestData.csv"})
    public void setVolumeLevel(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(newVolume);
        Assertions.assertEquals(expected, radio.getCurrentVolumeLevel(), "Volume regulator is broken");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/volumeUpTestData.csv"})
    public void volumeUp(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(newVolume);
        radio.volumeUp();
        Assertions.assertEquals(expected, radio.getCurrentVolumeLevel(), "'Volume Up' btn is broken");
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/volumeDownTestData.csv"})
    public void volumeDown(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(newVolume);
        radio.volumeDown();
        Assertions.assertEquals(expected, radio.getCurrentVolumeLevel(), "'Volume Down' btn is broken");
    }

}
