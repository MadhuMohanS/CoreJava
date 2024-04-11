<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="bg-light">
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
     
    </ul>
  </div>
</nav>
<div class="row mt-5 m-lg-5">
<h1 class="text-dark">${nm}</h1>
</div>
  <div class="row mt-5 m-lg-5">
    <div class="col">
      <h2 class="text-dark">Items list</h2>
    </div>
    <div class="col">
      <h2 class="text-dark">Quantity</h2>
    </div>
  </div>
  <c:forEach var="entry" items="${map}">
      <div class="row mt-5 m-lg-5">
    <div class="col">
      <h3 class="text-dark">${entry.key}</h3>
    </div>
    <div class="col">
      <h3 class="text-dark">${entry.value}</h3>
    </div>
  </div>
    
</c:forEach>
  
<div class="row mt-5 m-lg-5">
<h2 class="text-dark">Total bill is :${bill}</h2>
</div>
</body>
</html>