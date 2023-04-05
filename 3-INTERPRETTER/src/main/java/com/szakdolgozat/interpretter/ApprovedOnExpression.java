package com.szakdolgozat.interpretter;

import com.szakdolgozat.Evaluation;

public class ApprovedOnExpression implements Expression {
    @Override
    public String interpret(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        return approveState == Evaluation.approvedOn ? "approved on" : "approved off";
    }
}
