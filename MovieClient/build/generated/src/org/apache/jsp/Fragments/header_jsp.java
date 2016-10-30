package org.apache.jsp.Fragments;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../static/metamorph_lekato/styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container_12\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("<article class=\"grid_6\">\n");
      out.write("<div class=\"page1-box1\">\n");
      out.write("<span>About us</span>\n");
      out.write("<p>we are Group3 Seriously<br />\n");
      out.write("1. จิรภาส วิชัยดิษฐ์             5601012620013<br />\n");
      out.write("2. นพรัตน์ ไพโรจน์พัฒนกุล     5601012620072<br />\n");
      out.write("3. ธนาสันต์ เสพสุข             5601012630141<br />\n");
      out.write("4. ธนวัฒน์ อิ่นแก้ว             5601012620153<br />\n");
      out.write("5. นสิทธิ์ จูรอด                 5601012630175<br />\n");
      out.write("6. ศิริลักษณ์  แง่พรม          5601012630248<br />\n");
      out.write("</p>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("</article>\n");
      out.write("<article class=\"grid_3\">\n");
      out.write("<div class=\"page1-box2\">\n");
      out.write("<span>Search Movie</span>\n");
      out.write("<p><a href=\"Search.jsp\">ค้นหาภาพยนตร์จากชื่อเรื่อง, ปีที่สร้าง, ประเภทของภาพยนนตร์ และ ผู้กำกับ </a></p>\n");
      out.write("</div>\n");
      out.write("<div class=\"page1-box2 last2\">\n");
      out.write("<span>Add Movie</span>\n");
      out.write("<p><a href=\"Add.jsp\">เพิ่มภาพยนตร์ลงไปในรายการ</a> </p>\n");
      out.write("</div>\n");
      out.write("</article>\n");
      out.write("<article class=\"grid_3\">\n");
      out.write("<div class=\"page1-box2\">\n");
      out.write("<span>Delete Movie</span>\n");
      out.write("<p><a href=\"Delete.jsp\">ลบภาพยนตร์ออกจากรายการภาพยนตร์</a> </p>\n");
      out.write("</div>\n");
      out.write("<div class=\"page1-box2 last2\">\n");
      out.write("<span>Edit Movie</span>\n");
      out.write("<p><a href=\"Edit.jsp\">แก้ไขรายละเอียดของภาพยนตร์โดยใช้ ID ของภาพยนตร์ค้นหาเพื่อมาแก้ไข</a></p>\n");
      out.write("</div>\n");
      out.write("</article>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("</body>\n");
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
