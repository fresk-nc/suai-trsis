<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<jsp:include page="common/head.jsp" />
<body>
    <jsp:include page="common/nav.jsp" />
    <div class="container-fluid mt-4">
        <div class="row justify-content-md-center">
            <div class="col col-lg-4">
                <%
                    if (request.getAttribute("isSuccess") == Boolean.TRUE) {
                %>
                    <div class="alert alert-success" role="alert">
                        You have successfully added the book
                    </div>
                <%
                    }
                %>
                <%
                    if (request.getAttribute("isFailure") == Boolean.TRUE) {
                %>
                    <div class="alert alert-danger" role="alert">
                        Something went wrong
                    </div>
                <%
                    }
                %>
                <form method="post">
                    <div class="form-group">
                        <label for="title">Title</label>
                        <input type="text" class="form-control" id="title" name="title" required>
                    </div>
                    <div class="form-group">
                        <label for="title">Author</label>
                        <input type="text" class="form-control" id="author" name="author" required>
                    </div>
                    <div class="form-group">
                        <label for="title">Price</label>
                        <input type="text" class="form-control" id="price" name="price" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
