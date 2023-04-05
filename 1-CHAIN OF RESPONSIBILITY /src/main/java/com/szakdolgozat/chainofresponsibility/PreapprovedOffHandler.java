package com.szakdolgozat.chainofresponsibility;

import com.szakdolgozat.Evaluation;

public class PreapprovedOffHandler extends Handler {
    @Override
    public String handleRequest(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        if (isSuccessRequest && !isApproved && approveState != Evaluation.approvedOn) {
            return "preapproved off";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(isSuccessRequest, isApproved, approveState);
        }
        return "";
    }
}
