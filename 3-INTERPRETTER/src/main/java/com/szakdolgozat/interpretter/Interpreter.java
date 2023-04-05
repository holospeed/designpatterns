package com.szakdolgozat.interpretter;

import com.szakdolgozat.Evaluation;

public class Interpreter {
    private final Expression approvedOn;
    private final Expression preApprovedOn;
    private final Expression notApproved;

    public Interpreter() {
        approvedOn = new ApprovedOnExpression();
        preApprovedOn = new PreApprovedOnExpression();
        notApproved = new NotApprovedExpression();
    }

    public String interpret(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        if (isSuccessRequest) {
            if (isApproved) {
                return approvedOn.interpret(isSuccessRequest, isApproved, approveState);
            } else {
                return preApprovedOn.interpret(isSuccessRequest, isApproved, approveState);
            }
        } else {
            return notApproved.interpret(isSuccessRequest, isApproved, approveState);
        }
    }
}
