<%-- 
    Document   : index.jsp
    Created on : 15 Oct, 2019, 12:02:57 AM
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
 <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="css/imagehover.min.css">
  <link rel="stylesheet" type="text/css" href="css/style.css">
  
  
<style>

    
   body{background-image:url(image/2.jpg); background-size:cover;}
      #header{
        height:10%;
        background:green;
        width:100%
     }
       .form{
                            background-color: whitesmoke ;
                            
                                margin-left:320px;
				width:510px;
				
				align:center;
		
                                margin-top:150px;
				margin-left:820px;
				padding: 28px;
				border-redious:5px;
				height:480px;
                                border-radius: 25px;
                                border: 2px solid #609;
                                padding: 20px; 
			}
			
		
			center input[type="text"]{
			width:300px;
			height:40px;
			border-radius:15px;
			
                        border: 2px solid #609;
                       // padding: 20px; 
                       
                        
			}
                        center input[type="date"]{
			width:230px;
			height:40px;
			border-radius:15px;
			
                        border: 2px solid #609;
                       // padding: 20px; 
                       
                        
			}
			h4 center input[type="submit"]{
			
			//border-redious:10px;
			background-color:green;
			color:white;
			text-transform:capatalize;
			//font-size:30px;
                        border-radius: 15px;
                        border: 2px solid #609;
                        //padding: 10px; 
                        width: 300px;
                        height: 50px;  
                        margin-left: 87px;
			}
			div center h2{color:white;
                                  font-size: 30px;
                                  font-style: bold;
                                  font-family: Courier;
                                  background-color: green;
                                background-size: 60px;
                        }
                                          
		
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
          <img src="image/logo.jpg" height="100px" width="110px">   
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
          
        <ul class="nav navbar-nav navbar-right">
          <li><a href="view/registration.html">Registration</a></li>
          <li><a href="view/login.html">UserLogin</a></li>
           <li><a href="view/Alogin.html">AdminLogin</a></li>
          
        </ul>
      </div>
          </div>
    </div>
    
    </nav>
 <form action="withoutloginsearch"  method="post" class=form>
	<div><center><h2> SEARCH TRAIN </h2></center></div>
        <hr>
         <h4><center>Source :<sup class="text-danger">*</sup> &nbsp; &nbsp;<input type="text" name="source" placeholder="Enter souce Location..." required></center></h4>
         
         &nbsp;<h4><center>Destination:<sup class="text-danger">*</sup> <input type="text" name="destination" placeholder="Enter  Destination Location..." required></center></h4>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <h4><center>Date Of Journey :<sup class="text-danger">*</sup>&nbsp;&nbsp;&nbsp;<input type="date" placeholder="Enter Journey Date...." name="date" required> </center></h4>    
       <center><input type="checkbox" name="checkbox" value="Please Remember Me !!!" required>
        <span>Please Remember Me</span>
        </center><br>
       
        <h4> <center><input type="submit" value="SEARCH"></center></h4>
        
</form>


   
            
</body>
</html>

