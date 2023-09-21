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
				<th>Name</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id_producttype}</td>
					<td>${product.tag_name}</td>
					<td>${product.product_description}</td>
					<td>${product.tag_name}</td>

					<td>${product.producttype.id_producttype}</td>
					<td><a href="view?productId=${product.id_product}">view</a></td>
					<td><a href="update?productId=${product.id_product}">edit</a></td>
					<td><a href="delete?productId=${product.id_product}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>