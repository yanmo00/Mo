/*
 * package aaa;
 * 
 * import java.io.IOException; import java.io.PrintWriter;
 * 
 * import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 *//**
	 * Servlet implementation class bbb
	 */
/*
 * @WebServlet("/bbb") public class bbb extends HttpServlet { private static
 * final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * public bbb() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { // TODO Auto-generated
 * method stub response.setContentType("text/html"); String
 * a1=request.getParameter("a"); String a2=request.getParameter("b"); double a =
 * Double.parseDouble(a1); double b = Double.parseDouble(a2); double result =
 * a+b; // PrintWriter out = response.getWriter(); //
 * out.println("<html><body>"); // out.println("<p>" + a + " + " + b + " = " +
 * result + "</p>"); // out.println("</body></html>");
 * request.setAttribute("result", result); // System.out.println(result);
 * request.getRequestDispatcher("second.jsp").forward(request, response); }
 * 
 *//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO Auto-generated
		 * method stub doGet(request, response); }
		 * 
		 * }
		 */