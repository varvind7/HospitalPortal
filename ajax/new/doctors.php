<!DOCTYPE html>
<html>
<head>
    <title>Doctors</title>
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
    <h2>Displaying all the doctors</h2>
    <?php
/* Attempt MySQL server connection. Assuming you are running MySQL
server with default setting (user 'root' with no password) */
$link = mysqli_connect("localhost", "root", "root", "web");
 
// Check connection
if($link === false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
}
 
// Attempt select query execution
$sql = "SELECT * FROM login";
if($result = mysqli_query($link, $sql)){
    if(mysqli_num_rows($result) > 0){   
        echo "<table>";
            echo "<tr>";
                echo "<th>id</th>";
                echo "<th>first_name</th>";
                echo "<th>last_name</th>";
                echo "</tr>";
        while($row = mysqli_fetch_array($result)){
            echo "<tr>";
                echo "<td>" . $row['uname'] . "</td>";
                echo "<td>" . $row['pass'] . "</td>";
                echo "<td>" . $row['type'] . "</td>";
                
            echo "</tr>";
        }
        echo "</table>";
        // Free result set
        mysqli_free_result($result);
    } else{
        echo "No records matching your query were found.";
    }
} else{
    echo "ERROR: Could not able to execute $sql. " . mysqli_error($link);
}
 
// Close connection
mysqli_close($link);
?>
</div>
<footer>
    <span class="auto-style1">Email&nbsp; </span><span id="preFooter">|&nbsp;&nbsp; Facebook&nbsp;&nbsp; |&nbsp;&nbsp; Twitter&nbsp;&nbsp; |&nbsp; 
    Google+ </span><br>
    &copy; Copyright Arvind Narayan - RA1511020010043 - SRM University
</footer>

</body>
</html>