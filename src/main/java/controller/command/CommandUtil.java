package controller.command;

import controller.Parameters;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandUtil {

    private static CommandUtil instance = new CommandUtil();
    private Map<String, Command> commandMap = new HashMap<>();

    {
        init();
    }

    public static CommandUtil getInstance() {
        return instance;
    }

    private Command getDefaultCommand() {
        return commandMap.get(CommandConstants.DEFAULT_COMMAND);
    }


    private void init() {
        commandMap.put(CommandConstants.DEFAULT_COMMAND, new DefaultCommand());
        commandMap.put(CommandConstants.LOGIN_COMMAND, new LoginCommand());
    }


    public Command getCommand(HttpServletRequest request) {
        String commandName = request.getParameter(Parameters.COMMAND_PARAM);
        System.out.println(commandName);
        if (commandName == null) return getDefaultCommand();
        return commandMap.getOrDefault(commandName, getDefaultCommand());
    }
}
