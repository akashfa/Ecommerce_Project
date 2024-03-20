<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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

						<h3 class="text-center my-3">Sign up here !!</h3>
						<form action="RegisterServlet">

							<div class="form-group">
								<label for="userName">user Name</label> <input type="text"
									name="user_name" class="form-control" id="userName"
									placeholder="Enter the name">
							</div>

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

							<div class="form-group">
								<label for="userPhone">user phone</label> <input type="number"
									name="user_phone" class="form-control" id="userPhone"
									placeholder="Enter the number">
							</div>

							<div class="form-group">
								<label for="userAddress">user Address</label>
								<textarea style="height: 150px;" name="user_address"
									class="form-control" placeholder="Enter the address"></textarea>
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