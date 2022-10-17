<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Referral</title>
</head>
<body>

	<h1>Referral List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Referrals</th>

		</tr>
		<c:forEach var="ref" items="${list}">
			<tr>
				<td>${ref.id}</td>
				<td>${ref.name}</td>
				<td>${ref.referrals}</td>

			</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>

