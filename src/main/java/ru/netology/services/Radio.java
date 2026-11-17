package ru.netology.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Radio {
    // Количество радиостанций по умолчанию 10
    private int stationsCount = 10;
    private int currentStation;
    private int currentVolume;

    // Конструктор с параметром (Задание 1)
    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
        this.currentStation = 0;
    }

    // Сеттер станции пишем вручную, так как здесь нужна логика проверки границ
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation >= stationsCount) {
            return;
        }
        this.currentStation = currentStation;
    }

    // Сеттер громкости тоже с проверкой от 0 до 100
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Методы переключения (next, prev, increaseVolume, decreaseVolume)
    // пишем вручную, так как это бизнес-логика, которую аннотации не знают.
    public void next() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}