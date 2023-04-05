package com.szakdolgozat.memento;

public class ApprovalState {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public ApprovalStateMemento saveStateToMemento() {
        return new ApprovalStateMemento(message);
    }

    public void restoreStateFromMemento(ApprovalStateMemento memento) {
        message = memento.getMessage();
    }

    public String getMessage() {
        return message;
    }
}
