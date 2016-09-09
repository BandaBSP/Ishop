<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="/admin/ram" method="post"
		modelAttribute="form">
		<form:hidden path="id"/>
		<table>
			<a href="/admin">Go to Admin panel</a>
			<tr>
				<td><form:input path="ramGb" placeholder="ramGb" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Записати в базу"></td>
			</tr>
		</table>
	</form:form>
	<table>
		<tr>
			<th>Ram Gb</th>
		</tr>
		<c:forEach items="${rams}" var="ram">
			<tr>
				<td>${ram.ramGb}</td>
				<td><a href="/admin/ram/delete/${ram.id}">delete</a></td>
				<td><a href="/admin/ram/update/${ram.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>

<%-- 	<table>
		<tr>
			<td><select name="RamId">
					<c:forEach items="${rams}" var="ram">
						<option value="=${ram.id}">${ram.ramGb}
					</c:forEach>
					<select />
					<td />
					<tr />
	</table> --%>
</body>
</html>