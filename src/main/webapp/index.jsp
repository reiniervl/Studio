<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.io.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>RvL Studio</title>
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Droid+Sans" ></link>
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nova+Round"></link>
	<link rel="stylesheet" href="css/main.css"></link>
</head>
<body>
	<header>
		<section>
			<h1>because every zen needs a pebble</h1>
		</section>
		<nav style="text-align: right;">
			<a href="http://rvlstudio.com">rvlstudio</a>
			<a href="http://studio-reinier.rhcloud.com">openshift</a>
		</nav>
	</header>
	
	<section id="main">
		2 + 2 = <%= 2 + 2 %>
		    <p style="float:right;clear:right;">
			Logged in at: 
			<%
			    Date d = new Date();
			    out.print(d.toString());
			%>
		    </p>
	</section>
	
	<footer style="border-top:1px solid #ddd;">
		<div class="logo"><a href="https://www.openshift.com/"></a></div>
	</footer>
</body>
</html>