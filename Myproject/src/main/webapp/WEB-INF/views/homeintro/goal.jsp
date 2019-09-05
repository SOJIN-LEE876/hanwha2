<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
<link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />

<title>goal</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="/myapp/resources/js/bootstrap.js"></script>

<link rel="stylesheet" href="/myapp/resources/css/bootstrap.css">

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

h3.multi-line-highlightor {
  font: sans-serif;
  text-align: center;
  font-weight: bold;
  width: 50%;
  margin: 1em auto;
  position: relative;
  top:0
}

.multi-line-highlightor > span {
  box-shadow: 0 .25em 0 0 orange, 0 .25em 0 0 orange;
}

.multi-line-highlightor span span {
  position: relative;
  top: .68em;
  padding: 0 1rem;
  -webkit-box-decoration-break: clone;
  box-decoration-break: clone;
}
.button {
	border-radius:10px 0 10px 0; 
    width:100px;

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

}
.body {
  background-color: #FFF8DC;
}
h3{
	color: black;
	text-shadow : 1px 1px 3px grey;
}
h2{
	color: black;
	text-shadow : 2px 2px 2px grey;
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
	<button  class = "button" onclick="location.href='/myapp'">홈</button>
	<button  class = "button" onclick="location.href='/myapp/homeintro/intro'">훈련소개</button>
	<button  class = "button" onclick="location.href='/myapp/homeintro/goal'">훈련목적</button>
	<button  class = "button" onclick="location.href='/myapp/schedule/schedulelist'">훈련 스케쥴</button>
	<button  class = "button" onclick="location.href='/myapp/member/memberlist'">훈련생 list</button>
	<button  class = "button" onclick="location.href='/myapp/member/assignmentlist'">과제 제출</button>
	<br>
	
	<h1 style="background-color:gray; color: white;text-shadow : 2px 2px 5px black;" align="center">계산교회 청년부 DTS</h1>
	<h2 style="border:1px solid black;border-left:#55555B 10px solid;border-right:#55555B 10px solid;" align="center">목적</h2>  
 	<br>
	<br>
<div align="center">
   <h3><span style="text-decoration: underline;">■ 제자도(그리스도인의 삶의 방식)를 내 것으로 만든다.</span></h3>
   <h3><span style="text-decoration: underline;">■ 평생 지속할 수 있는 Spiritual Formation의 틀을 마련한다.</span></h3>
   <h3><span style="text-decoration: underline;">■ 소그룹 리더로서 기본적인 자질을 갖춘다.</span></h3>
   <h3><span style="text-decoration: underline;">■ 공동체를 소중히 여기는 제자가 된다.</span></h3>
   <h3><span style="text-decoration: underline;">■ 소그룹을 통해 성숙한 관계를 만들어 간다.</span></h3>
   <h3><span style="text-decoration: underline;">■ 각 개인에 있어서 구체적 삶의 변화를 추구한다.</span></h3>
   <h3><span style="text-decoration: underline;">■ 영성과 지성이 균형 잡힌 그리스도인이 된다.</span></h3>
</div>
</body>
</html>