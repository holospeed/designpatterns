package com.szakdolgozat.state;

public class PreapprovedOffState implements IApprovalState {
    @Override
    public String getMessage() {
        return "preapproved off";
    }
}