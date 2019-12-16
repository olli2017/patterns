package csc.pract_min.observer;

import java.util.ArrayList;
import java.util.List;

public class Captain implements Observable{
    List<Observer> observers = new ArrayList();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int ind = observers.indexOf(observer);
        if (ind >= 0) {
            observers.remove(ind);
        }
    }

    @Override
    public void notifyObserver(String news) {
        for (Observer obs: observers) {
            obs.getInfo(news);
        }
    }
}
