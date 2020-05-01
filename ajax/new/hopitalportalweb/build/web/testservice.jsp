<%-- 
    Document   : testservice
    Created on : Oct 7, 2018, 10:27:00 PM
    Author     : varvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bookAppointment.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
    <div id="blueHeader">
      <span id="title" >HospitalPortal </span>
      <span id="headerNav"><a href="index.html" style="color:#FFFFFF" >Home</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; <a class="topNav" href="login.html" style="color:#FFFFFF">Login</a>&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp; Appointment&nbsp;&nbsp; |&nbsp;&nbsp; Search</span>
      <img src="stethoscope-simple-black-icon-512.png" alt="logo" id="blueLogo">
    </div>
                
</header>
<div id="divpadding">
    <h2 style="margin-left: 30%;">Diet Chart for various Diseases</h2>
            <br>
            <p>Select your illness</p>
            <br>
        <form name="f1" method="get" action="client">
            <input type="radio" name="illness" value="fever">Fever
            <br>
            <input type="radio" name="illness" value="cough">Cough
            <br><br>
            <input type="submit" name="submit" value="Get Diet">
        </form>
    </div>
<footer>
	<span class="auto-style1">Email&nbsp; </span><span id="preFooter">|&nbsp;&nbsp; Facebook&nbsp;&nbsp; |&nbsp;&nbsp; Twitter&nbsp;&nbsp; |&nbsp; 
	Google+ </span><br>
	&copy; Copyright Arvind Narayan - RA1511020010043 - SRM University
</footer>
    </body>
</html>
