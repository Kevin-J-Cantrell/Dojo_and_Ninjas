<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>start</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
           <h1 class="text-center mb-3">Dojo: <c:out value="${dojo.name}"></c:out></h1>
<table class="container table table-bordered table-primary col-6 ">
    <thead>
        <tr>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Age</th>
        </tr>
    </thead>
    <tbody>
       <c:forEach var="ninja" items="${dojo.ninjas}">
        <tr>
            <td>${ninja.first_name}</td>
            <td>${ninja.last_name}</td>
            <td><a><c:out value="${ninja.age}"></c:out></a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<div class="container">
<a class="btn btn-info mb-1" style="margin: 0% 78% ;" href="/">Home</a>
</div>
</body>
</html>