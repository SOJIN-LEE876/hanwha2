<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src="../Common/js/jquery-3.4.1.min.js"></script>
	</head>
	
	<body>
		<h1>직원목록</h1>
		<table border="1">
		<tr>
			<td>직원번호</td><td>직원이름</td><td>직원성</td>
			<td>이메일</td><td>전번</td><td>급여</td><td>직무</td>
			<td>입사일</td><td>매니저</td><td>부서</td><td>커미션</td>
		</tr>
		<c:forEach var="emp" items="${emplist }">
		<tr>
			<td>${emp.employee_id}</td>
			<td>${emp.first_name }</td>
			<td>${emp.last_name }</td>
			<td>${emp.email }</td>
			<td>${emp.phone_number }</td>
			<td>${emp.salary }</td>
			<td>${emp.job_id }</td>
			<td>${emp.hire_date }</td>
			<td>${emp.manager_id }</td>
			<td>${emp.department_id }</td>
			<td>${emp.commission_pct }</td>
		</tr>
		</c:forEach>
		</table>
		
	</body>
</html>