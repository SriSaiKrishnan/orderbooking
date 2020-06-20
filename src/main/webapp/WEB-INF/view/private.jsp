<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Private Customer</title>
</head>
<body>
<div align="center">
<h1> Welcome Private Customer </h1>
<br><br>
<h3> Choose the Payment Mode</h3>
 <div id="payment">
<input type="radio" id="GPay" name="payment" value="GPay">
<label for="gpay">GPay</label><br>
<input type="radio" id="PhonePe" name="payment" value="PhonePe">
<label for="phonepe">PhonePe</label><br>
<input type="radio" id="Cash" name="payment" value="Cash">
<label for="Cash">Cash</label>
</div>
<h3>Click Next to Proceed Further</h3>
<a href="booking"> Next </a>
</div>
</body>
</html>