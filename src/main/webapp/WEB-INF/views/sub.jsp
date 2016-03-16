<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>Pharmacy</title>
</head>
<body>

<h3>Warehouse</h3>
<c:if test="${!empty subList}">
	<table class="data">
		<tr>
			<th>subName</th>
			<th>sub_price</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${subList}" var="sub">
			<tr>
				<td>${sub.substanceName}</td>
				<td>${sub.substancePrice}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>