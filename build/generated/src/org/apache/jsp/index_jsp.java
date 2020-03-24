package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.*;

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
      response.setContentType("text/html;charset=Latin1");
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"favicon.jpg\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SGP</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            #topo{\n");
      out.write("                 margin: 0; \n");
      out.write("                 padding: 0;\n");
      out.write("                 height: 34px;\n");
      out.write("                 width: 974px;\n");
      out.write("                 align-items: center;\n");
      out.write("                 background-color: #F8F8F8;\n");
      out.write("                 border-style: solid;\n");
      out.write("                 border-color: #F8F8F8;\n");
      out.write("                 margin:0 auto;\n");
      out.write("                 \n");
      out.write("            }\n");
      out.write("\n");
      out.write("#tudo1 {\n");
      out.write("\tposition:relative;\n");
      out.write("\twidth: 500px;\n");
      out.write("        left: 24%;\n");
      out.write("        background-color: #F8F8F8;\n");
      out.write("\theight: 614px;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tudo2 {\n");
      out.write("        background-color: #F8F8F8;\n");
      out.write("\tposition: relative;\n");
      out.write("\twidth: 500px;\n");
      out.write("        right: 24%;\n");
      out.write("\theight: 614px;\t\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#rodape{\n");
      out.write("        width: 974px;\n");
      out.write("        left: 24.5%;\n");
      out.write("        margin: 0; \n");
      out.write("        padding: 0;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tbottom:0;\n");
      out.write("        height: 195.5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("      <body background=\"mobile_r.jpg\" bgproperties=\"fixed\" background=\"transparent\">\n");
      out.write("        <body background=\"mobile_r.jpg\" bgproperties=\"fixed\">\n");
      out.write("    <center><img src=\"banner.jpg\" width=\"980\" height=\"110\"/></center>\n");
      out.write("        \n");
      out.write("        <div id=\"topo\">\n");
      out.write("            <center><font size=\"6\">Sistema Gerenciador de Projetos</font></center>            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <font color=\"black\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br><br><br><br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"tudo1\">\n");
      out.write("        <ul>\n");
      out.write("        <li><input type=\"submit\" value=\"Pesquisar pelo Número do Projeto\" size=\"10\" onclick=\"location.href='pesquisarNumero.jsp'\"></li> </li><br>\n");
      out.write("        \n");
      out.write("        <li><input type=\"submit\" value=\"Pesquisar pelo Número do Processo\" onclick=\"location.href='pesquisarProcesso.jsp' \"></li><BR>\n");
      out.write("        \n");
      out.write("        <li><input type=\"submit\" value=\"Pesquisar pela Linha\" onclick=\"location.href='pesquisarLinha.jsp' \"></li><BR>\n");
      out.write("        \n");
      out.write("        <li><input type=\"submit\" value=\"Pesquisar pelo Situação\" onclick=\"location.href='pesquisarSituacao.jsp' \"></li><BR>\n");
      out.write("        \n");
      out.write("        <li><input type=\"submit\" value=\"Pesquisar pelo Responsável\" onclick=\"location.href='pesquisarResponsavel.jsp' \"></li><BR>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("       \n");
      out.write("    \n");
      out.write("    <div id=\"tudo2\">\n");
      out.write("         <form name=\"loginFORM\" method=\"POST\" action=\"Login\">\n");
      out.write("              <center>\n");
      out.write("                  <h3>Autenticação</h3>\n");
      out.write("            <table>\n");
      out.write("            <tr><td>USUÁRIO: </td><td><input type=\"text\" name=\"usuario\" value=\"\" size=\"30\" /></td></tr>\n");
      out.write("            <tr><td>SENHA: </td><td><input type=\"password\" name=\"senha\" value=\"\" size=\"30\" /></td></tr>\n");
      out.write("            <tr><td><input type=\"submit\" value=\"Entrar\" name=\"botao1\" size=\"40\"/></td><td><input type=\"reset\" value=\"Limpar\" name=\"botao2\" size=\"40\"/></td></tr>\n");
      out.write("            </table>\n");
      out.write("                  \n");
      out.write("              </center>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"rodape\"> <img src=\"rodape_intranet.jpg\" width=\"975\" height=\"56\" alt=\"rodape_intranet\"/>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </font>\n");
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
