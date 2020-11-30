package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

@WebServlet("/")
public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("pathname", req.getRequestURI());
        req.setAttribute("title", "Books");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/main.jsp");
        requestDispatcher.forward(req, res);
    }
}
