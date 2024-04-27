<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }
        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .success-img {
            width: 100px;
            margin-bottom: 20px;
        }
        h1 {
            color: rgb(241, 80, 80);
            margin-bottom: 20px;
        }

        /* Responsive styles */
        @media screen and (max-width: 480px) {
            .container {
                max-width: 90%;
            }
        }
    </style>
</head>
<body>
 <div class="container">
        <h2>${fn} ${ln}</h2>
        <img src="amarimages/crossmark.png" alt="Green Checkmark" class="success-img">
        <h1>Sorry we Encountered some problem</h1>
    </div>
</body>
</html>