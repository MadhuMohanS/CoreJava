<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="market.js"></script>
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
        <form name="registration" action="market" method="post">
        <div class="mb-3">
      <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" name="name" id="name" onblur="setName()">
     <span id="nameError"></span>
  </div>
  
    <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="location">Location</label>
                                <select class="form-select" id="location" name="location" onblur="setLocation()">
                                    <option selected value="0">Choose...</option>
                                    <option value="BTM">BTM</option>
                                    <option value="APMC Market">APMC Market</option>
                                    <option value="Banashankari  ">Banashankari </option>
                                    <option value="Veg Market">Veg Market</option>
                                    <option value="Mejestic">Mejestic</option>

                                </select>

                                <span id="locationError"></span>
                            </div>
   <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="city">City</label>
                                <select class="form-select" id="city" name="city" onblur="setCity()">
                                    <option selected value="0">Choose...</option>
                                    <option value="BTM">Bengaluru</option>
                                    <option value="MG Road">Davangere</option>
                                    <option value="Bengaluru  ">Bengaluru </option>
                                    <option value="Jayanagara">Davangere</option>
                                    <option value="Bengaluru">Bengaluru</option>

                                </select>

                                <span id="cityError"></span>
                            </div>
<div class="mb-3">
      <label for="Name" class="form-label">Pincode:</label>
    <input type="text" class="form-control" name="pincode" id="pincode" onblur="setPincode()">
    <span id=pincodeError></span>
  </div>

<div class="mb-3">
      <label for="Name" class="form-label">Area:</label>
    <input type="text" class="form-control" name="area" id="area" onblur="setArea()">
    <span id="areaError"></span>
  </div>
 <div class="mb-3">
 <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="type">Type</label>
                                <select class="form-select" id="type" name="type" onblur="setType()">
                                    <option selected value="0">Choose...</option>
                                    <option value="Vegetable Stall">Vegetable Stall</option>
                                    <option value="Fruits Stall">Fruits Stall</option>
                                    <option value="Cuisine Stall">Cuisine Stall </option>
                                    <option value="Onions stall">Onions stall</option>
                                    <option value="Spices stall">Spices stall</option>
                                    <option value="All type stall">All type stall</option>

                                </select>

                                <span id="typeError"></span>
                            </div>
<div class="mb-3">
      <label for="Name" class="form-label">Stallno:</label>
    <input type="text" class="form-control" name="stall" id="stall" onblur="setStall()">
    <span id="stallError"></span>
  </div>
  <div class="mb-3">
      <label for="Name" class="form-label">ItemName:</label>
    <input type="text" class="form-control" name="itemName" id="itemName" onblur="setItemName()">
    <span id="itemNameError"></span>
  </div>
  <div class="mb-3">
      <label for="Name" class="form-label">ItemQuality:</label>
    <input type="text" class="form-control" name="itemQuality" id="itemQuality" onblur="setItemQuality()">
    <span id="itemQualityError"></span>
  </div>
  <div class="mb-3">
      <label for="Name" class="form-label">ItemQuantity:</label>
    <input type="text" class="form-control" name="itemQuantity" id="itemQuantity" onblur="setItemQuantity()">
    <span id="itemQuantityError"></span>
  </div>
  <div class="mb-3">
      <label for="Name" class="form-label">Cost:</label>
    <input type="text" class="form-control" name="itemCost" id="itemCost" onblur="setItemCost()">
    <span id="itemCostError"></span>
  </div>
  <div class="mb-3">
      <label for="Name" class="form-label">Stall Owner:</label>
    <input type="text" class="form-control" name="stallOwner" id="stallOwner" onblur="setStallOwner()">
    <span id="stallOwnerError"></span>
  </div>
  <div class="mb-3">
      <label for="Name" class="form-label">Stall Keb no:</label>
    <input type="text" class="form-control" name="keb" id="keb" onblur="setKEB()">
    <span id="kebError"></span>
  </div>
</div>
<div class="mb-3">
      <label for="Name" class="form-label">Stall Owner GST no:</label>
    <input type="text" class="form-control" name="gst" id="gst" onblur="setGST()">
    <span id="gstError"></span>
  </div>

<div class="mb-3">
      <label for="Name" class="form-label">Weekly transaction:</label>
    <input type="text" class="form-control" name="transaction" id="transaction" onblur="setTransaction()">
    <span id="transactionError"></span>
  </div>

  
  <button type="submit" disabled class="btn btn-primary" id="btn">Submit</button>
  </form>
        </div>
        </div>
        </div>

</body>
</html>