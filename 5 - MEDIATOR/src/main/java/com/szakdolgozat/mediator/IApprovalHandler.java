package com.szakdolgozat.mediator;

import com.szakdolgozat.Evaluation;

public interface IApprovalHandler {
    String handle(boolean isApproved, Evaluation approveState);
}
