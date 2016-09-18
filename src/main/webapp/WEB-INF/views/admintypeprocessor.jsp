<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
<div class="row-fluid">
		<div class="col-md-3 col-xs-12">
		<div class="col-md-12 col-xs-12">
		<form:form action="/admin/typeprocessor" class="form-inline" method="get" modelAttribute="filter">
				<custom:hiddenInputs excludeParams="search"/>
				<div class="form-group">
					<form:input path="search" placeholder="search" class="form-control" />
					<label></label>
					<button type="submit" class="btn btn-primary">Ok</button>
				</div>
			</form:form>
		</div>
		</div>
		<div class="col-md-7 col-xs-12">
		<div class="col-md-12 col-xs-12">
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

		</div>
			<div class="col-md-4 col-xs-4"><h4>Country name</h4></div>
			<div class="col-md-4 col-xs-4"><h4>Delete</h4></div>
			<div class="col-md-4 col-xs-4"><h4>Update</h4></div>
			<c:forEach items="${page.content}" var="typeprocessor">
				<div class="col-md-4 col-xs-4">${typeprocessor.name}</div>
				<div class="col-md-4 col-xs-4">
					<a href="/admin/typeprocessor/delete/${typeprocessor.id}<custom:allParams/>">delete</a>
				</div>
				<div class="col-md-4 col-xs-4">
					<a href="/admin/typeprocessor/update/${typeprocessor.id}<custom:allParams/>">update</a>
				</div>
			</c:forEach>
			<div class="col-md-12 col-xs-12 text-center">
				<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
			</div>
		</div>
		<div class="col-md-2 col-xs-12">
			<div class="col-md-6 col-xs-6 text-center">
				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Sort <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<custom:sort innerHtml="Name asc" paramValue="name"/>
						<custom:sort innerHtml="Name desc" paramValue="name,desc"/>
					</ul>
				</div>
			</div>
			<div class="col-md-6 col-xs-6 text-center">
				<custom:size posibleSizes="1,2,5,10" size="${page.size}" title="Page size"/>
			</div>
		</div>
	<%-- 	<div class="col-md-3 col-xs-12">
			<form:form action="/admin/typeprocessor" class="form-inline" method="get" modelAttribute="filter">
				<custom:hiddenInputs excludeParams="typeprocessorIds, _typeprocessorIds"/>
				
				
				<div class="form-group">
					<h4>typeprocessors</h4>
				</div>
				<div class="form-group">
					<form:checkboxes items="${page.content}" path="typeprocessorIds" itemLabel="name" itemValue="id"/>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Ok</button>
				</div>
			</form:form>
		</div> --%>
	</div> 	
	
	
	