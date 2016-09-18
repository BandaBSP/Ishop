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
	<form:form action="/admin/coreprocessor" method="post"
		modelAttribute="form">
		<form:hidden path="id"/>
		<table>
			<a href="/admin">Go to Admin panel</a>
			<tr>
				<td><form:input path="core" placeholder="core name" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Записати в базу"></td>
			</tr>
		</table>
	</form:form>
	<table>
		<tr>
			<th>Core Processor</th>
		</tr>
		<c:forEach items="${coreprocessors}" var="coreprocessor">
			<tr>
				<td>${coreprocessor.core}</td>
				<td><a href="/admin/coreprocessor/delete/${coreprocessor.id}">delete</a>
				</td>
				<td><a href="/admin/coreprocessor/update/${coreprocessor.id}">update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
