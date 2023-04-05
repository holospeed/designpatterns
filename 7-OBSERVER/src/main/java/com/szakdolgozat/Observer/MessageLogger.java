package com.szakdolgozat.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessageLogger implements IMessageObserver {
    private List<String> log = new ArrayList<>();

    public void logMessage(String message) {
        log.add(message);
    }

    @Override
    public void update(String message) {
        logMessage(message);
    }

    public List<String> getLog() {
        return log;
    }

}
