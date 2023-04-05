package com.szakdolgozat.strategy;

import com.szakdolgozat.Evaluation;

public class ApprovedOnEvaluationStrategy implements IEvaluationStrategy {
    public String evaluate(boolean isApproved, Evaluation approveState) {
        if (isApproved && approveState == Evaluation.approvedOn) {
            return "approved on";
        } else {
            return "approved off";
        }
    }
}
