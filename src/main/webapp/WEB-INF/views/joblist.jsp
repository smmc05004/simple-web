<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직종 리스트</h1>
	
	<table border="1" width="100%" >
		<thead>
			<tr>
				<th>job id</th>
				<th>job title</th>
				<th>min salary</th>
				<th>max salary</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="job" items="${jobs }">
				<tr>
					<td>${job.id }</td>
					<td>${job.title }</td>
					<td>${job.minSalary }</td>
					<td>${job.maxSalary }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>