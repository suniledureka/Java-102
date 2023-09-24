package co.edureka.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>edureka</title></head>");
		out.println("<body style=\"background:linear-gradient(to right, orange, white, green); text-align:center\">");
		out.println("<h1>edureka limited</h1>");
		out.println("<img src=images/edureka.png width=350px>");
		out.println("<hr>");
		
		String user = request.getParameter("txt_uid");
		out.println("<p style=\"text-align:left;font-size:18px\">Hello "+ user+"</p>");
		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
