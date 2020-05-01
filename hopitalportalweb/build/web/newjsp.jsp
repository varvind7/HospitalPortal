<%-- 
    Document   : newjsp
    Created on : Sep 11, 2018, 2:34:04 PM
    Author     : varvi
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Doctor Registration</title>
	<link href="registrationDoctor.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        
        <header>
    <div id="blueHeader">
      <span id="title">HospitalPortal</span>
      <span id="headerNav"><a href="index.html" style="color:#FFFFFF" >Home</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Login&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Appointment&nbsp;&nbsp; |&nbsp;&nbsp; Search</span>
      <img src="stethoscope-simple-black-icon-512.png" alt="logo" id="blueLogo">
    </div>
                
</header>
       
        <div id="divpadding">
<form name="f1" acrion="newjsp.jsp" style="margin-left:30px">
	First Name &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Middle Name &emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Last Name
	<br>
	<input type="text" name="firstname" required>
	&nbsp;&nbsp;
	<input type="text" name="middlename">
	&nbsp;&nbsp;
	<input type="text" name="lastname" required>
	<br><br>
	<label>Profile Picture:
	<input type="file" name="profilepic" accept="image/*">
	</label>
	<br><br>
	<label>
		Doctor ID:
		<input type="text" name="doctorid" required>

	</label>
	<br><br>
	<label>
		Email:
		<input type="Email" name="email" required>
	</label>
	<br><br>
	<label>
		Mobile:
		<input type="number" name="Mobile" required>
	</label>
	<label>
	Date of Birth:
	&nbsp;<input type="date" data-date-inline-picker="true" name="dob" required />
	<br><br>
	</label>
	<label>
	password: &nbsp;
	<input type="password" name="password" required />
	</label>
	<br><br>
	<label>
	Retype password: &nbsp;
	<input type="password" name="passwordcheck" required />
	</label>
	<br><br>
	<label>
		Specialized in:
		<input type="text" name="" required>
	</label>
	<br><br>
	<label>
		Visiting Time:
		<input type="checkbox" name="Visiting" value="Mon">Mon
		<input type="checkbox" name="Visiting" value="Tue">Tue
		<input type="checkbox" name="Visiting" value="Wed">Wed
		<input type="checkbox" name="Visiting" value="Thu">Thu
		<input type="checkbox" name="Visiting" value="Fri">Fri
		<input type="checkbox" name="Visiting" value="Sat">Sat
		<input type="checkbox" name="Visiting" value="Sun">Sun
	
	</label>
	<br><br>
	<label>
		Time Slot:
		<input type="checkbox" name="timing" value="6-8am">6-8am
		<input type="checkbox" name="timing" value="8-10am">8-10am
		<input type="checkbox" name="timing" value="10-12am">10-12am
		<input type="checkbox" name="timing" value="4-6pm">4-6pm
		<input type="checkbox" name="timing" value="6-8pm">6-8pm
		<input type="checkbox" name="timing" value="8-10pm">8-10pm

	</label>
	<br><br>
	<label>
		Fees Charged:
		<input type="number" name="fees">
	</label>
	<br><br>
	<input type="submit" name="">
        
        <%
            out.println("hello");
           String name="arv";%>
<% String address="12";
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


            %>
</form>
</div>
<footer>
	<span class="auto-style1">Email&nbsp; </span><span id="preFooter">|&nbsp;&nbsp; Facebook&nbsp;&nbsp; |&nbsp;&nbsp; Twitter&nbsp;&nbsp; |&nbsp; 
	Google+ </span><br>
	&copy; Copyright Arvind Narayan - RA1511020010043 - SRM University
</footer>
        
    </body>
</html>
