package com.szakdolgozat.chainofresponsibility;

import com.szakdolgozat.Evaluation;

public class RequestHandler {
    private Handler rootHandler;

    public RequestHandler() {
        rootHandler = new ApprovedOnHandler();

        Handler approvedOffHandler = new ApprovedOffHandler();
        Handler preapprovedOnHandler = new PreapprovedOnHandler();
        Handler preapprovedOffHandler = new PreapprovedOffHandler();
        Handler reprovedOffHandler = new ReprovedOffHandler();

        rootHandler.setNextHandler(approvedOffHandler);
        rootHandler.setNextHandler(preapprovedOnHandler);
        rootHandler.setNextHandler(preapprovedOffHandler);
        rootHandler.setNextHandler(reprovedOffHandler);

    }

    public String handleRequest(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        return rootHandler.handleRequest(isSuccessRequest, isApproved, approveState);
    }

}
