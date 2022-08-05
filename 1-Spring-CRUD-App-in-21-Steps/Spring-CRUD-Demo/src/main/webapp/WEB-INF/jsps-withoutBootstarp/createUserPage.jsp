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
<form action="saveUser" method="post">
	Id : <input type="text" name="id" readonly="readonly">
	Login Id : <input type="text" name="loginId">
	Name : <input type="text" name="name">
	<!-- Expiry Date : <input type="date" name="expiryDate"> -->
	Status : Active <input type="radio" name="status" value="ACTIVE"/>
			Inactive <input type="radio" name="status" value="INACTIVE"/>
		
	<input type="submit" value="Save">
</form>
</pre>
${msg }
<a href="viewUsers">View All</a>
</body>
</html>