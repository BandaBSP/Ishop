<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
</html>