package com.spmp.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/gobabspmp")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String server_content = """
				<!DOCTYPE html>
				<htmL>
				<head>
				<link href="https://fonts.googleapis.com/css2?family=JetBrains+Mono&display=swap" rel="stylesheet">
				<style>
					* {
						font-family: "JetBrains Mono", monospace;
						padding: 0px;
					}
					
					body {
						display: flex;
						flex-direction: column;
						height: 100vh;
						justify-content: center;
						alignt-items: center;
						background-color: #f0f0f0;
					}
					
					h1 {
						margin: 1rem;
						padding: 2rem;
						font-size: 40px;
						text-align: center;
					}
					
					button {
						align-items: center;
						width: 6rem;
						height: 3rem;
					}
					
					section {
						width: 450px;
						height: 300px;
						background-image: url('http://spmp.pmu.edu.my/images/backgroundsim.png');
						align-items: center;
						margin: 1rem;
						margin-left: 32%;
						padding: 1rem;
						background-color: #2596be;
					}
					
					input {
						margin: 1rem;
					}
					
					img {
						margin: 1rem;
						padding: 2rem;
						width: 2rem;
						height: 2rem;
					}
					
					label {
						font-size: 1rem;
					}
				</style>
					<title>SPMP Login Page</title>
				</head>
				<body>
					<h1>SPMP LOGIN PAGE</h1>
					<section>
						<form>
							<label>No.KP</label><input type="text" method="POST">
							<br>
							<label>Katalaluan</label><input type="text" method="POST">
							<button type="button">Login Pengguna</button>
						</form>
					</section>
				</body>
				</html>
				""";
		
		out.println(server_content);
		System.out.println(message);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		message = "application initialized...";
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("POST sent.");
		doGet(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Application closed.");
		super.destroy();
	}
	

}
