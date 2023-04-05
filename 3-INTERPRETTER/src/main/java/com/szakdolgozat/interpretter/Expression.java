package com.szakdolgozat.interpretter;

import com.szakdolgozat.Evaluation;

public interface Expression {
    String interpret(boolean isSuccessRequest, boolean isApproved, Evaluation approveState);
}
