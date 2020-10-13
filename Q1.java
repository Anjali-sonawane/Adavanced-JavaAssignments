package serv;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/Q1")

	

		
	public class Q1 extends HttpServlet {
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.print("<h1>Welcome to servlet world!!!!</h1>");
			out.flush();
			out.close();
			
		}
		

	}


