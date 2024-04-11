<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="./bootstrap.css">
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
<form action="calculate">
  <div class="form-group">
    <label for="exampleInputEmail1">Name:</label>
    <input type="text" class="form-control"   placeholder="Enter name" name="name"/>
  </div>
  <div class="form-check m-r5">
  <input class="form-check-input" type="checkbox" value="Banana" name="check" id="banana" >
  <label class="form-check-label" for="flexCheckChecked">
    Banana
  </label>
  <select class="w-10" name="select" id="bananaSelect" value="select">
  <option value="0">Select Kgs</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
</select>
</div>
<div class="form-check">
  <input class="form-check-input" type="checkbox" value="Apple"  name="check" id="apple" >
  <label class="form-check-label" for="flexCheckChecked">
    Apples
  </label>
  <select class="w-10" name="select" id="appleSelect" value="select">
    <option value="0">Select Kgs</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
  </select>
</div>
<div class="form-check m-r5">
  <input class="form-check-input" type="checkbox" value="Grapes" name="check" id="grapes" >
  <label class="form-check-label" for="flexCheckChecked">
    Grapes
  </label>
  <select class="w-10" name="select" id="grapeSelect" value="select">
  <option value="0">Select Kgs</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
</select>
</div>
<div class="form-check m-r5">
  <input class="form-check-input" type="checkbox" value="Orange" name="check" id="orange" >
  <label class="form-check-label" for="flexCheckChecked">
    Orange
  </label>
  <select class="w-10" name="select" id="orangeSelect" value="select">
  <option value="0">Select Kgs</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
</select>
</div>
<button class="btn btn-primary" type="submit">Submit</button>
</form>

<form action="mostsold">
<button class="btn btn-primary" type="submit">see what's the most sold item</button>
</form>
</body>
</html>