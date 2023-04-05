package com.szakdolgozat;

import java.util.logging.Logger;

public class App {

    private static Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        boolean isApproved = true;
        boolean isSuccessRequest = true;
        Evaluation approveState = Evaluation.approvedOn;
        String message;

        message = isSuccessRequest
                ? isApproved
                        ? approveState == Evaluation.approvedOn
                                ? "approved on"
                                : "approved off"
                        : approveState != Evaluation.approvedOn
                                ? "preapproved on"
                                : "preapproved off"
                : isApproved
                        ? "approved off"
                        : "reproved off";

        logger.info(message);
    }
}
