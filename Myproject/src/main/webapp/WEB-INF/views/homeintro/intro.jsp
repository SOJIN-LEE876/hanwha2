<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
<link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />
<title>intro</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="/myapp/resources/js/bootstrap.js"></script>

<link rel="stylesheet" href="/myapp/resources/css/bootstrap.css">

<style>
.article{font-size: 200%;text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.2);color: #666;PADDING-BOTTOM: 10px;TEXT-ALIGN: left;BORDER-LEFT: #55555B 8px solid;padding: 3px 5px;margin: 5px 0;BACKGROUND-COLOR: #FFF;border-bottom: 1px solid #000; } 

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

.body {
	background-color: #FFF8DC;
}
h2.multi-line-highlightor {
  font: sans-serif;
  color: black;
	text-shadow : 2px 2px 5px grey;
  text-align: center;
  font-weight: bold;
  width: 50%;
  margin: 1em auto;
  position: relative;
  top:0
}

.multi-line-highlightor > span {
  box-shadow: 0 .35em 0 0 orange, 0 .35em 0 0 orange;
}

.multi-line-highlightor span span {
  position: relative;
  top: .68em;
  padding: 0 1rem;
  -webkit-box-decoration-break: clone;
  box-decoration-break: clone;
}
.button {
	width: 100px;
	background-color: #ddd;
	border: none;
	font: 50px sans-serif;
 	color: white;
	text-shadow : 2px 2px 3px black;
	padding: 15px 0;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 4px;
	cursor: pointer;
	border-radius:10px 0 10px 0; 
}
.shadow1{
	color: black;
	text-shadow : 2px 2px 5px grey;
}
.button:hover {
    background-color: black;
}
</style>
<script>
  window.console = window.console || function(t) {};
</script>
<script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>
</head>
<body class="body">
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
	<h1 style="background-color: gray; color: white;text-shadow : 2px 2px 5px black;" align="center">계산교회 청년부 DTS</h1>
	<h2 class="shadow1" style="border: 1px solid black;border-left:#55555B 10px solid;border-right:#55555B 10px solid; " align="center">훈련 소개</h2>
	 
	<br>
	<br>

	<div align="center" style="text-align: center;">
	<h2 class="shadow1">제자 훈련은 예수 그리스도의 제자로 살아가기 위해</h2>
	<h2 class="shadow1">일정기간 동안 말씀과 생활의 훈련을 통해</h2>
	<h2 class="shadow1">예수님의 인격과 성품을 배워가는 신앙 성숙의 과정(Spiritual
		Formation)입니다.</h2>
	<h2 class="shadow1">물론 그리스도인이 된 후에 평생을 제자로 훈련받아야 하지만,</h2>
	<h2 class="shadow1">특별한 기간을 정하여 이 기간 동안에 신앙 생활 훈련에 시간을 집중적으로 투자함으로 </h2>
	<h2 class="shadow1">그리스도인으로서 반드시 갖춰야할 ’기본 생활‘을 형성하는 것이 </h2>
	<h2 class="shadow1">제자 훈련의 기본 목표입니다.</h2>
	<h2 class="shadow1">그러므로 제자 훈련의 기간 동안에 여러분의 삶에서 최우선 순위를
		제자 훈련에 두어야 합니다.</h2>
	<h2 class="shadow1">제자 훈련을 통해 자신을 변화시키고 세상을 변화시킬 수 있는
		그리스도의 제자로 거듭나기 위해서</h2>
	 
	<h2 class="multi-line-highlightor" ><span><span>형제, 자매들의 과감한 결단을 기대합니다.</span></span></h2>
	</div>
	<script src="https://static.codepen.io/assets/editor/live/css_reload-5619dc0905a68b2e6298901de54f73cefe4e079f65a75406858d92924b4938bf.js"></script>

</body>
</html>