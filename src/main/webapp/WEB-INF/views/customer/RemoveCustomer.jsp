<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers</title>
</head>
<body>
	<table>
		<c:forEach var="customer" items="${customers}" >
		<tr>
			<td><c:out value="${customer.firstName}"/></td>
			<td><c:out value="${customer.surName}" /></td>
			<td><c:out value="${customer.age}" /></td>
			<td><c:out value="${customer.address}" /></td>
			<td><a href="/CustomerMenu/RemoveCustomer/customer.firstName" />Remove</td> 
		</tr>
		</c:forEach>
	</table>
</body>
</html>