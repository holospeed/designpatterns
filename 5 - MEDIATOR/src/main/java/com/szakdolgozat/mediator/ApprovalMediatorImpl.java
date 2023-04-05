package com.szakdolgozat.mediator;

import com.szakdolgozat.Evaluation;

public class ApprovalMediatorImpl implements IApprovalMediator {

    @Override
    public String getMessage(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        if (isSuccessRequest) {
            return new SuccessRequestApprovalHandler().handle(isApproved, approveState);
        } else {
            return new NotSuccessRequestApprovalHandler().handle(isApproved, approveState);
        }

    }

}
