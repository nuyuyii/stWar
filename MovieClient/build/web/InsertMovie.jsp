<%-- 
    Document   : InsertMovie
    Created on : Sep 30, 2016, 9:17:08 AM
    Author     : nuyuyii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete Movie</h1>
        <form>
            Title:<input type="text" name="addTitle"/><br/>
            Year:<input type="text" name="addYear"/><br/>
            Types:<input type="text" name="addTypes"/><br/>
            Time:<input type="text" name="addTime"/><br/>
            Director:<input type="text" name="AddDirec"/><br/>
            <input type="submit" value="addMovie"/>
        </form>
        
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	serverpack.MvWebService_Service service = new serverpack.MvWebService_Service();
	serverpack.MvWebService port = service.getMvWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String title = request.getParameter("addTitle");
	java.lang.String year = request.getParameter("addYear");
	java.lang.String types = request.getParameter("addTypes");
	int time = Integer.parseInt(request.getParameter("addTime"));
	java.lang.String director = request.getParameter("AddDirec");
	// TODO process result here
        //java.lang.String result = port.deleteMovie(time);	
        java.lang.String result = port.addMovie(title, year, types, time, director);
        out.println("Result :");
        for (String s: result.split("-")){
            out.println("      "+s);
        }
	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
      

    </body>
</html>
