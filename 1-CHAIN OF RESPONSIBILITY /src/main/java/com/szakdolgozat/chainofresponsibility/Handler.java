package com.szakdolgozat.chainofresponsibility;

import com.szakdolgozat.Evaluation;

public abstract class Handler {
    Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract String handleRequest(boolean isSuccessRequest, boolean isApproved, Evaluation approveState);

}
