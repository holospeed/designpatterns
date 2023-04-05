package com.szakdolgozat.chainofresponsibility;

import com.szakdolgozat.Evaluation;

public class ReprovedOffHandler extends Handler {
    @Override
    public String handleRequest(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        if (!isSuccessRequest && !isApproved) {
            return "reproved off";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(isSuccessRequest, isApproved, approveState);
        }
        return "";
    }
}
