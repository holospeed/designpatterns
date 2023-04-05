package com.szakdolgozat.Observer;

import java.util.ArrayList;
import java.util.List;

public class ApprovalState implements IMessageObserver {

    private List<IMessageObserver> observers = new ArrayList<>();
    private String message;

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void addObserver(IMessageObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IMessageObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (IMessageObserver observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void update(String message) {
        // Do nothing, since ApprovalState doesn't observe any other objects
    }

}
