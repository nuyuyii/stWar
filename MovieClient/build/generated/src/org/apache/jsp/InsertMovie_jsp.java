package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertMovie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Delete Movie</h1>\n");
      out.write("        <form>\n");
      out.write("            Title:<input type=\"text\" name=\"addTitle\"/><br/>\n");
      out.write("            Year:<input type=\"text\" name=\"addYear\"/><br/>\n");
      out.write("            Types:<input type=\"text\" name=\"addTypes\"/><br/>\n");
      out.write("            Time:<input type=\"text\" name=\"addTime\"/><br/>\n");
      out.write("            Director:<input type=\"text\" name=\"AddDirec\"/><br/>\n");
      out.write("            <input type=\"submit\" value=\"addMovie\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
