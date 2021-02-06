package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Websiteservlet
 */
@WebServlet("/websiteservlet")
public class Websiteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Websiteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
String value = request.getParameter("websites");
		
		if(value.equals("google")) {
			response.sendRedirect("https://www.google.com/");
		}
		else if(value.equals("facebook")) {
			response.sendRedirect("https://www.facebook.com/");
		}
		else if(value.equals("instagram")) {
			response.sendRedirect("https://www.instagram.com/");
		}
		else if(value.equals("youtube")) {
			response.sendRedirect("https://www.youtube.com/");
		}
		else if(value.equals("watsapp")) {
			response.sendRedirect("https://web.whatsapp.com/");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
