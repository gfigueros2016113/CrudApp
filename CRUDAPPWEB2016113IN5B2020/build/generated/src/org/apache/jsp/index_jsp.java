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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group text-center\"> \n");
      out.write("            <br><br><br><br>\n");
      out.write("            <img src=\"view/img/Administrador.png\" height=\"120\" width=\"120\"/>\n");
      out.write("            <h1> Bienvenidos </h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\"></div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <form action=\"Controlador\">\n");
      out.write("                            <div class=\"form-group text-left\">\n");
      out.write("                                <label>Usuario:</label> <br>\n");
      out.write("                                <input class=\"form-control\" type = \"text\" name = \"txtUser\" placeholder=\"Ingrese Nombres\"> <br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group text-left\">\n");
      out.write("                                <label>Contrase??a:</label> <br>\n");
      out.write("                                <input class=\"form-control\" type = \"password\" name = \"txtPassword\" placeholder=\"Ingrese Contrase??a\"> <br>\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"form-group text-center\">\n");
      out.write("                            <select class=\"form-control\" name=\"Roles\" >\n");
      out.write("                                <option value=\"0\">Seleccione un Rol</option>\n");
      out.write("                                <option value=\"1\">Administrador</option>\n");
      out.write("                                <option value=\"2\">User</option>\n");
      out.write("                            </select><br>\n");
      out.write("                            </div>   \n");
      out.write("                        <input class=\"btn btn-success btn-block\" type=\"submit\" name=\"accion\" value=\"Ingresar\">     \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                     ");

                        if(request.getParameter("accion")!=null){
                            int va = (Integer)request.getAttribute("coco");
                            if(va==1){
                    
      out.write("<script> alert(\"Rol Incorrecto\");</script> ");

                            }else if(va==2){
                    
      out.write("<script> alert(\"Seleccione Rol\");</script> ");
     
                            }else if(va==3){
                    
      out.write("<script> alert(\"El Usuario o Contrase??a es Incorrecto\");</script> ");
     
                            }
                        }                       
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                <div class=\"col\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
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
