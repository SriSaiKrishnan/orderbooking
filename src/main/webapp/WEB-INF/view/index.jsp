<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking</title>
</head>
<body>
	<div align="center">
		<h1>Welcome to Order Booking System</h1>
		<br>
		<h3>Select the User type</h3>
		<a href ="private"> Private Customer</a>
		<br><br>
		<a href ="business"> Business Customer</a>
	</div>
	<div align="center">
	<h3>Price List</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="price" items="${pricelist}">
			<tr>
				<td>${price.id }</td>
				<td>${price.productname }</td>
				<td>${price.productprice }</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>