<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>La liste des utilisateurs</title>
	</head>
	<body>
		<!-- integration du menu -->
		<jsp:include page="../jsp/welcome.jsp"></jsp:include>
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Email</th>
						<th>Etat</th>
					</tr>
				</thead>
				<tbody>
			<c:forEach items="${userList}" var="user">
					  <tr>
						<td>${user.id }</td>
						<td>${user.email }</td>
						<td>${user.state }</td>
					  </tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		</body>
</html>