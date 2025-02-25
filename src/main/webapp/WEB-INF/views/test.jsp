<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>for test</title>
</head>
<body>
	<h1>${addResult}</h1>
	<table>
		<c:forEach items="${departments}" var="department">
			<tr>
				<td>${department.getDepartmentId()}</td>
				<td>${department.getDepartmentNo()}</td>
				<td>${department.getDepartmentName()}</td>
				<td>${department.getDepartmentSize()}</td>
				<td>${department.getDepartmentManager()}</td>
				<td>${department.getRemark()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>