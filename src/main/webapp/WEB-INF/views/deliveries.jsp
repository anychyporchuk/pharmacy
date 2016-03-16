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
	<a href="<c:url value="/medicaments"/>"><h3>Medicaments</h3></a>
	<a href="<c:url value="/deliveries"/>"><h3>Deliveries</h3></a>
	<c:if test="${!empty deliveryList}">
		<table class="data">
			<tr>
				<th>ID</th>
				<th>Medicament</th>
				<th>Date of delivery</th>
				<th>Count</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${deliveryList}" var="delivery">
				<tr>
					<td>${delivery.ID}</td>
					<td>${delivery.medicament.getName()}</td>
					<td>${delivery.deliveryDate}</td>
					<td>${delivery.medicamentCount}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>