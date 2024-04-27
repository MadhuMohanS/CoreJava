<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductServlet" method=post>
<select name="sort">
<option value="low_to_high">sort low to high</option>
<option value="high_to_low">sort high to low</option>
</select>
<input type="submit" value="sort">
</form>
</body>
</html>