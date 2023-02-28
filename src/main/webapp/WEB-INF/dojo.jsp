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
       <div class="container-fluid">
        <div class="container-sm box1 col-3" style="margin-top: 100px; margin-left:42%">
            <h1 class="text-center mb-3">New Dojo</h1>
            <form:form action="/new/dojo" method="post" modelAttribute="dojo">
                <div class="row mb-1">
                    <div class="col">
                        <form:label path="name" class="form-label">Name:</form:label>
                        <form:input type="text" path="name" class="form-control" placeholder="Dojo Name"/>
                        <form:errors path="name"></form:errors>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary mt-2">Submit</button>
                <a class="btn btn-info mb-1" style="margin: -60px 80% ;" href="/">Home</a>
            </form:form>
        </div>
    </div>
</body>
</html>