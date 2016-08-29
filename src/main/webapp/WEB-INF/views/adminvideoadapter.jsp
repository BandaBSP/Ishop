<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/admin/videoadapter" method="post">
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
			<th>Video Adapter</th>
		</tr>
		<c:forEach items="${videoadapters}" var="videoadapter">
			<tr>
				<td>${videoadapter.name}</td>
				<td><a href="/admin/videoadapter/delete/${videoadapter.id}">delete</a>
				</td>
				<td><a href="/admin/videoadapter/update/${videoadapter.id}">update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>