<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Lib!!</title>
</head>
<body>
<h1>Let's make a mad lib! (Is that one word?)</h1>

<h3>Enter in your values here:</h3>
<form action="makeMadLib" method="post">
Enter a verb:
<input type="text" name="verb1" size="10">
<p></p>
Enter another verb:
<input type="text" name="verb2" size="10">
<p></p>
Enter a noun:
<input type="text" name="noun1" size="10">
<p></p>
Enter a whole number:
<input type="text" name="number" size="10">
<p></p>
<input type="submit" value="Make MadLib!" />
</form>
</body>
</html>