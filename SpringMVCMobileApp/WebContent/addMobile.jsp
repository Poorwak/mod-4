<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<for:form method="post" action="insertdata" modelAttribute="my">		<!-- my is the model Attribute name given to the controller -->
	<table>
		<tr>
			<td>Mobile ID: </td>
			<td><for:input path="mobId"/></td>
		</tr>	
		
		<tr>
			<td>Mobile Name: </td>
			<td><for:input path="mobName"/></td>
		</tr>
		
		<tr>
			<td>Mobile Category: </td>
			<td><for:select path="mobCategory" items="${categ}"/></td>
		</tr>
		
		<tr>
			<td>Mobile Price: </td>
			<td><for:input path="mobPrice"/></td>
		</tr>
		
		<tr>
			<td>Online: </td>
			<td><for:radiobutton path="online" value="Yes"/>Yes</td>
			<td><for:radiobutton path="online" value="No"/>No</td>
		</tr>
		
		<tr>
			<td><for:button type="submit" value="Add Mobile">Submit</for:button></td>
		</tr>
	</table>
</for:form>

</body>
</html>