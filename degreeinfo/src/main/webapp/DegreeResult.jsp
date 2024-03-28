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
<div class="container mb-5 mt-5">
                    <div class="container">
                        <h3 class="text-white">Name:${nm}</h3>
                </div>
                
                
                    <div class="container">
                        <h3 class="text-white">Email:${em}</h3>
               
                </div>
               
                    <div class="container">
                        <h3 class="text-white">College:${coll}</h3>
               
                </div>
                
                    <div class="container">
                        <h3 class="text-white">Degree:${deg}</h3>
                
                </div>
                <div class="container">
                        <h3 class="text-white">Stream:${stre}</h3>
                
                </div>
                <div class="container">
                        <h3 class="text-white">Percentage:${per}</h3>
                
                </div>
   </div>           

</body>
</html>