<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style1.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Employee List</title>
<style>
body {
	font-family: 'Poppins', sans-serif;
	background-repeat: no-repeat;
	background-size: cover;
	background-color: #BDC3C7;
}

.btn-primary {
	background-color: #6C757D;
	outline: none;
	border: 0px;
	box-shadow: none;
}

.btn-primary:hover, .btn-primary:focus, .btn-primary:active {
	background-color: #495056;
	outline: none !important;
	border: none !important;
	box-shadow: none;
}
</style>
</head>
<body>

<div class="bg-dark" style="height: 50px">
<h2 align="center" style="color: white">Welcome to Employee Management System</h2></div>
<br>
<br>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<div class="panel panel-info">
				<div class="panel-heading"></div>
				<div class="panel-body">
					<table class="table table-hover ">
						<thead class="thead-dark">
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Email</th>
								<th>Designation</th>
								<th>Employee Type</th>
								<th>Action</th>
							</tr>
						</thead>
						<!-- loop over and print our customers -->
						<c:forEach var="tempProduct" items="${products}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/product/updateForm">
								<c:param name="productId" value="${tempProduct.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/product/delete">
								<c:param name="productId" value="${tempProduct.id}" />
							</c:url>

							<tr bgcolor="white">
								<td>${tempProduct.fname}</td>
								<td>${tempProduct.lname}</td>
								<td>${tempProduct.email}</td>
								<td>${tempProduct.desig}</td>
								<td>${tempProduct.emptype}</td>
								<td>
									<!-- display the update link -->
									 <a href="${updateLink}"><i class="fas fa-edit text-primary" style="font-size: 30px;"></i></a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false"><i class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<input type="button" value="Add Employee"
				onclick="window.location.href='productform'; return false;"
				class="btn btn-primary" />
		</div>
	</div>

</body>
</html>