package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>Doctor Registration</title>\n");
      out.write("\t<link href=\"registrationDoctor.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("    <div id=\"blueHeader\">\n");
      out.write("      <span id=\"title\">HospitalPortal</span>\n");
      out.write("      <span id=\"headerNav\"><a href=\"index.html\" style=\"color:#FFFFFF\" >Home</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Login&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Appointment&nbsp;&nbsp; |&nbsp;&nbsp; Search</span>\n");
      out.write("      <img src=\"stethoscope-simple-black-icon-512.png\" alt=\"logo\" id=\"blueLogo\">\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("</header>\n");
      out.write("       \n");
      out.write("        <div id=\"divpadding\">\n");
      out.write("<form name=\"f1\" acrion=\"newjsp.jsp\" style=\"margin-left:30px\">\n");
      out.write("\tFirst Name &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Middle Name &emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Last Name\n");
      out.write("\t<br>\n");
      out.write("\t<input type=\"text\" name=\"firstname\" required>\n");
      out.write("\t&nbsp;&nbsp;\n");
      out.write("\t<input type=\"text\" name=\"middlename\">\n");
      out.write("\t&nbsp;&nbsp;\n");
      out.write("\t<input type=\"text\" name=\"lastname\" required>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>Profile Picture:\n");
      out.write("\t<input type=\"file\" name=\"profilepic\" accept=\"image/*\">\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tDoctor ID:\n");
      out.write("\t\t<input type=\"text\" name=\"doctorid\" required>\n");
      out.write("\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tEmail:\n");
      out.write("\t\t<input type=\"Email\" name=\"email\" required>\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tMobile:\n");
      out.write("\t\t<input type=\"number\" name=\"Mobile\" required>\n");
      out.write("\t</label>\n");
      out.write("\t<label>\n");
      out.write("\tDate of Birth:\n");
      out.write("\t&nbsp;<input type=\"date\" data-date-inline-picker=\"true\" name=\"dob\" required />\n");
      out.write("\t<br><br>\n");
      out.write("\t</label>\n");
      out.write("\t<label>\n");
      out.write("\tpassword: &nbsp;\n");
      out.write("\t<input type=\"password\" name=\"password\" required />\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\tRetype password: &nbsp;\n");
      out.write("\t<input type=\"password\" name=\"passwordcheck\" required />\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tSpecialized in:\n");
      out.write("\t\t<input type=\"text\" name=\"\" required>\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tVisiting Time:\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Mon\">Mon\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Tue\">Tue\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Wed\">Wed\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Thu\">Thu\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Fri\">Fri\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Sat\">Sat\n");
      out.write("\t\t<input type=\"checkbox\" name=\"Visiting\" value=\"Sun\">Sun\n");
      out.write("\t\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tTime Slot:\n");
      out.write("\t\t<input type=\"checkbox\" name=\"timing\" value=\"6-8am\">6-8am\n");
      out.write("\t\t<input type=\"checkbox\" name=\"timing\" value=\"8-10am\">8-10am\n");
      out.write("\t\t<input type=\"checkbox\" name=\"timing\" value=\"10-12am\">10-12am\n");
      out.write("\t\t<input type=\"checkbox\" name=\"timing\" value=\"4-6pm\">4-6pm\n");
      out.write("\t\t<input type=\"checkbox\" name=\"timing\" value=\"6-8pm\">6-8pm\n");
      out.write("\t\t<input type=\"checkbox\" name=\"timing\" value=\"8-10pm\">8-10pm\n");
      out.write("\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<label>\n");
      out.write("\t\tFees Charged:\n");
      out.write("\t\t<input type=\"number\" name=\"fees\">\n");
      out.write("\t</label>\n");
      out.write("\t<br><br>\n");
      out.write("\t<input type=\"submit\" name=\"\">\n");
      out.write("        \n");
      out.write("        ");

            out.println("hello");
           String name="arv";
      out.write('\n');
 String address="12";
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web","root","root");
Statement st=con.createStatement();
st.executeUpdate("insert into login values('"+name+"','"+address+"','Patient"+"');");
out.println("Data is inserted successfully");
}
catch (Exception e)
{
    out.println(e.getMessage());
}


            
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("<footer>\n");
      out.write("\t<span class=\"auto-style1\">Email&nbsp; </span><span id=\"preFooter\">|&nbsp;&nbsp; Facebook&nbsp;&nbsp; |&nbsp;&nbsp; Twitter&nbsp;&nbsp; |&nbsp; \n");
      out.write("\tGoogle+ </span><br>\n");
      out.write("\t&copy; Copyright Arvind Narayan - RA1511020010043 - SRM University\n");
      out.write("</footer>\n");
      out.write("        \n");
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
