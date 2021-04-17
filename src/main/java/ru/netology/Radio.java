package ru.netology;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setUpCurrentVolume() {
        this.currentVolume++;
        if (currentVolume > maxVolume) {
            return;
        }
    }

    public void setDownCurrentVolume() {
        this.currentVolume--;
        if (currentVolume < minVolume) {
            return;
        }
    }

    public void setUpCurrentStation() {
        this.currentStation ++;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }
    }

    public void setDownCurrentStation() {
        this.currentStation --;
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        }
    }

    public int getMinStation() {

        return minStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }
}