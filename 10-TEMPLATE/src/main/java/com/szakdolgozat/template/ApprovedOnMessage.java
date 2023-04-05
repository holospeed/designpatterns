package com.szakdolgozat.template;

import com.szakdolgozat.Evaluation;

public class ApprovedOnMessage extends ApprovalTemplate {
    public ApprovedOnMessage(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        super(isSuccessRequest, isApproved, approveState);
    }

    protected String getApprovedOnMessage() {
        return "approved on";
    }

    protected String getApprovedOffMessage() {
        return "approved off";
    }

    protected String getPreapprovedOnMessage() {
        return "preapproved on";
    }

    protected String getPreapprovedOffMessage() {
        return "preapproved off";
    }

    protected String getReprovedOffMessage() {
        return "reproved off";
    }
}
