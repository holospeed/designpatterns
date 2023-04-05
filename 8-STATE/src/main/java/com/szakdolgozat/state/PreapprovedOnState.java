package com.szakdolgozat.state;

public class PreapprovedOnState implements IApprovalState {
    @Override
    public String getMessage() {
        return "preapproved on";
    }
}