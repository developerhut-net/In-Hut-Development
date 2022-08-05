<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
   crossorigin="anonymous">
   
<title>Create User</title>
</head>
<body>

<div class="container">
	<h2>Create Users</h2>
	
	<div class="row">
		<form action="saveUser" method="post">
			<div class="form-group">
				<label>ID</label>
				<input type="text" name="id" readonly="readonly" class="form-control">	
			</div>
			
			<div class="form-group">
				<label>Login ID</label>
				<input type="text" name="loginId" class="form-control">	
			</div>
			
			<div class="form-group">
				<label>Name</label>
				<input type="text" name="name" class="form-control">	
			</div>
			
			<label>Status</label>
			<div class="form-check">
				<input type="radio" name="status" value="ACTIVE" class="form-check-input"/>
				<label class="form-check-label">
					ACTIVE
				</label>
			</div>
			
			<div class="form-check">
				<input type="radio" name="status" value="INACTIVE" class="form-check-input"/>
				<label class="form-check-label">
					INACTIVE
				</label>
			</div>
			
			<div class="alert alert-success">
		        ${msg }
		    </div>
    		
			<input type="submit" value="Save" class="btn btn-primary">
		</form>
	</div>
	
	<a href="viewUsers">View All</a>
</div>

</body>
</html>