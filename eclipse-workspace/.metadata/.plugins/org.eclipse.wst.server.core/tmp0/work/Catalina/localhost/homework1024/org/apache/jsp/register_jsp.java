/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-10-31 06:56:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>会员系统</title>\r\n");
      out.write("<style>\r\n");
      out.write("		.mydiv{\r\n");
      out.write("			    margin-top: 20px;\r\n");
      out.write("			    margin-right: auto;\r\n");
      out.write("			    margin-left: auto;\r\n");
      out.write("			    margin-bottom: auto;\r\n");
      out.write("			    width: 300px;\r\n");
      out.write("			    height: 350px;\r\n");
      out.write("			    border: 2px solid #000000;\r\n");
      out.write("			    background-color: #FFFFFF;\r\n");
      out.write("			    padding-right: 0px;\r\n");
      out.write("			    padding-top: 40px;\r\n");
      out.write("			    color: #209080;\r\n");
      out.write("			    font-style: italic;\r\n");
      out.write("			    font-size: large;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.d0 {\r\n");
      out.write("			    margin-top: 200px;\r\n");
      out.write("			    margin-right: auto;\r\n");
      out.write("			    margin-left: auto;\r\n");
      out.write("			    margin-bottom: auto;\r\n");
      out.write("			    background-color: #FFFFFF;\r\n");
      out.write("			    width: 400px;\r\n");
      out.write("			    padding-top: 30px;\r\n");
      out.write("			    background-image: url(preview.jpg);\r\n");
      out.write("			    height: 450px;\r\n");
      out.write("			}\r\n");
      out.write("		form{\r\n");
      out.write("			width:300px;\r\n");
      out.write("			margin:auto;\r\n");
      out.write("		}\r\n");
      out.write("		.button{\r\n");
      out.write("			background-color:#0AF;\r\n");
      out.write("			color:white;\r\n");
      out.write("			border:1px solid #ccc;\r\n");
      out.write("			border-radius:5px;\r\n");
      out.write("			margin-top:30px;\r\n");
      out.write("			margin-left:40px;\r\n");
      out.write("			height: 35px;\r\n");
      out.write("			width: 90px\r\n");
      out.write("		}\r\n");
      out.write("		input[type=text],input[type=password],input[type=radio],input[type=number]{\r\n");
      out.write("			padding:5px 20px;\r\n");
      out.write("			margin:10px 0;\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		<div class=\"d0\">\r\n");
      out.write("			<div class=\"mydiv\">\r\n");
      out.write("				<p align=\"center\"><strong><em><font style=\"color:#006274\">会 员 系 统</font></em></strong></p>\r\n");
      out.write("				<form action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("						<label for=\"username\" style=\"margin-left:5px\">用户名:</label>&nbsp;\r\n");
      out.write("						<input type=\"text\" name=\"username\" />\r\n");
      out.write("						<br/>\r\n");
      out.write("						\r\n");
      out.write("						<label for=\"password\" style=\"margin-left:5px\">密码:</label>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("						<input type=\"password\" name=\"password\" style=\"margin-left:5px\"/>\r\n");
      out.write("						<br/>\r\n");
      out.write("						\r\n");
      out.write("						<label for=\"sex\" name=\"sex\" id=\"sex\" style=\"margin-left:5px\">性别:</label>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("						<input type=\"radio\" name=\"sex\" value=\"male\" required style=\"margin-left:10px\"> 男\r\n");
      out.write("				        <input type=\"radio\" name=\"sex\" value=\"female\" required style=\"margin-left:40px\"> 女\r\n");
      out.write("				        <br/>\r\n");
      out.write("				        \r\n");
      out.write("				        <label for=\"phone\" name=\"phone\" id=\"phone\" style=\"margin-left:5px\">电话:</label>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("				        <input type=\"number\" name=\"phone\" id=\"phone\" style=\"margin-left:10px\">\r\n");
      out.write("				        <br/>\r\n");
      out.write("			            <tr>  \r\n");
      out.write("			                <td colspan=\"2\" style=\"text-align:center;\"> \r\n");
      out.write("			                    <input type=\"submit\" value=\"注册\" class=\"button\"> \r\n");
      out.write("			                    <input type=\"reset\" value=\"重置\" class=\"button\"> \r\n");
      out.write("			                </td>  \r\n");
      out.write("		          		</tr>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
