package mytest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class test
 */
@WebServlet("/test")

public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }
	ArrayList<St> mylist=new ArrayList<St>();
		/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		
		String xm=request.getParameter("xm");
		String cj=request.getParameter("cj");
		St stu=new St(xm,cj);
		mylist.add(stu);
		int sum=0;
		for(int i=0;i<=mylist.size()-1;i++)
		{
			sum=sum+Integer.parseInt(mylist.get(i).chengji);
		}
		float aver=sum/mylist.size();
		System.out.println("------------------------");
		PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<style>");
        out.println("table {");
        out.println("    width: 80%;");
        out.println("    border-collapse: collapse;");
        out.println("}");
        out.println("th, td {");
        out.println("    background-color: #f2f2f2;");
        out.println("}");
        out.println("</style>");
        out.println("<body>");
        out.println("<table  border=\"1\">");
        out.println("<tr><th>姓名</th><th>成绩</th></tr>");
		for(int i=0;i<=mylist.size()-1;i++) {
			String myn=mylist.get(i).name;
			String myc=mylist.get(i).chengji;
		    out.println("<tr>");
		    out.println("<td>"+myn+"</td>");
		    out.println("<td>"+myc+"</td>");
		    out.println("</tr>");
		}
		out.println("</table>");
	    out.println("</body>");
	    out.println("</html>");
		out.println("平均分");
		out.println(aver);

		String linkText = "点击成绩录入";
        String linkUrl = "NewFile.jsp";
        out.println("<a href=\"" + linkUrl + "\">" + linkText + "</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
