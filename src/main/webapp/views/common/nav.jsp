<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Books</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item <%= request.getAttribute("pathname").equals("/list") ? "active" : "" %>">
                <a class="nav-link" href="/list">List</a>
            </li>
            <li class="nav-item <%= request.getAttribute("pathname").equals("/add") ? "active" : "" %>">
                <a class="nav-link" href="/add">Add</a>
            </li>
        </ul>
    </div>
</nav>
