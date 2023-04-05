package com.szakdolgozat.interpretter;

import com.szakdolgozat.Evaluation;

public class NotApprovedExpression implements Expression {
    @Override
    public String interpret(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        return isApproved ? "approved off" : "reproved off";
    }
}
