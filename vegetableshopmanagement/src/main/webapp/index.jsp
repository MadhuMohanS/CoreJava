<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="./bootstrap.css">
<style>
    .container-all {
      display: grid;
      justify-content: center;
      justify-content: space-around;
      grid-template-columns: auto auto;
    }
  </style>
</head>
<body class="bg-light">
  <nav class="navbar navbar-expand-lg navbar-light bg-primary">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <h2 class="text-white ">Amar Fruits Shop</h2>
    </div>
  </nav>
  <form action="calculate" method="post">

    <div class="form-group">
      <label for="exampleInputEmail1">Name:</label>
      <input type="text" class="form-control w-25" placeholder="Enter name" name="name" />
    </div>
    <div class="container-all">
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/banana.jpeg" style="width:300px;height: 200px;" alt="">
        <input class="form-check-input" type="checkbox" value="Banana" name="check" id="banana">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Banana
          </label>
          <p>Rs 30/kg</p>
          <select class="w-10" style="width:100px;margin-left: 50px;" name="select" id="bananaSelect" value="select">
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
      </div>
      <div class="form-check d-flex flex-column">
        <img src="amavegetables/Apple.jpeg" style="width:300px;height: 200px;" alt="">
        <input class="form-check-input" type="checkbox" value="Apple" name="check" id="apple">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Apples
          </label>
          <p>Rs 20/kg</p>
          <select class="w-10" style="width:100px;margin-left: 50px;" name="select" id="appleSelect" value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/grapes.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Grapes" name="check" id="grapes">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Grapes
          </label>
          <p>Rs 35/kg</p>
          <select class="w-10" style="width:100px;margin-left: 50px;" name="select" id="grapeSelect" value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/orange.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Orange" name="check" id="orange">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Orange
          </label>
          <p>Rs 25/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="orangeSelect" value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/mango.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Mango" name="check" id="mango">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Mango
          </label>
          <p>Rs 40/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="mangoSelect" value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/pinapple.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Pinapple" name="check" id="pinapple">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Pinapple
          </label>
          <p>Rs 29/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="pinappleSelect" value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/pomegranate.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Pomegranate" name="check" id="pomegranate">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Pomegranate
          </label>
          <p>Rs 35/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="pomegranateSelect"
            value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/papaya.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Papaya" name="check" id="papaya">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Papaya
          </label>
          <p>Rs 22/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="papayaSelect" value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/watermelon.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Watermelon" name="check" id="watermelon">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Watermelon
          </label>
          <p>Rs 22/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="watermelonSelect"
            value="select">
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
      </div>
      <div class="form-check m-r5 d-flex flex-column">
        <img src="amavegetables/strawberry.jpeg" style="width:300px;height: 200px;" alt="">

        <input class="form-check-input" type="checkbox" value="Strawberry" name="check" id="strawberry">
        <div class="d-flex">
          <label class="form-check-label" for="flexCheckChecked" style="margin-right: 10px;">
            Strawberry
          </label>
          <p>Rs 50/kg</p>
          <select class="w-10" name="select" style="width:100px;margin-left: 50px;" id="strawberrySelect"
            value="select">
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
      </div>

      <button class="btn btn-primary" type="submit">Submit</button>
  </form>

<form action="mostsold">
<button class="btn btn-primary" type="submit">See Our Best Sellings</button>
</form>
</body>
</html>