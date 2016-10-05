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
			<form:form action="/admin/processor" class="form-inline"
				method="get" modelAttribute="filter">
				<custom:hiddenInputs excludeParams="search" />
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
	<form:form action="/admin/processor" method="post" modelAttribute="processor" class="form-inline" >
		<form:errors path="*"/>
		<form:hidden path="id" />
		<custom:hiddenInputs excludeParams=" id,  typeprocessor, coreprocessor"/>
			<div class="form-group">
			<form:select path="coreprocessor" items="${coreprocessors}" itemLabel="core" itemValue="id">
			</form:select>
			<form:select path="typeprocessor" items="${typeprocessors}" itemLabel="name" itemValue="id">
			</form:select>
			<form:input id="name" path="name" placeholder="processor name" class="form-control" />
					<label for="name"><form:errors path="name" /></label>
			<button type="submit" class="btn btn-primary">Create Recipe</button>
			</div>
	</form:form>
		</div>
		<div class="col-md-4 col-xs-4">
			<h4>Core Processor core</h4>
		</div>
		<div class="col-md-4 col-xs-4">
			<h4>Delete</h4>
		</div>
		<div class="col-md-4 col-xs-4">
			<h4>Update</h4>
		</div>
		<c:forEach items="${page.content}" var="processor">
			<div class="col-md-4 col-xs-4">${processor.name} ${processor.typeprocessor.name} ${processor.coreprocessor.core}</div>
			<div class="col-md-4 col-xs-4">
				<a
					href="/admin/processor/delete/${processor.id}<custom:allParams/>">delete</a>
			</div>
			<div class="col-md-4 col-xs-4">
				<a
					href="/admin/processor/update/${processor.id}<custom:allParams/>">update</a>
			</div>
		</c:forEach>
		 <div class="col-md-12 col-xs-12 text-center">
			<custom:pageable page="${page}" cell="<li></li>"
				container="<ul class='pagination'></ul>" />
		</div> 
	</div>
	<div class="col-md-2 col-xs-12">
		<div class="col-md-6 col-xs-6 text-center">
			<div class="dropdown">
				<button class="btn btn-primary dropdown-toggle" type="button"
					data-toggle="dropdown">
					Sort <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<custom:sort innerHtml="core asc" paramValue="core" />
					<custom:sort innerHtml="core desc" paramValue="core,desc" />
				</ul>
			</div>
		</div>
		<div class="col-md-6 col-xs-6 text-center">
			<custom:size posibleSizes="1,2,5,10" size="${page.size}"
				title="Page size" />
		</div>
	</div>
</div> 