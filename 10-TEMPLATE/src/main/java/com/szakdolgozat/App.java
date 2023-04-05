package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.template.ApprovalTemplate;
import com.szakdolgozat.template.ApprovedOnMessage;

public class App {

        private static Logger logger = Logger.getLogger("InfoLogging");

        public static void main(String[] args) {
                boolean isApproved = true;
                boolean isSuccessRequest = true;
                Evaluation approveState = Evaluation.approvedOn;
                String message;

                ApprovalTemplate approvedOnMessage = new ApprovedOnMessage(isSuccessRequest, isApproved, approveState);
                message = approvedOnMessage.getMessage();
                logger.info(message);
        }
}
