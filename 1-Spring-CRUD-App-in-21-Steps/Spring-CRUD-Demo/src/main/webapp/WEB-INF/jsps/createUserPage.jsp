<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
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
		<br><br>
		<div class="card">
			<h3 class="card-header text-center">Spring CRUD Application</h3>
			<div class="card-body">
			
				<h4 class="card-title">Create User</h4>
				
				<div class="row">
					<div class="col-md-8 offset-md-2">
				
						<form action="saveUser" method="post">
				
						<div class="form-group row">
							<label class="col-sm-2 col-form-label">ID</label>
							<div class="col-sm-10">
							  <input type="text" name="id" readonly="readonly" class="form-control">	
							</div>
						</div>
			  
						<div class="form-group row">
							<label class="col-sm-2 col-form-label">Login ID</label>
							<div class="col-sm-10">
								<input type="text" name="loginId" class="form-control">
							</div>
						</div>
						
						<div class="form-group row">
							<label class="col-sm-2 col-form-label">Name</label>
							<div class="col-sm-10">
								<input type="text" name="name" class="form-control">
							</div>
						</div>
						
						
						<fieldset class="form-group">
							<div class="row">
							  <legend class="col-form-label col-sm-2 pt-0">Status</legend>
							  <div class="col-sm-10">
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
							  </div>
							</div>
						</fieldset>
						
						<c:if test="${msg != null }">
							<div class="alert alert-success">
								${msg }
							</div>
						</c:if>
						
						<div class="form-group row">
							<div class="col-sm-10">
							  <input type="submit" value="Save" class="btn btn-success">
							  <a class="btn btn-primary" href="viewUsers">View All</a>
							</div>
						</div>
					</form>
				
					</div>
				</div>			
						
			</div>
		</div>
		
	</div>

</body>
</html>