package controller.command;

import controller.Pages;

import javax.servlet.http.HttpServletRequest;

public class DefaultCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        System.out.println("Defaultcommand");
        return Pages.INDEX;
    }
}
