package com.szakdolgozat.strategy;

import com.szakdolgozat.Evaluation;

public class ApprovedOffEvaluationStrategy implements IEvaluationStrategy {
    public String evaluate(boolean isApproved, Evaluation approveState) {
        return "approved off";
    }
}
