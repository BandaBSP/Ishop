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
	 <form:form action="/admin/komputer" method="post"
		modelAttribute="form">
		<form:errors path="*" />
		<form:hidden path="id" />
		<table>
			<a href="/admin">Go to Admin panel</a>
		
			 <tr>
				<td><form:select path="hdd">
						<option value="0">Hdd</option>
						<c:forEach items="${hdds}" var="hdd">
							<c:choose>
								<c:when test="${hdd.id eq form.hdd.id}">
									<option value="${hdd.id}" selected="selected">${hdd.hddGb}</option>
								</c:when>
								<c:otherwise>
									<option value="${hdd.id}">${hdd.hddGb}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td>
				<td><form:select path="ram">
						<option value="0">Ram</option>
						<c:forEach items="${rams}" var="ram">
							<c:choose>
								<c:when test="${ram.id eq form.ram.id}">
									<option value="${ram.id}" selected="selected">${ram.ramGb}</option>
								</c:when>
								<c:otherwise>
									<option value="${ram.id}">${ram.ramGb}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td>
				<td><form:select path="videoadapter">
						<option value="0">VideoAdapter</option>
						<c:forEach items="${videoadapters}" var="videoadapter">
							<c:choose>
								<c:when test="${videoadapter.id eq form.videoadapter.id}">
									<option value="${videoadapter.id}" selected="selected">${videoadapter.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${videoadapter.id}">${videoadapter.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td>
			 <td><form:select path="processor">
						<option value="0">processor</option>
						<c:forEach items="${processors}" var="processor">
							<c:choose>
								<c:when test="${processor.id eq form.processor.id}">
									<option value="${processor.id}" selected="selected">${processor.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${processor.id}">${processor.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td> 
				<%-- <td><form:select path="processor">
						<option value="0">Type Processor</option>
						<c:forEach items="${processors}" var="processor">
							<c:choose>
								<c:when test="${processor.id eq form.processor.id}">
									<option value="${processor.id}" selected="selected">${processor.typeprocessor.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${processor.id}">${processor.typeprocessor.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</form:select></td>  --%>
					<td><form:input path="price" placeholder="price PC" /></td>
					
				<td><input type="submit"></td>
			</tr>
				</table>
	</form:form>
			

	
<table>
		<tr>
			<th>Hdd</th>
			<th>Ram Gb</th>
			<th>Videoadapter</th>
			<th>processor</th>
			<th>price</th>
		</tr>
		<c:forEach items="${komputers}" var="komputer">
		<tr>
				<td>${komputer.hdd.hddGb}</td>
				<td>${komputer.ram.ramGb}</td>
				<td>${komputer.videoadapter.name}</td>
				<td>${komputer.processor.name}</td>
				<td>${komputer.price}</td>
				
				<td><a href="/admin/komputer/delete/${komputer.id}">delete_</a></td>
				
				<td><a href="/admin/komputer/update/${komputer.id}"> update</a></td>
				</tr>
		<%-- 	<th>Core Processor</th>
			<th>Type Processor</th> 
			<td>${komputer.processor.typeprocessor.name}</td>
			  --%>
		</c:forEach>
	</table>  
</body>
</html>
