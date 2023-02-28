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
            <h1 class="text-center mb-3">New Ninja</h1>
            <form:form action="/create/ninja" method="post" modelAttribute="ninja">
                <div class="row mb-1">
                    <div class="col">
                        <form:errors path="dojo">must choose a Dojo</form:errors>
                        <form:label path="dojo" class="form-label col-4">Dojo: </form:label>
                        <form:select path="dojo" id="dojo_id">
                            <option value="">---SELECT DOJO---</option>
                            <c:forEach var="dojo" items="${dojos}">
                            <option value="${dojo.id}">${dojo.name}</option>
                           </c:forEach>
                            
                        </form:select>
                    </div>
                </div>
                <div class="row mb-1">
                    <div class="col">
                        <form:label path="first_name" class="form-label">First Name</form:label>
                        <form:input type="text" path="first_name" class="form-control" placeholder="First name"/>
                        <form:errors path="first_name"></form:errors>
                    </div>
                </div>
                <div class="row mb-1">
                    <div class="col">
                        <form:label path="last_name" class="form-label">Last Name</form:label>
                        <form:input type="text" path="last_name" class="form-control" placeholder="Last name"/>
                        <form:errors path="last_name"></form:errors>
                    </div>
                </div>
                <div class="row mb-1">
                    <div class="col">
                        <form:label path="age" class="form-label">Age</form:label>
                        <form:input type="number" path="age" class="form-control" placeholder="Age"/>
                        <form:errors path="age"></form:errors>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary mt-2">Create</button>
                <a class="btn btn-info mb-1" style="margin: -60px 80% ;" href="/">Home</a>
            </form:form>
        </div>
    </div>
</body>
</html>