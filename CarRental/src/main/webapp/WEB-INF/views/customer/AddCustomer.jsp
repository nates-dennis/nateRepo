<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	<form:form method="post" modelAttribute="customer">
	    <form:label path="firstName">First name</form:label>
	    <form:input path="firstName" />
	    <br />
	
	    <form:label path="surName">Last name</form:label>
	    <form:input path="surName" />
	    <br />
	
		<form:select path="age" items="${ageList}" />
		<br />
		
	    <input type="submit" value="Submit" />
	</form:form>
</body>
</html>