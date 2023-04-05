package com.szakdolgozat.state;

public class ApprovedOffState implements IApprovalState {
    @Override
    public String getMessage() {
        return "approved off";
    }
}