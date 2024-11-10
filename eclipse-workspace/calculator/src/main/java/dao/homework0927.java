package dao;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/homework0927")
public class homework0927 extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // 设置响应内容类型
		resp.setContentType("text/html");
        
        // 获取用户输入
        String aStr = req.getParameter("a");
        String bStr = req.getParameter("b");
       
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double result = a + b;
        req.setAttribute("a", a);
        req.setAttribute("b", b);
        req.setAttribute("result", result);
		  
        // 请求转发到JSP页面
        req.getRequestDispatcher("AddCalculator.jsp").forward(req, resp);
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		doGet(req, resp);
	}
	

}
