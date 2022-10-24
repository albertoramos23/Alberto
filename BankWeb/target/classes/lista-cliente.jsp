<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>lista</title>
</head>
<body>

	<h1>Cuenta Bancaria</h1>
	<h4>Lista de nuestros clientes</h4>

    
	
    <div class="border border-warning"> 

  	 ${requestScope.customer}  

	</div>

	<table>
		<c:forEach var="customer" items="${requestScope.lista}">
			<tr>
				<td>${customer.firstName} - ${customer.lastName}</td>
				<td>${customer.firstName} - ${customer.lastName}</td>
				<td>${customer.firstName} - ${customer.lastName}</td>
				<td>${customer.firstName} - ${customer.lastName}</td>
				<td>
				   ${requestScope.customer} 
				    
				</td>
				
			</tr>
		</c:forEach>
	</table>




</body>
</html>