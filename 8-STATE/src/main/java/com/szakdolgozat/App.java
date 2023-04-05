package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.state.ApprovedOffState;
import com.szakdolgozat.state.ApprovedOnState;
import com.szakdolgozat.state.Message;
import com.szakdolgozat.state.PreapprovedOffState;
import com.szakdolgozat.state.PreapprovedOnState;
import com.szakdolgozat.state.ReprovedOffState;

public class App {

        private static Logger logger = Logger.getLogger("InfoLogging");

        public static void main(String[] args) {
                boolean isApproved = true;
                boolean isSuccessRequest = true;
                Evaluation approveState = Evaluation.approvedOn;
                String message;

                Message m = new Message();
                if (isSuccessRequest) {
                        if (isApproved) {
                                if (approveState == Evaluation.approvedOn) {
                                        m.setApprovalState(new ApprovedOnState());
                                } else {
                                        m.setApprovalState(new ApprovedOffState());
                                }
                        } else {
                                if (approveState != Evaluation.approvedOn) {
                                        m.setApprovalState(new PreapprovedOnState());
                                } else {
                                        m.setApprovalState(new PreapprovedOffState());
                                }
                        }
                } else {
                        if (isApproved) {
                                m.setApprovalState(new ApprovedOffState());
                        } else {
                                m.setApprovalState(new ReprovedOffState());
                        }
                }

                message = m.getMessage();

                logger.info(message);
        }
}
