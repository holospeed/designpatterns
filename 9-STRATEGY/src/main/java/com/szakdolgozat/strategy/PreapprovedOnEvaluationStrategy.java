package com.szakdolgozat.strategy;

import com.szakdolgozat.Evaluation;

public class PreapprovedOnEvaluationStrategy implements IEvaluationStrategy {
    public String evaluate(boolean isApproved, Evaluation approveState) {
        if (!isApproved && approveState != Evaluation.approvedOn) {
            return "preapproved on";
        } else {
            return "preapproved off";
        }
    }
}
