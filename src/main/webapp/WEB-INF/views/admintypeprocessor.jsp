<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
<a href="/admin">Go to Admin panel</a>
	<form action="/admin/typeprocessor" method="post">
		<table>
			<tr>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<th>Type Processor</th>
		</tr>
		<c:forEach items="${typeprocessors}" var="typeprocessor">
			<tr>
				<td>${typeprocessor.name}</td>
				<td><a href="/admin/typeprocessor/delete/${typeprocessor.id}">delete</a>
				</td>
				<td><a href="/admin/typeprocessor/update/${typeprocessor.id}">update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</html>
