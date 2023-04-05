package com.szakdolgozat.template;

import com.szakdolgozat.Evaluation;

public abstract class ApprovalTemplate {
    protected boolean isSuccessRequest;
    protected boolean isApproved;
    protected Evaluation approveState;

    public ApprovalTemplate(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        this.isSuccessRequest = isSuccessRequest;
        this.isApproved = isApproved;
        this.approveState = approveState;
    }

    public final String getMessage() {
        if (isSuccessRequest) {
            if (isApproved) {
                if (approveState == Evaluation.approvedOn) {
                    return getApprovedOnMessage();
                } else {
                    return getApprovedOffMessage();
                }
            } else {
                if (approveState != Evaluation.approvedOn) {
                    return getPreapprovedOnMessage();
                } else {
                    return getPreapprovedOffMessage();
                }
            }
        } else {
            if (isApproved) {
                return getApprovedOffMessage();
            } else {
                return getReprovedOffMessage();
            }
        }
    }

    protected abstract String getApprovedOnMessage();

    protected abstract String getApprovedOffMessage();

    protected abstract String getPreapprovedOnMessage();

    protected abstract String getPreapprovedOffMessage();

    protected abstract String getReprovedOffMessage();
}
