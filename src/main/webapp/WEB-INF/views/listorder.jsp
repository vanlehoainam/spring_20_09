<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="add">add</a>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Date</th>
				<th>ID_customer</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${orderrs}" var="orderr">
				<tr>
					<td>${orderr.id_order}</td>
					<td>${orderr.date}</td>
					<td>${orderr.customer.id_customer}</td>
					<td><a href="view?productId=${product.id_product}">view</a></td>
					<td><a href="updateorder?orderID=${orderr.id_order}">edit</a></td>
					<td><a href="delete?productId=${product.id_product}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>