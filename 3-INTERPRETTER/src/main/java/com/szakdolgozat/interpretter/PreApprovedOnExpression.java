package com.szakdolgozat.interpretter;

import com.szakdolgozat.Evaluation;

public class PreApprovedOnExpression implements Expression {
    @Override
    public String interpret(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        return approveState != Evaluation.approvedOn ? "preapproved on" : "preapproved off";
    }
}
