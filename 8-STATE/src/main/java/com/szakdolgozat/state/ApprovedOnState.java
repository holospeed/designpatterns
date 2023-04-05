package com.szakdolgozat.state;

public class ApprovedOnState implements IApprovalState {
    @Override
    public String getMessage() {
        return "approved on";
    }
}