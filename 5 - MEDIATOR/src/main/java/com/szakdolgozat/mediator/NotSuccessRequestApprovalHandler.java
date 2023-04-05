package com.szakdolgozat.mediator;

import com.szakdolgozat.Evaluation;

public class NotSuccessRequestApprovalHandler implements IApprovalHandler {

    @Override
    public String handle(boolean isApproved, Evaluation approveState) {
        return isApproved ? "approved off" : "reproved off";
    }

}
