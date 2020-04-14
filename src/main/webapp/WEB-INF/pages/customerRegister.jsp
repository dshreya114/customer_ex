<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<form method="get" action="processRegister">

<label>Id</label>
<div>
<input type="text" name="custId">
</div>
<label>Name</label>
<div>
<input type="text" name="custName">
</div>

<input type="submit" value="Register">

</form>
</body>
</html>
