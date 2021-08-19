<%@page import="java.util.List"%>
<%@page import="Models.Student"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <title>List Student</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary"  href="add.htm">New registion</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${list}">   
                                <tr>
                                    
                                <td>${dato.getId()}</td>
                                <td>${dato.getFirstname()}</td>
                                <td>${dato.getLastname()}</td>
                                <td>
                                    <a href="editStudent.htm?id=${dato.getId()}" class="btn btn-warning">Edit</a>
                                    <a href="delete.htm?id=${dato.getId()}" class="btn btn-danger">Delete</a>
                                </td>
                                </tr>
                            </c:forEach>
                                
                        </tbody>
                    </table>
                       
                </div>
            </div>
        </div>
    </body>
</html>
