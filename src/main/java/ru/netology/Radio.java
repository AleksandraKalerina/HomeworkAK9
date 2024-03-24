package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    int getCurrentStation() {
        return currentStation;
    }

    int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }
    }
}