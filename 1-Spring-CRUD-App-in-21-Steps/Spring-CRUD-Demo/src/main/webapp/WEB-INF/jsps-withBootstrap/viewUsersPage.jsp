<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
   crossorigin="anonymous">
    
<title>View Users</title>
</head>
<body>

<div class="container">
	
	<h2>View Users</h2>
	
	<div class="row">
		<table class="table table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Login ID</th>
                    <th>Name</th>
					<th>Status</th>
					<th></th>
					<th></th>
                </tr>
            </thead>
            <tbody>
            	<c:forEach items="${users }" var="user">
	                <tr>
	                    <th scope="row">${user.id }</th>
	                    <td>${user.loginId }</td>
	                    <td>${user.name }</td>
	                    <td>${user.status }</td>
						<td><a href="editUser?id=${user.id}">Edit</a></td>
						<td><a href="deleteUser?id=${user.id}">Delete</a></td>
	                </tr>
               	</c:forEach>
            </tbody>
        </table>
	</div>
	<a href="createUser">Create User</a>
</div>

</body>
</html>