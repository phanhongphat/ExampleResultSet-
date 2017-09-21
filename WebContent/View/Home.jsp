<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "C" uri ="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = '1'>
		<tr>
			<th>Username</th>
			<th>Password</th>
		</tr>
		<c:forEach items = "${listaccount}" var ="l"> 
			<tr>
				<td>${l.uname}</td>
				<td>${l.password}</td>
			</tr>
		</c:forEach>
	
	
	</table>
</body>
</html>