package com.szakdolgozat.chainofresponsibility;

import com.szakdolgozat.Evaluation;

public class ApprovedOffHandler extends Handler {
    @Override
    public String handleRequest(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        if (isSuccessRequest && !isApproved && approveState == Evaluation.approvedOn) {
            return "preapproved on";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(isSuccessRequest, isApproved, approveState);
        }
        return "";
    }
}
