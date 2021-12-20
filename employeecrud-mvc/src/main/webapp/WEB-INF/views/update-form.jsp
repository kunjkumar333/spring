<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Update Employee</title>
</head>
<body>

	<div class="form-body">
		<div class="row">
			<div class="form-holder">
				<div class="form-content">
					<div class="form-items">
						<h3>Update Employee</h3>
						<p>Fill Employee details below.</p>
						<form:form action="saveProduct" cssClass="form-horizontal"
							method="post" modelAttribute="product">

							<!-- need to associate this data with customer id -->
							<form:hidden path="id" />
							<form:hidden path="fname" />
							<form:hidden path="lname" />

							<div class="col-md-12">
								<input class="form-control" type="email" name="email"
									placeholder="Email" required>

							</div>

							<div class="col-md-12">
								<input class="form-control" type="text" name="desig"
									placeholder="Designation" required>
							</div>



							<div class="col-md-12">
								<select class="form-select mt-3" name="emptype" required>
									<option selected disabled value="">Employee type</option>
									<option value="Full Time">Full-Time</option>
									<option value="Part-Time">Part-Time</option>
									<option value="Internship">Internship</option>
								</select>

							</div>

							<div class="form-button mt-3">
								<button id="submit" type="submit" class="btn btn-primary">Update</button>
							</div>
						</form:form>
					</div>

				</div>

			</div>

		</div>

	</div>





</body>
</html>