package com.szakdolgozat.strategy;

import com.szakdolgozat.Evaluation;

public class PreapprovedOffEvaluationStrategy implements IEvaluationStrategy {
    public String evaluate(boolean isApproved, Evaluation approveState) {
        return "reproved off";
    }
}
