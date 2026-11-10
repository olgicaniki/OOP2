package ru.netology.services;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //station actions
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //переключить на следующую станцию
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    //переключить на предыдущую станцию
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    //volume actions
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //увеличить громкость
    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume++;
        }
    }

    //уменьшить громкость
    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }
    }
}