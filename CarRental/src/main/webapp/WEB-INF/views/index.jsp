<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Rental Home</title>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="./resources/javascript/myJS.js" ></script>
<script type="text/javascript">
	function getText(){
//		$("#content").html("My Name is Joe");
		$(".subMenu").show();
	}
	
</script>
<link rel="stylesheet" href="./resources/css/myStylesheet.css" />
</head>
<body>
	<nav>
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">Vehicle Menu</a>
				<ul class="subMenu">
					<li><a href="#">Add Vehicle</a></li>
					<li><a href="#">Delete Vehicle</a></li>
					<li><a href="#">View Vehicles</a></li>
				</ul>
			</li>
			<li><a href="/CarRental/CustomerMenu">Customer Menu</a>
				<ul class="subMenu">
					<li><a href="AddCustomer.jsp">Add Customer</a></li>
					<li><a href="RemoveCustomer.jsp">Remove Customer</a></li>
					<li><a href="ViewCustomer.jsp">view Customers</a></li>
				</ul>
			</li>
			<li><a href="#">Rental Menu</a>
				<ul class="subMenu">
					<li><a href=#">Rent Vehicle</a></li>
				</ul>
			</li>
		</ul>
	</nav>
	
	<div id="content" class="content">
	</div>
</body>
</html>