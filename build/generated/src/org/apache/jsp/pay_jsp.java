package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");

String nombre = (String)session.getAttribute("nombre");
String fecha = (String)session.getAttribute("fecha");
String valor = (String)session.getAttribute("valor");
String estado = (String)session.getAttribute("estado");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Universoft &mdash; Contactanos</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\n");
      out.write("        <meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\n");
      out.write("        <meta name=\"author\" content=\"FREEHTML5.CO\" />\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("              //////////////////////////////////////////////////////\n");
      out.write("      \n");
      out.write("              FREE HTML5 TEMPLATE\n");
      out.write("              DESIGNED & DEVELOPED by FREEHTML5.CO\n");
      out.write("      \n");
      out.write("              Website: \t\thttp://freehtml5.co/\n");
      out.write("              Email: \t\t\tinfo@freehtml5.co\n");
      out.write("              Twitter: \t\thttp://twitter.com/fh5co\n");
      out.write("              Facebook: \t\thttps://www.facebook.com/fh5co\n");
      out.write("      \n");
      out.write("              //////////////////////////////////////////////////////\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <!-- Facebook and Twitter integration -->\n");
      out.write("        <meta property=\"og:title\" content=\"\"/>\n");
      out.write("        <meta property=\"og:image\" content=\"\"/>\n");
      out.write("        <meta property=\"og:url\" content=\"\"/>\n");
      out.write("        <meta property=\"og:site_name\" content=\"\"/>\n");
      out.write("        <meta property=\"og:description\" content=\"\"/>\n");
      out.write("        <meta name=\"twitter:title\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:image\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:url\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"\" />\n");
      out.write("\n");
      out.write("        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <!-- Superfish -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/superfish.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- FOR IE9 below -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function consultar() {\n");
      out.write("                document.getElementById('oculto').style.display = 'block';\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"fh5co-wrapper\">\n");
      out.write("            <div id=\"fh5co-page\">\n");
      out.write("                <div id=\"fh5co-header\">\n");
      out.write("                    <header id=\"fh5co-header-section\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"nav-header\">\n");
      out.write("                                <a href=\"#\" class=\"js-fh5co-nav-toggle fh5co-nav-toggle\"><i></i></a>\n");
      out.write("                                <h1 id=\"fh5co-logo\"><a href=\"index.html\">Universoft</a></h1>\n");
      out.write("                                <!-- START #fh5co-menu-wrap -->\n");
      out.write("                                <nav id=\"fh5co-menu-wrap\" role=\"navigation\">\n");
      out.write("                                    <ul class=\"sf-menu\" id=\"fh5co-primary-menu\">\n");
      out.write("                                        <li class=\"active\">\n");
      out.write("                                            <a href=\"index.html\">Home</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"about.html\">Sobre Nosotros</a></li>\n");
      out.write("                                        <li><a href=\"blog.html\">Noticias</a></li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"portfolio.html\" class=\"fh5co-sub-ddown\">Proyectos</a>\n");
      out.write("                                            <ul class=\"fh5co-sub-menu\">\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">P1</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">P2</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">P3</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">P4</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">P5</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">P6</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"services.html\" class=\"fh5co-sub-ddown\">Reportes</a>\n");
      out.write("                                            <ul class=\"fh5co-sub-menu\">\n");
      out.write("                                                <li><a href=\"left-sidebar.html\">Producción de Basura</a></li>\n");
      out.write("                                                <li><a href=\"right-sidebar.html\">Planes de Desarrollo</a></li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"#\" class=\"fh5co-sub-ddown\">PNUMA</a>\n");
      out.write("                                                    <ul class=\"fh5co-sub-menu\">\n");
      out.write("                                                        <li><a href=\"#\" target=\"_blank\">Programa</a></li>\n");
      out.write("                                                        <li><a href=\"#\" target=\"_blank\">Naciones</a></li>\n");
      out.write("                                                        <li><a href=\"#\" target=\"_blank\">Unidas</a></li>\n");
      out.write("                                                        <li><a href=\"#\" target=\"_blank\">Medio</a></li>\n");
      out.write("                                                        <li><a href=\"#\" target=\"_blank\">Ambiente</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"microsites.html\" class=\"fh5co-sub-ddown\">Micrositios</a>\n");
      out.write("                                            <ul class=\"fh5co-sub-menu\">\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">COLANTA</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">MINAMBIENTE</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">UDEA</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">Alcaldía de Medellín</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">EPM</a></li>\n");
      out.write("                                                <li><a href=\"#\" target=\"_blank\">TIGO/UNE</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"contact.html\">Contactanos</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"fh5co-hero fh5co-hero-2\">\n");
      out.write("                    <div class=\"fh5co-overlay\"></div>\n");
      out.write("                    <div class=\"fh5co-cover fh5co-cover_2 text-center\" data-stellar-background-ratio=\"0.5\" style=\"background-image: url(images/billpay.jpg);\">\n");
      out.write("                        <div class=\"desc animate-box\">\n");
      out.write("                            <h2><strong>Paga Tus </strong>Multas</h2>\n");
      out.write("                            <span>Utiliza nuestra herramienta para pagar tus multas en linea</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end:header-top -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"fh5co-contact\" class=\"animate-box\">\n");
      out.write("                    <center>\n");
      out.write("\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <form action=\"MultasServlet\" method=\"POST\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <h3 class=\"section-title\">Consulta Tus Multas</h3>\n");
      out.write("                                        <label for=\"name\">Tipo de documento</label>\n");
      out.write("                                        <select name=\"select\" size=\"1\" style=\" font-size:15px;height:30px\">\n");
      out.write("                                            <option selected value=\"0\"> Elige una opción </option>\n");
      out.write("                                            <option value=\"1\">Número de multa</option> \n");
      out.write("                                            <option value=\"2\">Identificación</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <h1> </h1> \n");
      out.write("                                        <label for=\"mail\">Nro de documento </label>\n");
      out.write("                                        <input type=\"number\" name=\"id\" id=\"mail\" />\n");
      out.write("                                        <h1> </h1> \n");
      out.write("                                        <input type=\"submit\" value=\"Consultar\" name=\"action\" onclick=\"consultar()\" class=\"btn btn-primary\">\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <!-- END OF first space -->\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"fh5co-contact\" class=\"animate-box\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <form action=\"MultasServlet\" method=\"POST\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div id ='oculto'  class=\"row\">\n");
      out.write("                                            <div  class=\"col-md-12\">\n");
      out.write("                                                <table border=\"2px\">\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td colspan=\"4\">Nombre Completo: <input type=\"text\" size=\"60\"  value=\"");
      out.print(nombre);
      out.write("\"/></td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>Fecha: <input type=\"text\"  value=\"");
      out.print(fecha);
      out.write("\"/></td>\n");
      out.write("                                                        <td>Valor: <input type=\"text\"  value=\"");
      out.print(valor);
      out.write("\"/></td>\n");
      out.write("                                                        <td>Estado: <input type=\"text\"  value=\"");
      out.print(estado);
      out.write("\"/></td>\n");
      out.write("                                                    </tr>\n");
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-12\">\n");
      out.write("                                                <H1></H1> \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"submit\"  onclick=\"alert('Esta factura solo es válida por 24 horas, pasado este tiempo deberá generar otra')\" value=\"Generar factura\" class=\"btn btn-primary\" >\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("                <!-- END fh5co-contact -->\n");
      out.write("                <!-- END map -->\n");
      out.write("                <footer>\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6 col-md-offset-3 text-center\">\n");
      out.write("                                    <p class=\"fh5co-social-icons\">\n");
      out.write("                                        <a href=\"#\"><i class=\"icon-twitter2\"></i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"icon-facebook2\"></i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"icon-instagram\"></i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"icon-dribbble2\"></i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"icon-youtube\"></i></a>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>Copyright 2016 Free Html5 <a href=\"#\">Pentagon</a>. All Rights Reserved. <br>Made with <i class=\"icon-heart3\"></i> by <a href=\"http://freehtml5.co/\" target=\"_blank\">Freehtml5.co</a> / Demo Images: <a href=\"https://unsplash.com/\" target=\"_blank\">Unsplash</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- END fh5co-page -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- END fh5co-wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Stellar -->\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("        <!-- Superfish -->\n");
      out.write("        <script src=\"js/hoverIntent.js\"></script>\n");
      out.write("        <script src=\"js/superfish.js\"></script>\n");
      out.write("        <!-- Google Map -->\n");
      out.write("        <!-- Main JS (Do not remove) -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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