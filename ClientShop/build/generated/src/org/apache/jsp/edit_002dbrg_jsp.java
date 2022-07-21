package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_002dbrg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                <!--Stlye Css-->\n");
      out.write("                <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("                <link href=\"css/style.css\" rel=\"stylesheet\"/>  \n");
      out.write("                <link href=\"css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("                <link href=\"css/tbh-brg.css\" rel=\"stylesheet\"/>\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("                    <title>Pet Shop</title>\n");
      out.write("                    </head>\n");
      out.write("                    <!--Bar Navigasi-->\n");
      out.write("                    <nav id=\"home\" class=\"navbar\">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <!--Logo-->\n");
      out.write("                                <button type=\"button\" id=\"toogle-button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-menu-hamburger\"></span>                     \n");
      out.write("                                </button>                \n");
      out.write("                                <a id=\"logo\"  class=\"navbar-brand\" href=\"daftar-brg.jsp\"><img src=\"image/logo.jpg\" style=\" max-width: 80px;\"></a>\n");
      out.write("                                <label style=\"padding-top: 30px;\" id=\"logo\"><a href=\"daftar-brg.jsp\"></a>Pet Shop</label>        \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Button-button -->\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                                <ul id=\"link\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                    <li id=\"first-link\"><a  href=\"daftar-brg.jsp\"> Daftar Barang</a></li>\n");
      out.write("                                    <li><a href=\"report.jsp\">Report</a></li>\n");
      out.write("                                    <li><a href=\"profil.jsp\">Profil</a></li>                    \n");
      out.write("                                    <li id=\"button-link\"><a href=\"logout.jsp\">Log out</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("<!--Content-->\n");
      out.write("<body style=\"background-image: url(image/bg2.png);\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <section class=\"tambah\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"tambah-content\">\n");
      out.write("                    <form method=\"POST\" id=\"signup-form\" class=\"signup-form\" action=\"proses-edit-brg.jsp\">\n");
      out.write("                        <!--Form Edit-->\n");
      out.write("                        <h2 class=\"form-title\">Edit Mahasiswa</h2>\n");
      out.write("\n");
      out.write("                        ");

                            try {
                                server.mahasiswa.Mahasiswa service = new server.mahasiswa.Mahasiswa();
                                server.mahasiswa.Mhsiswa port = service.getMhsiswaPort();
                                int id = Integer.valueOf(request.getParameter("id"));
                                // TODO process result here
                                java.util.List<java.lang.Object> result = port.getData(id);
                                for (int i = 0; i < result.size(); i++) {
                                    out.println(result.get(i));
                                }
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>                   \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"coba.js\"></script>\n");
      out.write("\n");
      out.write("<!--Footer-->\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <p class=\"bio-text\">Ujian Akhir Semester Mata Kuliah Pemrograman Web 2</p>\n");
      out.write("    <p class=\"bio-text\">Dibuat oleh </p>\n");
      out.write("    <p class=\"bio-text\">Fahrur Rozi (18.3.00009)</p>\n");
      out.write("</div>");
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
