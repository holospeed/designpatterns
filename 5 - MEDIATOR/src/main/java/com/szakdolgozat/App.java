package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.mediator.ApprovalMediatorImpl;

public class App {

    private static Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        boolean isApproved = true;
        boolean isSuccessRequest = true;
        Evaluation approveState = Evaluation.approvedOn;
        String message;

        ApprovalMediatorImpl mediator = new ApprovalMediatorImpl();
        message = mediator.getMessage(isSuccessRequest, isApproved, approveState);

        logger.info(message);
    }
}
