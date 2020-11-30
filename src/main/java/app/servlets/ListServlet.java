package app.servlets;

import app.models.BookCollection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private void render(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("pathname", req.getRequestURI());
        req.setAttribute("title", "Books - List");

        req.setAttribute("books", BookCollection.getInstance().getModels());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, res);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.render(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String id = req.getParameter("id");
        BookCollection.getInstance().deleteModel(id);

        this.render(req, res);
    }
}
