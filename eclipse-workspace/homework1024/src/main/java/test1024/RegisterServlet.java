package test1024;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


/**
 * Servlet implementation class VIPTest
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<VIP> users = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset = UTF-8");
		// scanner
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");

//		检查用户名是否已经存在
		boolean isExist = users.stream().anyMatch(user -> user.getUsername().equals(username));
		

		if(isExist) {
//			页面重定向
			try {
				String encodedMessage = URLEncoder.encode("用户名不存在！", "UTF-8");
				response.sendRedirect("RegisterError.jsp?message=" + encodedMessage);
				return;
			}catch(IllegalStateException e) {
				e.printStackTrace();
			}
		}
		
//		储存用户信息
		VIP newUser = new VIP(username,password,sex,phone);
		users.add(newUser);
		
		response.sendRedirect("success.jsp");
		
		response.getWriter().println("<h1>注册成功！<h1>");
		response.getWriter().println("<h2>用户名：<h2>" + username);
		response.getWriter().println("<h2>密码：<h2>" + password);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
