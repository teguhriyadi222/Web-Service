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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Style Css -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>        \n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>\n");
      out.write("        <title>Login to Pet Shop</title>\n");
      out.write("    </head>\n");
      out.write("<!-- Tampilan Login -->\n");
      out.write("    <body>\n");
      out.write("        <div id=\"login\">\n");
      out.write("            <h1><strong>Selamat Datang. </strong> Silahkan Log In</h1>\n");
      out.write("            <form action=\"proses-login.jsp\" method=\"post\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <p><input name=\"username\" type=\"text\" required value=\"Username\" \n");
      out.write("                              onBlur=\"if (this.value == '')this.value = 'Username'\" \n");
      out.write("                              onFocus=\"if (this.value == 'Username')this.value = ''\"></p>\n");
      out.write("                    <p><input name=\"password\" type=\"password\" required value=\"Password\" \n");
      out.write("                              onBlur=\"if (this.value == '')this.value = 'Password'\" \n");
      out.write("                              onFocus=\"if (this.value == 'Password')this.value = ''\"></p>\n");
      out.write("                    <p><input type=\"submit\" value=\"Login\"></p>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>      \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
