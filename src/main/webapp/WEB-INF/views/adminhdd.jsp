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
	<form:form action="/admin/hdd" method="post" modelAttribute="form">
		<form:hidden path="id" />
		<table>
			<a href="/admin">Go to Admin panel</a>
			<tr>
				<td><form:input path="hddGb" placeholder="hdd Gb" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Записати в базу"></td>
			</tr>
		</table>
	</form:form>
	<table>
		<tr>
			<th>Hdd</th>
		</tr>
		<c:forEach items="${hdds}" var="hdd">
			<tr>
				<td>${hdd.hddGb}</td>
				<td>${hdd.typeHdd}</td>
				<td><a href="/admin/hdd/delete/${hdd.id}">delete</a></td>
				<td><a href="/admin/hdd/update/${hdd.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>