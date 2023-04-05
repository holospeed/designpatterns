package com.szakdolgozat.mediator;

import com.szakdolgozat.Evaluation;

public interface IApprovalMediator {
    String getMessage(boolean isSuccessRequest, boolean isApproved, Evaluation approveState);
}
