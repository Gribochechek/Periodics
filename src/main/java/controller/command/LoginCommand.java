package controller.command;

import controller.Pages;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements Command
{
    @Override
    public String execute(HttpServletRequest request) {
        System.out.println("User logged in");
        request.setAttribute("result", "loggedIn");
        return Pages.INDEX;
    }
}
