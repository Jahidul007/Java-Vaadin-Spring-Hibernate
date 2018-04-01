<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		<br><br/>
		Last Name: <form:input path="lastName"/> 
		<br><br/>
		 
		Country:
		<form:select path="country">
		
		<form:options items="${student.countryOptions }"/>
	
		</form:select>
		<br><br/>
		
		Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value = "Java"/>
		Php <form:radiobutton path="favoriteLanguage" value = "Php"/>
		Ruby <form:radiobutton path="favoriteLanguage" value = "Ruby"/>
		C++ <form:radiobutton path="favoriteLanguage" value = "C++"/>
		Python <form:radiobutton path="favoriteLanguage" value = "Python"/>
		JSP <form:radiobutton path="favoriteLanguage" value = "JSP"/>
		<br><br/>
		
		Operating System:
		Linux <form:checkbox path="opertingSystems" value ="Linux"/>
		MAC <form:checkbox path="opertingSystems" value ="MAC"/>
		Windows <form:checkbox path="opertingSystems" value ="Windows"/>
		
		
		<br><br/>
		<input type="submit" value= "Submit"/>
		
		
		
		
	</form:form>
</body>
</html>