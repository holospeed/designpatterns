package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.Observer.ApprovalState;
import com.szakdolgozat.Observer.MessageLogger;

public class App {

        private static Logger logger = Logger.getLogger("InfoLogging");

        public static void main(String[] args) {
                boolean isApproved = true;
                boolean isSuccessRequest = true;
                Evaluation approveState = Evaluation.approvedOn;
                String message;

                ApprovalState approvalState = new ApprovalState();
                MessageLogger messageLogger = new MessageLogger();
                approvalState.addObserver(messageLogger);

                approvalState.setMessage(isSuccessRequest
                                ? isApproved
                                                ? approveState == Evaluation.approvedOn
                                                                ? "approved on"
                                                                : "approved off"
                                                : approveState != Evaluation.approvedOn
                                                                ? "preapproved on"
                                                                : "preapproved off"
                                : isApproved
                                                ? "approved off"
                                                : "reproved off");

                message = messageLogger.getLog().get(0);
                logger.info(message);
        }
}
