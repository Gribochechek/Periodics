package controller.command;

import controller.Pages;
import model.entities.User;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        System.out.println("User logged in");
        request.getSession().setAttribute("result", "loggedIn");
        User user = new User.Builder().setEmail(request.getParameter("login")).setPassword(request.getParameter("pass")).build();
        request.getSession().setAttribute("user", user);
        return Pages.INDEX;
    }
}
