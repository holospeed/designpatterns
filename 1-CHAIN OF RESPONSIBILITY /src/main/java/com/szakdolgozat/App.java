package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.chainofresponsibility.RequestHandler;

public class App {

    private static Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        boolean isApproved = true;
        boolean isSuccessRequest = true;
        Evaluation approveState = Evaluation.approvedOn;
        String message;

        RequestHandler requestHandler = new RequestHandler();

        message = requestHandler.handleRequest(isSuccessRequest, isApproved, approveState);

        logger.info(message);
    }
}
