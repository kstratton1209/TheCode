<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    
</head>

<style>
    .wrapper{
      width:700px;
      margin-left: 20px;
      padding: 20px;
      justify-content: space-between;
    }
</style>
<body>

    
    <div class="wrapper">
    <p style = "color: red;"><c:out value="${error}"/></p>
    <p> What is the code?</p>
    <form method="POST" action="/login">
	    <label><input type="text" name="passcode"></label>
	    <button class="btn btn-primary">Try code</button>
	</form>
    </div>
    
    
</body>
</html>
