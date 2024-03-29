<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="bg-primary">
	<div class="container mt-5 mb-5 d-flex justify-content-center">
		<div class="card px-1 py-4">
			<div class="card-body">
				<h3 class="information mt-4">${fname}${lname}</h3>
				<h6 class="information mt-4">Please provide following
					information</h6>
				<form action="contact">
					<div class="row mb-3">
						<div class="col-sm-12">
							<div class="form-group">
								<!-- <label for="name">FirstName</label> -->
								<input class="form-control" type="text" placeholder="Mobile"
									name="mobile" id="mobile">
							</div>
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-sm-12">
							<div class="form-group">
								<!-- <label for="name">LastName</label> -->
								<input class="form-control" type="email" placeholder="EmailID"
									name="email" id="email">
							</div>
						</div>
					</div>
					<button class="btn btn-primary btn-block confirm-button">Send</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>