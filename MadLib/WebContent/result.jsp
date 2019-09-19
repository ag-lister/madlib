<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final madlib</title>
</head>
<body>
<h1>Here is your creation!</h1>
<p>${userMadLib.firstLine() }</p>
<p>${userMadLib.secondLine() }</p>
<p>${userMadLib.thirdLine() }</p>
<a href="index2.jsp">Take this survey about the madlib</a>
</body>
</html>