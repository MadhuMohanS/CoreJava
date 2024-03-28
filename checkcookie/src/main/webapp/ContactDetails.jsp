<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${fname} ${lname} </h3>
<h3>plz provide contact details</h3>
<form action="details" method="post">
Email:<input type=email" name="email">
Mobile:<input type=text" name="mobile">
<input type="submit" value="send">
</form>
</body>
</html>