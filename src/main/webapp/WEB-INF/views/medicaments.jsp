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
	
	<h4>Add medicament</h4>
	<form:form method="post" action="add" commandName="medicament">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input required="required" path="name" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td>
					<select>
						<c:forEach items="${catList}" var="cat">
							<option>${cat.getCategoryName()}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input type="number" path="price" /></td>
			</tr>
			<tr>
				<td>Subs</td>
				<td>
					<select multiple >
						<c:forEach items="${substList}" var="sub">
							<option>${sub.getSubstanceName()}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit"
				value="Add" /><input type="reset"
				value="Clear" /></td>
		</tr>
		</table>
	</form:form>
	<c:if test="${!empty medicamentList}">
		<table class="data">
			<tr>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th>Sublist</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${medicamentList}" var="medicament">
				<tr>
					<td>${medicament.name}</td>
					<td>${medicament.category.getCategoryName()}</td>
					<td>${medicament.price}</td>
					<td>
						<select >
							<c:forEach items="${medicament.getSubList()}" var="sub">
								<option>${sub.getSubName()}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>