package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();


    @Test
    public void setCurrentStationValid() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setStationOverMax() {
        radio.setCurrentStation(11);
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void setStationUnderMin() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setUpCurrentStationValid() {
        radio.setCurrentStation(6);
        radio.setUpCurrentStation();
        assertEquals(7, radio.getCurrentStation());

    }

    @Test
    public void setUpCurrentStationOver() {
        radio.setCurrentStation(10);
        radio.setUpCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setDownCurrentStationValid() {
        radio.setCurrentStation(8);
        radio.setDownCurrentStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void setDownCurrentStationUnder() {
        radio.setCurrentStation(0);
        radio.setDownCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolumeValid() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMax() {
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void setCurrentVolumeUnderMin() {
        radio.setCurrentVolume(-12);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setUpCurrentVolumeValid() {
        radio.setCurrentVolume(5);
        radio.setUpCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void setUpCurrentVolumeOverMax() {
        radio.setCurrentVolume(10);
        radio.setUpCurrentVolume();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void setDownCurrentVolumeValid() {
        radio.setCurrentVolume(3);
        radio.setDownCurrentVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void setDownСurrentVolumeUnderMin() {
        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();
        assertEquals(0, radio.getMinVolume());
    }

}