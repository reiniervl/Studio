package com.rvlstudio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloStudio
 */
@WebServlet("/HelloStudio")
public class HelloStudio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloStudio() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.append(""
		+"<!DOCTYPE html>\n"
		+"<html>\n"
		+"<head>\n"
		+"	<meta charset=\"utf-8\"/>\n"
		+"	<title>RvL Studio</title>\n"
		+"	<link rel=\"stylesheet\" href=\"css/main.css\"></link>\n"
		+"</head>\n"
		+"<body>\n"
		+"	<header>\n"
		+"		<section>\n"
		+"			<h1>because every zen needs a pebble</h1>\n"
		+"		</section>\n"
		+"		<nav style=\"float:right;\">\n"
		+"			<a href=\"http://rvlstudio.com\">rvlstudio</a>\n"
		+"			<a href=\"http://studio-reinier.rhcloud.com\">openshift</a>\n"
		+"		</nav>\n"
		+"	</header>\n"
		+"	<section id=\"main\">\n"
		+"	</section>\n"
		+"	<footer>\n"
		+"		<div class=\"logo\"><a href=\"https://www.openshift.com/\"></a></div>\n"
		+"	</footer>\n"
		+"</body>\n"
		+"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
