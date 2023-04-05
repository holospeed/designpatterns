package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.strategy.ApprovedOffEvaluationStrategy;
import com.szakdolgozat.strategy.ApprovedOnEvaluationStrategy;
import com.szakdolgozat.strategy.IEvaluationStrategy;
import com.szakdolgozat.strategy.PreapprovedOffEvaluationStrategy;
import com.szakdolgozat.strategy.PreapprovedOnEvaluationStrategy;

public class App {

        private static Logger logger = Logger.getLogger("InfoLogging");

        public static void main(String[] args) {
                boolean isApproved = true;
                boolean isSuccessRequest = true;
                Evaluation approveState = Evaluation.approvedOn;
                String message;

                IEvaluationStrategy evaluationStrategy;
                if (isSuccessRequest && isApproved) {
                        evaluationStrategy = new ApprovedOnEvaluationStrategy();
                } else if (isSuccessRequest && !isApproved) {
                        evaluationStrategy = new PreapprovedOnEvaluationStrategy();
                } else if (!isSuccessRequest && isApproved) {
                        evaluationStrategy = new ApprovedOffEvaluationStrategy();
                } else {
                        evaluationStrategy = new PreapprovedOffEvaluationStrategy();
                }

                message = evaluationStrategy.evaluate(isApproved, approveState);
                logger.info(message);
        }
}
