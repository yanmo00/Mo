package test1024;


import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isValid = checkCredentials(username,password);
		if(isValid) {
			response.sendRedirect("welcome.jsp");
		}else {
			String encodedMessage = URLEncoder.encode("用户名不存在！", "UTF-8");
			response.sendRedirect("LoginError.jsp?message=" + encodedMessage);
			return;
		}
	}

	private boolean checkCredentials(String username, String password) {
	    List<VIP> users = RegisterServlet.users;

	    // 检查用户名是否存在于列表中
	    for (VIP user : users) {
	        if (username.equals(user.getUsername())) { // 使用 getUsername() 方法获取 user 对象的 username 属性
	            // 如果找到匹配的用户名，检查密码是否正确
	            return password.equals(user.getPassword()); // 使用 getPassword() 方法获取 user 对象的 password 属性
	        }
	    }
	    return false;
	}
}

	
