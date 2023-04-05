package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.iterator.ApprovalMessage;

public class App {

    private static Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        boolean isApproved = true;
        boolean isSuccessRequest = true;
        Evaluation approveState = Evaluation.approvedOn;
        String message;

        ApprovalMessage approvalMessage = new ApprovalMessage(isSuccessRequest, isApproved, approveState);
        message = approvalMessage.getMessage();

        logger.info(message);
    }
}
