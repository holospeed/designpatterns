package com.szakdolgozat.state;

public class Message {
    private IApprovalState approvalState;

    public Message() {
        approvalState = new ApprovedOffState();
    }

    public void setApprovalState(IApprovalState approvalState) {
        this.approvalState = approvalState;
    }

    public String getMessage() {
        return approvalState.getMessage();
    }
}