<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body>
<pre>
<form action="updateUser" method="post">
	Id : <input type="text" name="id" value="${user.id }" readonly="readonly">
	Login Id : <input type="text" name="loginId" value="${user.loginId }">
	Name : <input type="text" name="name" value="${user.name }">
	<!-- Expiry Date : <input type="date" name="expiryDate"> -->
	Status : Active <input type="radio" name="status" value="ACTIVE" ${user.status=='ACTIVE'?'checked':''}/>
			Inactive <input type="radio" name="status" value="INACTIVE" ${user.status=='INACTIVE'?'checked':''}/>
		
	<input type="submit" value="Update">
</form>
</pre>
${msg }
<a href="viewUsers">View All</a>
</body>
</html>