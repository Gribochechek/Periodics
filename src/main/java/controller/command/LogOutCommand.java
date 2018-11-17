package controller.command;

import controller.Pages;

import javax.servlet.http.HttpServletRequest;

public class LogOutCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("userloggedOut", "User Logged Out");
        System.out.println("logout COmmand");
        return Pages.INDEX;
    }
}
