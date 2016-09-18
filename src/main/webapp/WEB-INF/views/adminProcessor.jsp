<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div class="row-fluid">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="collapse navbar-collapse" id="">
					<ul class="nav navbar-nav">
						<li><a href="/admin/ram">Ram</a></li>
						<li><a href="/admin/typeprocessor">Type Processors</a></li>
						<li><a href="/admin/coreprocessor">Core Processors</a></li>
						<li><a href="/admin/videoadapter">Video Adapter</a></li>
						<li><a href="/admin/processor">Processors</a></li>
						<li><a href="/admin/hdd">Hdd</a></li>
						<li><a href="/admin/komputer">Komputer</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<form:form action="/admin/processor" method="post"
		modelAttribute="form">
		<form:errors path="*" />
		<form:hidden path="id" />
		<table>
			<a href="/admin">Go to Admin panel</a>
			<tr>
				<th>Type Processor</th>
				<th>Сore Processor</th>
			</tr>
			<tr>
				<td><form:select path="typeprocessor">
						<option value="0">Type Processor</option>
						<c:forEach items="${typeprocessors}" var="typeprocessor">
							<c:choose>
								<c:when test="${typeprocessor.id eq form.typeprocessor.id}">
									<option value="${typeprocessor.id}" selected="selected">${typeprocessor.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${typeprocessor.id}">${typeprocessor.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td>
			</tr>
			<tr>
				<td><form:select path="coreprocessor">
						<option value="0">Сore Processor</option>
						<c:forEach items="${coreprocessors}" var="coreprocessor">
							<c:choose>
								<c:when test="${coreprocessor.id eq form.coreprocessor.id}">
									<option value="${coreprocessor.id}" selected="selected">${coreprocessor.core}</option>
								</c:when>
								<c:otherwise>
									<option value="${coreprocessor.id}">${coreprocessor.core}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>

		</table>
	</form:form>
	<table>
		<tr>
			<td>core</td>
			<td>type</td>
		</tr>
		<c:forEach items="${processors}" var="processor">
			<tr>
				<td>${processor.name}</td>
				<td><a href="/admin/processor/delete/${processor.id}">delete</a></td>
				<td><a href="/admin/processor/update/${processor.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
