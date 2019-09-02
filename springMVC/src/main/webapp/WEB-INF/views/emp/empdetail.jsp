
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		 label{
		 	width: 150px;
		 	background-color: tomato;
		 	display:inline-block;
		 }
		 input{
		 }
		</style>
		<script>
			function call(){
				alert("수정할 수 없습니다.");
			}
			function select(){
				${emp.job_id}
			}
		</script>
	</head>
	
	<body>
		<h1>직원 정보 수정</h1>
		<form action="empdetail" method="post">
			<label>직원번호 :</label> <input type="number" name="employee_id" value="${emp.employee_id}" disabled="disabled" ><br>
				<input type="hidden" name="employee_id" value="${emp.employee_id}">
			<label>직원이름 :</label> <input type="text" name="first_name" value="${emp.first_name}"><br>
			<label>직원 성 :</label> <input type="text" name="last_name" value="${emp.last_name}" disabled="disabled"><br>
				<input type="hidden" name="last_name" value="${emp.last_name}">
			<label>직원 메일 :</label> <input type="email" name="email" value="${emp.email}"><br>
			<label>전화번호 :</label> <input type="tel" name="phone_number" pattern="\d{3}-\d{4}-\d{4}" value="${emp.phone_number}" ><br>
			<label>고용일 :</label> <input type="date" name="hire_date" value="${emp.hire_date}"><br>
			<label>직무 :</label>
			<select name="job_id">
				<c:forEach items="${joblist}" var="job">
					<option ${emp.job_id==job?"selected":""}>${job}</option>
				</c:forEach>
			</select>
			<br>
			<label>봉급 :</label> <input type="number" name="salary" value="${emp.salary}" ><br>
			<label>커미션 :</label> <input type="number" name="commission_pct" value="${emp.commission_pct}" ><br>
			<label>매니저번호 :</label>
			<select name="manager_id">
				<c:forEach items="${mlist}" var="m">
					<option ${emp.manager_id==m?"selected":""}>${m}</option>
				</c:forEach>
			</select>
			<br>
			<label>부서 :</label>
			<select name="department_id">
				<c:forEach items="${deptlist}" var="dept">
					<c:if test="${emp.department_id==dept.department_id}">
						<option selected="selected" value="${dept.department_id}">${dept.department_name}</option>
					</c:if>
					<c:if test="${emp.department_id!=dept.department_id}">
						<option value="${dept.department_id}">${dept.department_name}</option>
					</c:if>
					
				</c:forEach>
			</select>
			<br>
			<input type="submit" value="수정하기">
		</form>
	</body>
</html>