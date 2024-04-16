<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body class="bg-light">
 <nav class="navbar navbar-expand-lg navbar-light bg-primary">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <h2 class="text-white ">Amar Fruits Shop</h2>
    </div>
  </nav>
<c:forEach var="entry" items="${maxFreq}">
      <div class="row mt-5 m-lg-5">
    <div class="col">
   <c:if test="${entry.equals('Apple')}">
   <img src="amavegetables/Apple.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Banana')}">
   <img src="amavegetables/banana.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Grapes')}">
   <img src="amavegetables/grapes.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Mango')}">
   <img src="amavegetables/mango.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Orange')}">
   <img src="amavegetables/orange.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Papaya')}">
   <img src="amavegetables/papaya.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Pinapple')}">
   <img src="amavegetables/pinapple.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Pomegranate')}">
   <img src="amavegetables/pomegranate.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Strawberry')}">
   <img src="amavegetables/strawberry.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
      <c:if test="${entry.equals('Watermelon')}">
   <img src="amavegetables/watermelon.jpeg" style="width:300px;height: 200px;" alt="">
      <h3 class="text-dark">${entry}</h3>
      </c:if>
    </div>
  </div>
    
</c:forEach>
</body>
</html>