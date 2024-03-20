<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
 	<%@include file="components/navbar.jsp"%>
	<div class="container-fluid">
		<div class="row mt-5">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<%@include file="components/message.jsp"%>
					<div class="card-body">

						<h3 class="text-center my-3">Login here !!</h3>
						<form action="Login">

							
							<div class="form-group">
								<label for="userEmail">user Email</label> <input type="email"
									name="user_email" class="form-control" id="userEmail"
									placeholder="Enter the name">
							</div>

							<div class="form-group">
								<label for="userPassword">user password</label> <input
									type="password" name="user_password" class="form-control"
									id="userPassword" placeholder="Enter the password">
							</div>

							<div class="container text-center mt-1 ">
                             <div>
                             <a href="Register.jsp">if you are not register</a>
                             </div>
                             </div>
							<div class="container text-center mt-1 ">
								<button class="btn btn-outline-success">Register</button>
								<button class="btn btn-outline-dark">Reset</button>
						</div>
						</form>
					</div>
				</div>

			</div>
		</div>
		<
	</div>
</body>
</html>