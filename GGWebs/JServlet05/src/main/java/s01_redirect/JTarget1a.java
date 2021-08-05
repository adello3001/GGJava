package s01_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jtarget1a")
public class JTarget1a extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String msg = request.getParameter("msg");
		
		out.println("<html><body>");
		out.println("<h1>sendRedirect</h1>");
		out.println("<hr>");
		out.println("<p>jstarter1a에서 jtarget1a으로 이동</p>");
		out.println("<p>메시지:" + msg + "</p>");
		out.println("</body></html>");
	}

}
