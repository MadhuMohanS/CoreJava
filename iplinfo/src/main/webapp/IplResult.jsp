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
          <a class="nav-link" href="IplDetails.jsp">IPLform</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-primary">
            <div class="card-body">
                <h6 class="card-title mb-3 text-white fs-1 d-flex justify-content-center">Ipl Details</h6>

               <div class="container mb-5 mt-5">
                    <div class="container">
                        <h3 class="text-white">Team A:${tmA}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Team B:${tmB}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Captain A:${cpA}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Captain B:${cpB}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Match:${mtch}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">City:${cty}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">PinCode:${pin}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Area:${are}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Stadium:${sta}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Match No:${mtchno}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Batsmen A:${btA}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Batsmen B:${btB}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Bowlers A :${bwA}</h3>
                </div>
                <div class="container">
                        <h3 class="text-white">Bowlers B :${bwB}</h3>
                </div>
                </div>


</div></div></div>

</body>
</html>