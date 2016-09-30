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
    </head>
    <body>
        <h1>Client Test</h1>
        <form>
            Enter a number <br>
            <input type="text" name="number"><br>
            <input type="submit" value="Invoke">
        </form>
        
        
          <%-- start web service invocation --%><hr/>
    <%
    try {
	serverpack.MvWebService_Service service = new serverpack.MvWebService_Service();
	serverpack.MvWebService port = service.getMvWebServicePort();
	 // TODO initialize WS operation arguments here
	int no = Integer.parseInt(request.getParameter("number"));
	// TODO process result here
	int result = port.getsqr(no);
	out.println("Srure is : = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
  
      
    </body>
</html>
