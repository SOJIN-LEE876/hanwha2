<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
<link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />
<title>home</title>

 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<link rel="stylesheet" href="/myapp/resources/css/bootstrap.css">
<link rel="stylesheet" href="/myapp/resources/css/ct-navbar.css">
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
.button:hover{
    background-color: black;
}


.hover3:hover{ box-shadow: 0 80px 0 0 rgba(0,0,0,0.25) inset, 0 -80px 0 0 rgba(0,0,0,0.25) inset;} 


body {
  background-color: #FFF8DC;
}


h2.multi-line-highlightor {
  font: 50px sans-serif;
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

.shadow1{
	color: black;
	text-shadow : 2px 2px 5px grey;
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
	
	<button  class ="button" onclick="location.href='/myapp'">홈</button>
	<button  class = "button"  onclick="location.href='/myapp/homeintro/intro'">훈련소개</button>
	<button  class = "button" onclick="location.href='/myapp/homeintro/goal'">훈련목적</button>
	<button  class = "button" onclick="location.href='/myapp/schedule/schedulelist'">훈련 스케쥴</button>
	<button  class = "button" onclick="location.href='/myapp/member/memberlist'">훈련생 list</button>
	<button  class = "button" onclick="location.href='/myapp/member/assignmentlist'">과제 제출</button>
	<br>
	<h1 style="background-color:gray; color: white;text-shadow : 2px 2px 5px black;" align="center" >계산교회 청년부 DTS</h1>
	<h2 class="multi-line-highlightor" align="center"><span><span>계산교회 청년2부 제자 훈련 홈페이지에 오신 것을 진심으로 환영합니다!</span></span></h2>
	<h3 class="shadow1" align="center">천하보다 귀한 형제, 자매들을 만나 뵙게 되어 반갑습니다♥</h3>
	<br>
	<div align="center">
	<img src="/myapp/resources/photo.jpeg" align="middle" onclick="location.href='https://haneuljeja.tistory.com/'"/>
	</div>
<script src="https://static.codepen.io/assets/editor/live/css_reload-5619dc0905a68b2e6298901de54f73cefe4e079f65a75406858d92924b4938bf.js"></script>


</body>
</html>