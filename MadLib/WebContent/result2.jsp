<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Surprise!</title>
</head>
<body>
<p>Ha! You got punked! Here's the last line you just made!</p>
<p>${userSurvey.feedbackLine()}</p>
<a href="index.jsp">Make another one!</a>
</body>
</html>