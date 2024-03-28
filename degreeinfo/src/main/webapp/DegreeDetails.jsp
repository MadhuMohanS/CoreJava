<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body class="bg-primary">
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="DegreeDetails.jsp">DegreeDetails</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container mt-5 mb-5 d-flex justify-content-center">
    <div class="card px-1 py-4">
        <div class="card-body">
        <h6 class="information mt-4">Please provide following information about your Degree</h6>
        <form name="registration" action="degree" method="post">
        <div class="mb-3">
      <label for="Name" class="form-label">Name</label>
    <input type="text" class="form-control" name="name">
  </div>
   <div class="mb-3">
      <label for="email" class="form-label">Email</label>
    <input type="email" class="form-control" name="email">
  </div>
   <div class="mb-3">
  <select class="form-select" aria-label="Disabled select example" onblur="brandValidation()" id="fbrand" name="college">
  <option value="0">College</option>
  <option value="BIHE">BIHE</option>
  <option value="BIET">BIET</option>
  <option value="UBDT">UBDT</option>
</select>
</div>
 <div class="mb-3">
<select class="form-select" aria-label="Disabled select example" onblur="brandValidation()" id="fbrand" name="degree">
  <option value="0">Degree</option>
  <option value="BCA">BCA</option>
  <option value="MCA">MCA</option>
  <option value="Btech">Btech</option>
</select>
</div>

 <div class="mb-3">
<select class="form-select" aria-label="Disabled select example" onblur="brandValidation()" id="fbrand" name="stream">
  <option value="0">Stream</option>
  <option value="Software Development">Software Development</option>
  <option value="System Management">System Management</option>
  <option value="Networking">Networking</option>
</select>
</div>
   <div class="mb-3">
      <label for="percentage" class="form-label">Percentage</label>
    <input type="text" class="form-control" name="percentage">
  </div>
   <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  </form>
        </div>
        </div>
        </div>
</body>
</html>