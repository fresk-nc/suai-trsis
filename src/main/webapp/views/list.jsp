<%@ page import="java.util.List" %>
<%@ page import="app.models.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<jsp:include page="common/head.jsp" />
<body>
    <jsp:include page="common/nav.jsp" />
    <div class="container-fluid mt-4">
        <div class="row justify-content-md-center">
            <div class="col col-lg-10">
                <%
                    List<Book> books = (List<Book>) request.getAttribute("books");

                    if (books != null && !books.isEmpty()) {
                %>
                        <table class="table table-striped table-borderless">
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Author</th>
                                    <th scope="col">Price</th>
                                    <th scope="col"></th>
                                </tr>
                            </thead>
                            <tbody>
                        <%
                            for (Book book : books) {
                        %>
                            <tr>
                                <td class="align-middle"><%= book.getId() %></td>
                                <td class="align-middle"><%= book.getTitle() %></td>
                                <td class="align-middle"><%= book.getAuthor() %></td>
                                <td class="align-middle">$<%= book.getPrice() %></td>
                                <td class="align-middle">
                                    <form method="post" style="margin: 0">
                                        <input type="hidden" name="id" value="<%= book.getId() %>">
                                        <button type="submit" class="btn btn-danger">
                                            <span class="oi oi-trash"></span>
                                        </button>
                                    </form>
                                </td>
                            </tr>
                        <%
                            }
                        %>
                            </tbody>
                        </table>
                    <%
                        } else {
                    %>
                        <p>No books yet</p>
                    <%}%>
            </div>
        </div>
    </div>
</body>
</html>
