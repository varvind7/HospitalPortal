package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testservice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"bookAppointment.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("    <div id=\"blueHeader\">\n");
      out.write("      <span id=\"title\" >HospitalPortal </span>\n");
      out.write("      <span id=\"headerNav\"><a href=\"index.html\" style=\"color:#FFFFFF\" >Home</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; <a class=\"topNav\" href=\"login.html\" style=\"color:#FFFFFF\">Login</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Appointment&nbsp;&nbsp; |&nbsp;&nbsp; Search</span>\n");
      out.write("      <img src=\"stethoscope-simple-black-icon-512.png\" alt=\"logo\" id=\"blueLogo\">\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("</header>\n");
      out.write("<div id=\"divpadding\">\n");
      out.write("    <h2 style=\"margin-left: 30%;\">Diet Chart for various Diseases</h2>\n");
      out.write("            <br>\n");
      out.write("            <p>Select your illness</p>\n");
      out.write("            <br>\n");
      out.write("        <form name=\"f1\" method=\"get\" action=\"client\">\n");
      out.write("            <input type=\"radio\" name=\"illness\" value=\"fever\">Fever\n");
      out.write("            <br>\n");
      out.write("            <input type=\"radio\" name=\"illness\" value=\"cough\">Cough\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" name=\"submit\" value=\"Get Diet\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("<footer>\n");
      out.write("\t<span class=\"auto-style1\">Email&nbsp; </span><span id=\"preFooter\">|&nbsp;&nbsp; Facebook&nbsp;&nbsp; |&nbsp;&nbsp; Twitter&nbsp;&nbsp; |&nbsp; \n");
      out.write("\tGoogle+ </span><br>\n");
      out.write("\t&copy; Copyright Arvind Narayan - RA1511020010043 - SRM University\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
