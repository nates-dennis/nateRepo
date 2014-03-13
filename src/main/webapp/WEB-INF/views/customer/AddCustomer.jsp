<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	
	<form:form method="Post" modelAttribute="customer">
	    <form:label path="firstName">First name</form:label>
	    <form:input path="firstName" />
	    <br />

	    <form:label path="surName">Last name</form:label>
	    <form:input path="surName" />
	    <br />
	
		<form:label path="age" >Age</form:label>
		<form:select path="age" items="${ageList}" />
		<br />
		
    	<input type="submit" value="Submit" /> 
	</form:form>
</body>
</html>