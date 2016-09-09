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
	<form:form action="/admin/typeprocessor" method="post"
		modelAttribute="form">
		<form:hidden path="id"/>
		<table>
			<a href="/admin">Go to Admin panel</a>
			<tr>
				<td><form:input path="name" placeholder="name" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Записати в базу"></td>
			</tr>
		</table>
	</form:form>
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
</body>
</html>