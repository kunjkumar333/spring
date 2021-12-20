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
<title>Employee Management</title>
<style type="text/css">
body{

background-repeat:no-repeat;
background-size:cover;
}
</style>
</head>

<body background="<c:url value="/resources/images/back1.jpg"/>">
<div align="center">
<br>

<h1 align="center" style="font-family: fantasy;">Employee Management System</h1>
<br>
<br>
<br>

<a class="btn btn-primary" href="product/productform" role="button">Add Employee</a>
<br>
<br>


<a class="btn btn-primary" href="product/list" role="button">View Employees</a>
</div>
</body>

</html>
