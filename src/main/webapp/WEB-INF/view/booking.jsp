<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Place Order</title>
</head>
<body>
<div align="center">
<h1>Welcome to Booking Page</h1>
<br>
<h3>Enter the Following Details</h3>
<br>
<form action="addbooking" method="post">

Enter the First Name: <input type="text" name="firstname" id="firstname"> <br><br>

Enter the Last Name: <input type="text" name="lastname" id="lastname"> <br><br>

Enter the Email: <input type="text" name="emailid" id="emailid"> <br><br>

Enter the User Type: <input type="text" name="usertype" id="usertype"> <br><br>

Enter the Address: <input type="text" name="address" id="address"> <br><br>

Enter the City: <input type="text" name="city" id="city"> <br><br>

Enter the State: <input type="text" name="state" id="state"> <br><br>

Enter the Country: <input type="text" name="country" id="country"> <br><br>

Enter the Contact-No: <input type="text" name=mobilenumber id="mobilenumber"> <br><br>

Enter the OTP: <input type="text" name="otp" id="otp"> <br><br>

<input type = "submit" value = "Confirm">

</form>

</div>
</body>
</html>