package com.szakdolgozat.memento;

public class ApprovalStateMemento {
    private String message;

    public ApprovalStateMemento(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
