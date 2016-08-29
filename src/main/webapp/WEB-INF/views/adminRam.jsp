<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/admin/ram" method="post">
		<table>
			<tr>
				<td><input name="ramGb"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<table>
	<tr>
			<th>Ram Gb</th>
		</tr>
		<c:forEach items="${rams}" var="ram">
			<tr>
				<td>${ram.ramGb}</td>
				<td>
					<a href="/admin/ram/delete/${ram.id}">delete</a>
				</td>
				<td>
					<a href="/admin/ram/update/${ram.id}">update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<table>
	<tr>
			<td>
			<select name= "RamId">
		<c:forEach items="${rams}" var="ram">
		<option value="=${ram.id}">${ram.ramGb}
			</c:forEach>
			<select/>
			<td/>
			<tr/>
			
	</table>
</body>
</html>