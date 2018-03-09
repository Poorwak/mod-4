<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Category</th>
			<th>Price</th>
			<th>Online</th>
			<th>Action</th>
		</tr>
		
		<a:forEach var="mob" items="${temp}">
			<tr>
				<td>${mob.mobId}</td>
				<td>${mob.mobName}</td>
				<td>${mob.mobCategory}</td>
				<td>${mob.mobPrice}</td>
				<td>${mob.online}</td>
				<td>
					<a href="delete?id=${mob.mobId}">DELETE</a>
					<a href="">UPDATE</a>
				</td>	
			</tr>	
		</a:forEach>	
	</table>

</body>
</html>