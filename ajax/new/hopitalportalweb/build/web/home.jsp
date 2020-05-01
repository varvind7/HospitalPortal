<%-- 
    Document   : home
    Created on : Oct 10, 2018, 5:29:18 PM
    Author     : varvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Untitled 1</title>
<link href="index.css" rel="stylesheet" type="text/css">
<style type="text/css">
.auto-style1 {
	font-style: normal;
	font-size: 15px;
}
</style>
</head>

<body>
<header>
    <div id="blueHeader">
      <span id="title">  HospitalPortal</span>
      <span id="headerNav"><a class="topNav" href="index.html" >Home</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; <a class="topNav" href="login.html" >Login</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Appointment&nbsp;&nbsp; |&nbsp;&nbsp; Search</span>
      <img src="stethoscope-simple-black-icon-512.png" alt="logo" id="blueLogo">
    </div>
    <img src="slider2.jpg" alt="doctors" id="doctors">             
</header>
<main>

<table style="width: 100%">
	<tr>
		<td id="sideMenu">
		  <br><a href="login.html" class="nav">     Login  </a>	<br><br>
	
	
<a href="registration.html"class="nav" >      Patient Registration  </a><br><br>
<a href="registrationDoctor.html" class="nav" >    Doctor Registration  </a><br><br>

<a href="MedicalHistory.html" class="nav">   Medical History  </a>	<br><br>
<a href="DoctorSearch.html" class="nav" >     Doctor Search  </a>	<br><br>
<a href="bookAppointment.html" class="nav">    Book Appointment  </a>	<br><br>

		</td>
		<td id="content" >
                    <%
                        
                         Cookie cookie[]=request.getCookies();
        int i=1;
        for(Cookie c:cookie)
        {
            if(i==1)
            {
            out.print("Welcome " + "<i><b>"+ c.getValue()+","+"</b></i>");
            i=0;
            }
        }
        i=1;
                        
                        %>
		  <p>The My HealthPoint patient portal, is a convenient, secure health management tool you can use anywhere you have access to the Internet. It provides access to important information about you and your visit(s) to our hospital.</p>

<p>Information available on My HealthPoint includes:</p>
<ul>
	<li>
		Admit and discharge dates and locations
	</li>
	<li>
		Current and past problem list
	</li>
	<li>
		Appointment booking and cancelation
	</li>
	<li>
		Laboratory test results (available at time of discharge)
	</li>
	<li>
		Family & social history
	</li>
</ul>

<div>Not <%
    
     i=1;
        for(Cookie c:cookie)
        {
            if(i==1)
            {
            out.print("<i><b>"+c.getValue()+"</b></i>");
            i=0;
            }
        }
        i=1;
        %> ?    <a href="login.html" class="nav" >logout</a>
</div>
    
    
		</td>
	</tr>
</table>

</main>
<footer>
	<span class="auto-style1">Email&nbsp; </span><span id="preFooter">|&nbsp;&nbsp; Facebook&nbsp;&nbsp; |&nbsp;&nbsp; Twitter&nbsp;&nbsp; |&nbsp; 
	Google+ </span><br>
	&copy; Copyright Arvind Narayan - RA1511020010043 - SRM University
</footer>
</body>
</html>
