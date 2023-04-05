package com.szakdolgozat.state;

public class ReprovedOffState implements IApprovalState {
    @Override
    public String getMessage() {
        return "reproved off";
    }
}