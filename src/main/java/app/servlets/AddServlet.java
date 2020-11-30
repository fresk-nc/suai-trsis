package app.servlets;

import app.models.Book;
import app.models.BookCollection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    private void render(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("pathname", req.getRequestURI());
        req.setAttribute("title", "Books - Add");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, res);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.render(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String title = req.getParameter("title");
            String author = req.getParameter("author");
            float price = Float.parseFloat(req.getParameter("price"));

            Book book = new Book(title, author, price);
            BookCollection.getInstance().addModel(book);

            req.setAttribute("isSuccess", true);
        } catch(Exception e) {
            req.setAttribute("isFailure", true);
        }

        this.render(req, res);
    }
}
