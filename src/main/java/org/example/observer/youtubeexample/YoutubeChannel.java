package org.example.observer.youtubeexample;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void releaseNewVideo(String videoName){
        System.out.println("releas new vide" + videoName);
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.udpate();
        }
    }
}
