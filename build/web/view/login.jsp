<%-- 
    Document   : login
    Created on : 15 Oct, 2019, 12:06:17 AM
    Author     : Mohini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
<title>Railway Portal</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
 <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Open+Sans|Candal|Alegreya+Sans">
 <link rel="stylesheet" type="text/css" href="../css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="../css/imagehover.min.css">
  <link rel="stylesheet" type="text/css" href="../css/style.css">
  
  <%
     HttpSession session1=request.getSession();
     String name=(String)session1.getAttribute("name");
     String password=(String)session1.getAttribute("password");
     if(session1!=null && name!=null )
     {
         response.sendRedirect("train.jsp");
     }
     else{
         response.sendRedirect("../index.jsp");
     }
    %>


<style>


.form{
                           
                                margin-left:320px;
				width:540px;
				
				align:center;
                                 background-color: whitesmoke;
                                margin-top:120px;
				margin-left:300px;
				padding: 28px;
				border-redious:5px;
				height:510px;
                                border-radius: 10px;
                        border: 2px solid #609;
                        padding: 20px; 
			}
			center input[type="text"]{
			width:300px;
			height:40px;
			//border-radius:5px;
			//padding-left:10px;
			
                        border-radius: 15px;
                        //border: 2px solid #609;
                        //padding: 20px; 
                        
			}
		
			center input[type="password"]{
			width:300px;
			height:40px;
			border-radius:15px;
			
                        //border: 2px solid #609;
                        ///padding: 20px; 
                       
                        
			}
			h4  input[type="submit"]{
			
			//border-redious:10px;
			background-color:green;
			color:white;
			text-transform:capatalize;
			//font-size:30px;
                        border-radius: 15px;
                        //border: 2px solid #609;
                        //padding: 10px; 
                        width: 150px;
                        height: 50px;  
                        //margin-left: 0px;
			}
                        h4  a h5 {
			
			//border-redious:10px;
			background-color:green;
			color:white;
			text-transform:capatalize;
			//font-size:30px;
                        border-radius: 15px;
                        //border: 2px solid #609;
                        //padding: 10px; 
                        width: 150px;
                        height: 50px;  
                       // margin-left: 300px;
			}
			
			div center h2{color:white;
                                  font-size: 30px;
                                  font-style: bold;
                                  font-family: Courier;
                                  background-color: green;
                                background-size: 60px;
                        }
                     h2 span{color:white;
                     }
                     a{color:black;}
                     .text-danger{color:red;}
                     
                     #header{
        background:green;
        width:100%;
     }
     hr{color:black;}
     
		
</style>
</head>

<body>

<!-- Links (sit on top) -->
<nav class="navbar navbar-default navbar-fixed-top">
     <div id="header">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>       
        </button>
           <img src="../image/logo.jpg" height="100px" width="110px" margin-right="500px">   
        
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right">
            <h2><span>Railway Portal Login</span></h2>
       
          
        </ul>
      </div>
    </div>
   </div>
  </nav>
<form action="../saveServlet1"  method="post" class=form>
	<div><center><h2> LOGIN HERE</h2></center></div>
        <hr>
		
	<center>User Name : <sup class="text-danger">*</sup>&nbsp;&nbsp;<input type="text" name="name" placeholder=" Please Enter Your Name........"id="a1" width="400" required><br><br></center>
        <center>&nbsp;&nbsp;Password : <sup class="text-danger">*</sup> &nbsp; &nbsp;&nbsp;<input type="password" name="password" placeholder="Please Enter Your Password........" id="b1" width="150" required><br><br></center>
		
			
	<h4><center>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <center><input type="checkbox" name="checkbox" value="Please Remember Me !!!" required>
        <span>Please Remember Me</span>
        </center><br>
       
        <input type="submit" value="SIGN IN"><a href="registration.html"><h5>SIGNUP</h5></a></h5></h4>
        
        <hr>
        <center><a href="forgotPassword.html">Forgotten Password !!</a></center>
        
</form>


</body>
</html>

