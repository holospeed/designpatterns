package com.szakdolgozat.command;

import java.util.ArrayList;
import java.util.List;

public class RequestInvoker {
    private final List<ICommand> commands = new ArrayList<>();

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public String executeCommands() {
        StringBuilder sb = new StringBuilder();
        for (ICommand command : commands) {
            String result = command.execute();
            if (!result.isEmpty()) {
                sb.append(result).append("\n");
            }
        }
        return sb.toString();
    }
}
