package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../static/metamorph_lekato/styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"p30\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <h1><a class=\"logo\" href=\"Home.jsp\">Movie</a></h1>\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"my_menu\">\n");
      out.write("            <li><a class=\"active\" href=\"Home.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"Add.jsp\">Add Movie</a></li>\n");
      out.write("            <li><a href=\"Search.jsp\">Search</a></li>\n");
      out.write("            <li><a href=\"Edit.jsp\">Edit</a></li>\n");
      out.write("            <li><a href=\"About.jsp\">About us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        <!-- Header fragment -->\n");
      out.write("        <div class=\"fregment\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Fragments/header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </header>\n");
      out.write("       <section id=\"content\">\n");
      out.write("<div class=\"container_12\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("<article class=\"grid_12\">   \n");
      out.write("    <h3 class=\"p12\">Delete Movie</h3>\n");
      out.write("    <p>Enter NodeID</p>\n");
      out.write("    <form>\n");
      out.write("        <input type=\"text\" name=\"number\"/><br />\n");
      out.write("        <br />\n");
      out.write("        <input class=\"button2 fright\" type=\"submit\" value=\"Delete\"/>\n");
      out.write("    </form>\n");
      out.write("    <a class=\"button1\" href=\"#\">read more</a>\n");
      out.write("</article>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("  \n");
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
