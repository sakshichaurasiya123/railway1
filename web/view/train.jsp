<%-- 
    Document   : train
    Created on : 15 Oct, 2019, 12:15:09 AM
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
  
  
  
  <!-- Slider Links-->
  <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="Slider/themes/default/default.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../Slider/themes/light/light.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../Slider/themes/dark/dark.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../Slider/themes/bar/bar.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../Slider\nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../Slider\demo\style.css" type="text/css" media="screen" />

  
<style>


.form{
                            body{background-image:url(image/4.jpg); background-size:cover;}
                                margin-left:320px;
				width:540px;
				align:center;
                                 background-color: whitesmoke;
                                margin-top:100px;
				margin-left:300px;
				padding: 28px;
				border-redious:5px;
				height:450px;
                                border-radius: 25px;
                        border: 2px solid #609;
                        padding: 20px; 
			}
			center input[type="text"]{
			width:300px;
			height:10px;
			//border-radius:5px;
			//padding-left:10px;
			background:pink;
                        border-radius: 15px;
                        border: 2px solid #609;
                        padding: 20px; 
                        
			}
		
			center input[type="password"]{
			width:300px;
			height:10px;
			border-radius:15px;
			background:pink;
                        border: 2px solid #609;
                        padding: 20px; 
                       
                        
			}
			h4 center input[type="submit"]{
			
			//border-redious:10px;
			background-color:green;
			color:white;
			text-transform:capatalize;
			//font-size:30px;
                        border-radius: 15px;
                        border: 2px solid #609;
                        padding: 10px; 
                        width: 300px;
                        height: 50px;  
                        margin-left: 17px;
			}
			div center h2{color:white;
                                  font-size: 30px;
                                  font-style: bold;
                                  font-family: Courier;
                                  background-color: green;
                                background-size: 60px;
                        }
                        h2 span{color:greenyellow;}
                          #header{
        height:10%;
        background:green;
        width:100%
     }
           
     <%
         HttpSession session1=request.getSession(false);
         String name=(String)session1.getAttribute("name");
     
         
     %>
		
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
      <h2><span>Railway Portal</span></h2>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="reservation.html">Reservation</a></li>
          <li><a href="cancel.html">Cancel Ticket</a></li>
             <li><a href="searchTrain.html">Search Train</a></li>
          <li><a href="../logoutServlet">Logout</a></li>
        </ul>
      </div>
        </div>
    </div>
  </nav>

 <!--Slider coding-->
 <div id="wrapper">
<div class="slider-wrapper theme-default">
<div id="slider" class="nivoSlider"> 

<img src="../image/z.jpg" data-thumb="../Slider/themes/default/arrows.png" alt="" />
<img src="../image/a.jpg" data-thumb="../Slider/themes/default/arrows.png" alt="" />


<a href="http://dev7studios.com">
<img src="../image/c.jpg" data-thumb="../Slider/demo/images/up.jpg" alt=""  />
</a>
 
<img src="../image/5.jpg" data-thumb="../Slider/demo/images/walle.jpg" alt="" data-transition="slideInLeft" />
 
<img src="../image/3.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/1.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/f.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/g.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/h.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/i.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/j.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/k.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/l.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/m.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/n.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />

<img src="../image/o.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />
<img src="../image/p.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />

<img src="../image/q.jpg" data-thumb="../Slider/demo/images/nemo.jpg" alt="" title="#htmlcaption" />


</div>
</div>
</div>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> 
<script type="text/javascript" src="../Slider/jquery.nivo.slider.js"></script> 
<script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script> 
    </body>
</html>
