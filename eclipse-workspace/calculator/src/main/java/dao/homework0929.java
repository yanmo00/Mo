package dao;

import java.io.IOException;

import entity.Triangle;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/homework0929")
public class homework0929 extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		String high = req.getParameter("high");
		String bottom = req.getParameter("bottom");
		double highDouble = Double.parseDouble(high);
		double bottomDouble = Double.parseDouble(bottom);	
		
		Triangle triangle = new Triangle();
		triangle.setBottom(bottomDouble);
		triangle.setHigh(highDouble);
		triangle.setArea((bottomDouble * highDouble) * 0.5);
        req.setAttribute("high", triangle.getHigh());
        req.setAttribute("bottom", triangle.getBottom());
        req.setAttribute("area", triangle.getArea());
        req.getRequestDispatcher("TriangleArea.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		doGet(req,resp);
	}

}
