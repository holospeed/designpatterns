package com.szakdolgozat;

import java.util.logging.Logger;

import com.szakdolgozat.command.ApprovedOffCommand;
import com.szakdolgozat.command.ApprovedOnCommand;
import com.szakdolgozat.command.PreapprovedOffCommand;
import com.szakdolgozat.command.PreapprovedOnCommand;
import com.szakdolgozat.command.ReprovedOffCommand;
import com.szakdolgozat.command.RequestInvoker;

public class App {

    private static Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        boolean isApproved = true;
        boolean isSuccessRequest = true;
        Evaluation approveState = Evaluation.approvedOn;
        String message;

        RequestInvoker invoker = new RequestInvoker();
        invoker.addCommand(new ApprovedOnCommand(isSuccessRequest, isApproved, approveState));
        invoker.addCommand(new ApprovedOffCommand(isSuccessRequest, isApproved, approveState));
        invoker.addCommand(new PreapprovedOnCommand(isSuccessRequest, isApproved, approveState));
        invoker.addCommand(new PreapprovedOffCommand(isSuccessRequest, isApproved, approveState));
        invoker.addCommand(new ReprovedOffCommand(isSuccessRequest, isApproved));
        message = invoker.executeCommands();

        logger.info(message);
    }
}
