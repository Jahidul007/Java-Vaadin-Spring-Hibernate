<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer-confirmation</title>
</head>
<body>
	<b>The Customer Confirmation Is: ${customer.firstName }  ${customer.lastName } </b>
	<br/>
	<b>The Free passes: ${customer.freePasses } </b>
	<br/>
	<b>The Postal Code: ${customer.postalCode } </b>
</body>
</html>