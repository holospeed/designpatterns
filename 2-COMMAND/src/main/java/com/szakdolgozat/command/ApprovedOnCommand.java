package com.szakdolgozat.command;

import com.szakdolgozat.Evaluation;

public class ApprovedOnCommand implements ICommand {
    private final boolean isSuccessRequest;
    private final boolean isApproved;
    private final Evaluation approveState;

    public ApprovedOnCommand(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        this.isSuccessRequest = isSuccessRequest;
        this.isApproved = isApproved;
        this.approveState = approveState;
    }

    @Override
    public String execute() {
        return isSuccessRequest && isApproved && approveState == Evaluation.approvedOn ? "approved on" : "";
    }
}
