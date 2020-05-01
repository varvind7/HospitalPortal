<%-- 
    Document   : t1
    Created on : Sep 19, 2018, 2:18:30 PM
    Author     : varvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%String user=request.getParameter("username");%>
         <% String pass=request.getParameter("password"); %>
         <%if(user!=null && pass!=null)
          {
              if(user.equals("arvind") && pass.equals("1234"))
              {
                  loginservelet.name="arvind";
                  Cookie cookie=new Cookie("username",loginservelet.name);
                  response.addCookie(cookie);   
                  response.sendRedirect("bookAppointment.html");
              }
              else
              {
                  out.println("Wrong credentials");
              }
              
          }
          else
          {
              out.println("Empty username or password");
          }
        }%>
    </body>
</html>
