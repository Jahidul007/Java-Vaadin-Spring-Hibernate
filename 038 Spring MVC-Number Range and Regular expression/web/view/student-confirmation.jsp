<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br />
	<br /> Country: ${student.country}
	<br />
	<br /> Favorite Language: ${student.favoriteLanguage}
	<br />
	<br /> Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.opertingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>