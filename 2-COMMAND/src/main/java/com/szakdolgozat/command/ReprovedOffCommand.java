package com.szakdolgozat.command;

public class ReprovedOffCommand implements ICommand {
    private final boolean isSuccessRequest;
    private final boolean isApproved;

    public ReprovedOffCommand(boolean isSuccessRequest, boolean isApproved) {
        this.isSuccessRequest = isSuccessRequest;
        this.isApproved = isApproved;
    }

    @Override
    public String execute() {
        return !isSuccessRequest && !isApproved ? "reproved off" : "";
    }
}
