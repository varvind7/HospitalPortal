/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author varvi
 */
public class login1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
            String user=request.getParameter("username");
          String pass=request.getParameter("password");  
          if(user!=null && pass!=null)
          {
              if(user.equals("arvind") && pass.equals("1234"))
              {
                  loginservelet.name="arvind";
                  Cookie cookie=new Cookie("username",loginservelet.name);
                  response.addCookie(cookie); 
                  out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<style>\n" +
"body, html {\n" +
"    height: 100%;\n" +
"    margin: 0;\n" +
"}\n" +
"\n" +
".bgimg {\n" +
"    background-image: url('/w3images/forestbridge.jpg');\n" +
"    height: 100%;\n" +
"    background-position: center;\n" +
"    background-size: cover;\n" +
"    position: relative;\n" +
"    color: #01A4EF;\n" +
"    font-family: \"Courier New\", Courier, monospace;\n" +
"    font-size: 25px;\n" +
"}\n" +
"\n" +
".topleft {\n" +
"    position: absolute;\n" +
"    top: 0;\n" +
"    left: 16px;\n" +
"}\n" +
"\n" +
".bottomleft {\n" +
"    position: absolute;\n" +
"    bottom: 0;\n" +
"    left: 16px;\n" +
"}\n" +
"\n" +
".middle {\n" +
"    position: absolute;\n" +
"    top: 50%;\n" +
"    left: 50%;\n" +
"    transform: translate(-50%, -50%);\n" +
"    text-align: center;\n" +
"}\n" +
"\n" +
"hr {\n" +
"    margin: auto;\n" +
"    width: 40%;\n" +
"}\n" +
"</style>\n" +
"<body>\n" +
"\n" +
"<div class=\"bgimg\">\n" +
" \n" +
"  <div class=\"middle\">\n" +
"    <h1>LOGIN SUCCESSFUL</h1>\n" +
"    <hr>\n" +
"    <a href=\"home.jsp\"  >home</a>\n" +
"  </div>\n" +
"  <div class=\"bottomleft\">\n" +
"  \n" +
"  </div>\n" +
"</div>\n" +
"\n" +
"</body>\n" +
"</html>");
                //  out.println("<form action='home.jsp'>");
                  //out.println("<h1>Login Successful</h1>");
                  
                 //out.println("<input type='submit' value='go'>");
                  
                  //out.println("</form>");
              }
              else
              {
                  out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<style>\n" +
"body, html {\n" +
"    height: 100%;\n" +
"    margin: 0;\n" +
"}\n" +
"\n" +
".bgimg {\n" +
"    background-image: url('/w3images/forestbridge.jpg');\n" +
"    height: 100%;\n" +
"    background-position: center;\n" +
"    background-size: cover;\n" +
"    position: relative;\n" +
"    color: #01A4EF;\n" +
"    font-family: \"Courier New\", Courier, monospace;\n" +
"    font-size: 25px;\n" +
"}\n" +
"\n" +
".topleft {\n" +
"    position: absolute;\n" +
"    top: 0;\n" +
"    left: 16px;\n" +
"}\n" +
"\n" +
".bottomleft {\n" +
"    position: absolute;\n" +
"    bottom: 0;\n" +
"    left: 16px;\n" +
"}\n" +
"\n" +
".middle {\n" +
"    position: absolute;\n" +
"    top: 50%;\n" +
"    left: 50%;\n" +
"    transform: translate(-50%, -50%);\n" +
"    text-align: center;\n" +
"}\n" +
"\n" +
"hr {\n" +
"    margin: auto;\n" +
"    width: 40%;\n" +
"}\n" +
"</style>\n" +
"<body>\n" +
"\n" +
"<div class=\"bgimg\">\n" +
" \n" +
"  <div class=\"middle\">\n" +
"    <h1>WRONG CREDENTIALS</h1>\n" +
"    <hr>\n" +
"    <a href=\"login.html\"  >Back to Login</a>\n" +
"  </div>\n" +
"  <div class=\"bottomleft\">\n" +
"  \n" +
"  </div>\n" +
"</div>\n" +
"\n" +
"</body>\n" +
"</html>");
              }
              
          }
          else
          {
              out.println("Empty username or password");
          }
        }
    
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
