package com.szakdolgozat.mediator;

import com.szakdolgozat.Evaluation;

public class SuccessRequestApprovalHandler implements IApprovalHandler {
    @Override
    public String handle(boolean isApproved, Evaluation approveState) {
        if (isApproved) {
            return approveState == Evaluation.approvedOn ? "approved on" : "approved off";
        } else {
            return approveState != Evaluation.approvedOn ? "preapproved on" : "preapproved off";
        }
    }
}
