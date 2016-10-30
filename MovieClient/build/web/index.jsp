<%-- 
    Document   : index
    Created on : Sep 19, 2016, 7:44:46 AM
    Author     : nuyuyii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../static/metamorph_lekato/styles.css">
    </head>
    <body>
        <header class="p30">
        <div class="main">
        <h1><a class="logo" href="Home.jsp">Movie</a></h1>
        <nav>
            <ul class="my_menu">
            <li><a class="active" href="Home.jsp">Home</a></li>
            <li><a href="Add.jsp">Add Movie</a></li>
            <li><a href="Search.jsp">Search</a></li>
            <li><a href="Edit.jsp">Edit</a></li>
            <li><a href="About.jsp">About us</a></li>
            </ul>
        </nav>
        </div>
        <!-- Header fragment -->
        <div class="fregment">
            <jsp:include page="/Fragments/header.jsp"></jsp:include>
        </div>
        </header>
       <section id="content">
<div class="container_12">
<div class="wrapper">
<article class="grid_12">   
    <h3 class="p12">Delete Movie</h3>
    <p>Enter NodeID</p>
    <form>
        <input type="text" name="number"/><br />
        <br />
        <input class="button2 fright" type="submit" value="Delete"/>
    </form>
    <a class="button1" href="#">read more</a>
</article>
    <%-- start web service invocation --%>
    <%
    try {
	serverpack.MvWebService_Service service = new serverpack.MvWebService_Service();
	serverpack.MvWebService port = service.getMvWebServicePort();
	 // TODO initialize WS operation arguments here
	int nodeID = Integer.parseInt(request.getParameter("number"));
	// TODO process result here
	java.lang.String result = port.deleteMovie(nodeID);
	out.println("Result: "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%>
</div>
</div>
</section>
        
        

  
    </body>
</html>
