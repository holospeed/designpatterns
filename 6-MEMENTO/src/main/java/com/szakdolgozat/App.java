package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.memento.ApprovalState;
import com.szakdolgozat.memento.ApprovalStateMemento;

public class App {

    private static Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        boolean isApproved = true;
        boolean isSuccessRequest = true;
        Evaluation approveState = Evaluation.approvedOn;
        String message;

        ApprovalState approvalState = new ApprovalState();
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

        ApprovalStateMemento memento = approvalState.saveStateToMemento();
        approvalState.restoreStateFromMemento(memento);
        message = approvalState.getMessage();
        logger.info(message);
    }
}
