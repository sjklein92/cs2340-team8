<%@ page import="edu.gatech.cs2340.risk.model.*" %>
<%@ page import="edu.gatech.cs2340.risk.controller.*" %>
<%@ page import="java.util.*" %>

<% Player player = request.getAttribute("player");   
   int fleets = request.getAttribute("fleets");
   GameLogic game = (GameLogic) request.getAttribute("game"); %>

<html>
    <head>
        <title>Planet's Stats</title>
        <link rel="stylesheet" type="text/css" href="stylesheet.css"/>
		<script src="jquery.js"></script>
		<script type="text/javascript" src="script.js"></script>

    </head>

    <body> 
      <h1> Planet's Owner is <%player.getName()%> </h1>
    </body>
</html>

