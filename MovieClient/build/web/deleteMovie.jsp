<%-- 
    Document   : action
    Created on : Sep 30, 2016, 8:18:23 AM
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
            Enter a NodeID <br>
            <input type="text" name="number"/><br/>
            <input type="submit" value="Delete"/>
        </form>
        
      <%-- start web service invocation --%><hr/>
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
    <%-- end web service invocation --%><hr/>

    </body>
</html>
