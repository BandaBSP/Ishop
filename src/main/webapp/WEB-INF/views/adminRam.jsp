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
			<form:form action="/admin/ram" class="form-inline" method="get"
				modelAttribute="filter">
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
			<form:form action="/admin/ram" method="post" class="form-inline"
				modelAttribute="ram" enctype="multipart/form-data">
				<form:hidden path="id" />
				<custom:hiddenInputs excludeParams="ramGb, id, price" />
				<div class="form-group">
					<form:input id="ramGb" path="ramGb" placeholder="ram name"
						class="form-control" />
					<label for="ramGb"><form:errors path="ramGb" /></label> 
						<form:input id="price" path="price" placeholder="price"
						class="form-control" />
					<label
						class="btn btn-default btn-file"> Browse <input
						type="file" name="file" style="display: none;">
					</label>
					<button type="submit" class="btn btn-primary">Create ram</button>
				</div>
			</form:form>
		</div>
		<div class="col-md-4 col-xs-4">
			<h4>ram ramGb</h4>
		</div>
		<div class="col-md-4 col-xs-4">
			<h4>Delete</h4>
		</div>
		<div class="col-md-4 col-xs-4">
			<h4>Update</h4>
		</div>
		<c:forEach items="${page.content}" var="ram">
		<div class="col-md-3"><img class="img-thumbnail" width="100" src="/images/ram/${ram.id}${ram.path}?version=${ram.version}" /></div>
			<div class="col-md-4 col-xs-4">${ram.ramGb} ${ram.price}</div>
			<div class="col-md-4 col-xs-4">
				<a href="/admin/ram/delete/${ram.id}<custom:allParams/>">delete</a>
			</div>

			<div class="col-md-4 col-xs-4">
				<a href="/admin/ram/update/${ram.id}<custom:allParams/>">update</a>
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
					<custom:sort innerHtml="ramGb asc" paramValue="ramGb" />
					<custom:sort innerHtml="ramGb desc" paramValue="ramGb,desc" />
				</ul>
			</div>
		</div>
		<div class="col-md-6 col-xs-6 text-center">
			<custom:size posibleSizes="1,2,5,10" size="${page.size}"
				title="Page size" />
		</div>
	</div>
</div>