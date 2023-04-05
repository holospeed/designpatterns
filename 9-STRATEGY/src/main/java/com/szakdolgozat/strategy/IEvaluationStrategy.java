package com.szakdolgozat.strategy;

import com.szakdolgozat.Evaluation;

public interface IEvaluationStrategy {
    String evaluate(boolean isApproved, Evaluation approveState);
}
