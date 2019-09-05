
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html  lang="en">
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
<link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<title>Insert title here</title>

<style>
  @-webkit-keyframes sheen {
  0% {
    -webkit-transform: skewY(-45deg) translateX(0);
            transform: skewY(-45deg) translateX(0);
  }
  100% {
    -webkit-transform: skewY(-45deg) translateX(12.5em);
            transform: skewY(-45deg) translateX(12.5em);
  }
}
@keyframes sheen {
  0% {
    -webkit-transform: skewY(-45deg) translateX(0);
            transform: skewY(-45deg) translateX(0);
  }
  100% {
    -webkit-transform: skewY(-45deg) translateX(12.5em);
            transform: skewY(-45deg) translateX(12.5em);
  }
}
.wrapper {
  display: block;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
}

.button {
  padding: 0.75em 2em;
  text-align: center;
  text-decoration: none;
  color: #2194E0;
  border: 2px solid #2194E0;
  font-size: 24px;
  display: inline-block;
  border-radius: 0.3em;
  transition: all 0.2s ease-in-out;
  position: relative;
  overflow: hidden;
}
.button:before {
  content: "";
  background-color: rgba(255, 255, 255, 0.5);
  height: 100%;
  width: 3em;
  display: block;
  position: absolute;
  top: 0;
  left: -4.5em;
  -webkit-transform: skewX(-45deg) translateX(0);
          transform: skewX(-45deg) translateX(0);
  transition: none;
}
.button:hover {
  background-color: #2194E0;
  color: #fff;
  border-bottom: 4px solid #1977b5;
}
.button:hover:before {
  -webkit-transform: skewX(-45deg) translateX(13.5em);
          transform: skewX(-45deg) translateX(13.5em);
  transition: all 0.5s ease-in-out;
}

body {
  background-color: #FFF8DC;
}
label {
	width: 150px;
	background-color: tomato;
	display: inline-block;
}

input {
	
}

.button {
border-radius:10px 0 10px 0; 
	width: 100px;
	font: 50px sans-serif;
 	color: white;
	text-shadow : 2px 2px 3px black;
	background-color: #ddd;
	border: none;
	padding: 15px 0;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 4px;
	cursor: pointer;
}

.table {
	border-collapse: collapse;
	border-top: 3px solid #168;
}

.table th {
	color: #168;
	background: #f0f6f9;
	text-align: center;
}

.table th, .table td {
	padding: 10px;
	border: 1px solid #ddd;
}

.table th:first-child, .table td:first-child {
	border-left: 0;
}

.table th:last-child, .table td:last-child {
	border-right: 0;
}

.table tr td:first-child {
	text-align: center;
}

.table caption {
	caption-side: bottom;
	display: none;
}
.button:hover {
    background-color: black;
}

.button2 {

	width: 100px;
	background-color: #168;
	border: solid black 1px;
	font: 50px sans-serif;
	color: white;
	text-shadow: 2px 2px 3px black;
	padding: 15px 0;
	text-align: center;
	
	display: marker;
	font-size: 15px;
	margin: ;
	cursor: pointer;
}
.button2:hover {
	background-color:black;
	text-decoration: underline;
}
</style>
<script>
	function call() {
		alert("수정할 수 없습니다.");
	}
	
	
</script>
<script>
  window.console = window.console || function(t) {};
</script>
<script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>
</head>

<body>

	<button class="button" onclick="location.href='/myapp'">홈</button>
	<button class="button" onclick="location.href='/myapp/homeintro/intro'">훈련소개</button>
	<button class="button" onclick="location.href='/myapp/homeintro/goal'">훈련목적</button>
	<button class="button"
		onclick="location.href='/myapp/schedule/schedulelist'">훈련 스케쥴</button>
	<button class="button"
		onclick="location.href='/myapp/member/memberlist'">훈련생 list</button>
	<button class="button"
		onclick="location.href='/myapp/member/assignmentlist'">과제 제출</button>
	<br>
	<h1 style="background-color: gray;color: white;text-shadow : 2px 2px 5px black;" align="center">계산교회 청년부 DTS</h1>

	<h2 style="border: 1px solid black;border-left:#55555B 10px solid;border-right:#55555B 10px solid;" align="center">훈련생 정보 수정</h2>

	<div align="center">
		<table class="table">
			<tr>
				<td width="180" align="center">훈련생번호</td>
				<td width="150" align="center">이름</td>
				<td width="30" align="center">매니저번호</td>
				<td width="30" align="center">반번호</td>
			</tr>
		</table>
		<form action="memberdetail" method="post">
			<input type="number" name="m_id" value="${member.m_id}" disabled="disabled"> 
			<input type="hidden" name="m_id" value="${member.m_id}">
			<input type="text" name="m_name" value="${member.m_name}"> 
			<select name="manager_id">
				<c:forEach items="${mlist}" var="m">
					<option ${member.manager_id==m?"selected":""}>${m}</option>
				</c:forEach>
			</select> 
			<span></span>
			<select name="class_id">
				<c:forEach items="${mlist}" var="m2">
					<option ${member.manager_id==m2?"selected":""}>${m2}</option>
				</c:forEach>
			</select> 
			
			<br> <br>
			<input class="button2" type="submit" value="수정하기">
		</form>
	</div>
	<script src="https://static.codepen.io/assets/editor/live/css_reload-5619dc0905a68b2e6298901de54f73cefe4e079f65a75406858d92924b4938bf.js"></script>
</body>
</html>