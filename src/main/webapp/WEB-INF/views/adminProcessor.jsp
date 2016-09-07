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
	<form:form action="/admin/processor" method="post"
		modelAttribute="form">
		<form:errors path="*" />
		<form:hidden path="id" />
		<table>
			<%-- 	<tr>
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
			</tr> --%>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>

		<form action="/admin/typeprocessor" method="post">
			<table>
				<tr>
					<td><input name="name"></td>
				</tr>

			</table>
		</form>
		<form action="/admin/coreprocessor" method="post">
			<table>
				<tr>
					<td><input name="core"></td>
				</tr>
			</table>
		</form>
	</form:form>
	<table>
		<c:forEach items="${processors}" var="processor">


			<tr>
				<td>${processor.id}</td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>