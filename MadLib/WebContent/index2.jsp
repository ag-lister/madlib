<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Survey</title>
</head>
<body>
<h3>What did you think about the madlib?</h3>
<form action="surveyMadLib" method="post">
Enter a word to describe it:
<input type="text" name="description" size="10">
<input type="submit" value="Submit feedback!" />
<p></p>
</form>
</body>
</html>