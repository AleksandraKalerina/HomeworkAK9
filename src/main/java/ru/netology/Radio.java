package ru.netology;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;

    public Radio(int countStation) {
        maxStation = countStation - 1;
    }

    public Radio() {
        int maxStation;
    }

    int getCurrentStation() {
        return currentStation;
    }

    int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume--;
        }
    }
}