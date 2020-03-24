package controleAdmin;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class listarUsuario extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
       
         out.println(" <head>\n" +
"            <link rel=\"icon\" type=\"image/png\" href=\"favicon.jpg\" />\n" +
"		<title>Usuários SGP</title>\n" +
"		<meta charset=\"Latin1\" />\n" +
"		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
"		<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n" +
"                \n" +
"                <style>\n" +
"                    #topo{\n" +
"                 background-color: #F8F8F8;\n" +
"                 border-style: solid;\n" +
"                 border-color: #F8F8F8;\n" +
"                 margin: auto;\n" +
"                 width: 976px;\n" +
"                    }\n" +
"\n" +
"\n" +
"#tudo {\n" +
"        width: 976px;\n" +
"	background-color: #F8F8F8;\n" +
"	margin: auto;\n" +
"}\n" +
"#tudo1 {\n" +
"        width: 900px;\n" +
"	background-color: #F8F8F8;\n" +
"	margin: auto;\n" +
"        margin-left: 30px;\n" +
"}\n" +
"\n" +
"#tudo4 {\n" +
"	width: 488px;\n" +
"	height: 600px;\n" +
"	background-color: #F8F8F8;\n" +
"	float: right;\n" +
"}\n" +
"\n" +
"#rodape{\n" +
"        width: 976px;\n" +
"        margin: auto; \n" +
"}\n" +
"</style>\n" +
"                </style>\n" +
"\n" +
"	</head>");
        
       
        out.println(" <body background=\"mobile_r.jpg\" bgproperties=\"fixed\" background=\"transparent\">\n" +
"    <center><img src=\"banner.jpg\" width=\"980\" height=\"110\"/></center><br>\n" +
"    \n" +
"            <div id=\"topo\">\n" +
"            <center><font size=\"6\" >Sistema Gerenciador de Projetos</font></center> \n" +
"            <div align=\"right\">"); out.println(new SimpleDateFormat().format(new Date())); 
             out.println("<br> Usuário:"+ (String) request.getSession().getAttribute("nome")+"(<a href=\"index.html\">Sair</a>)</div></div><br><br>");

             
             out.println("<div id=\"tudo\"><div id=\"tudo1\">");
               
        
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select id, username, nome from usuario where tipo='Administrador' ORDER BY nome ASC";
            
            ResultSet rs = s.executeQuery(sql);
            
            int cont1=0;
            out.println("<body><br><h1>Usuários Administradores:</h1><hr><br>");
            while(rs.next())
            {
                out.println("<form name=usuario action='listarUsuario2'>");
                out.println("<table><tr><td>ID: </td><td><input type='text' name=id value='"+rs.getInt("id")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td>Nome: </td><td><input type='text' name=nome value='"+rs.getString("nome")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td>Usuario: </td><td><input type='text' value='"+rs.getString("username")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td><input type=\"submit\" value=\"Atualizar\" name=\"botao\" /></td></tr>");
                out.println("<tr><td><input type=\"submit\" value=\"Excluir\" name=\"botao\" /></td></tr>");
                out.println("</table></form>");
                out.println("<hr><br>");
                cont1++;
            }
            
            out.println("Número de usuários: "+cont1);
            out.println("<br><br><br>");
            
            
            
            
            
            
            
            
             String sql2 = "Select id, username, nome from usuario where tipo='Comum' ORDER BY nome ASC";
            
            ResultSet rs1 = s.executeQuery(sql2);
            
            int cont2=0;
            out.println("<h1>Usuários Comuns:</h1><hr><br><br>");
            while(rs1.next())
            {
                out.println("<form name=usuario action='listarUsuario2'>");
                out.println("<table><tr><td>ID: </td><td><input type='text' name=id value='"+rs1.getInt("id")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td>Nome: </td><td><input type='text' name=nome value='"+rs1.getString("nome")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td>Usuario: </td><td><input type='text' value='"+rs1.getString("username")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td><input type=\"submit\" value=\"Atualizar\" name=\"botao\" /></td></tr>");
                out.println("<tr><td><input type=\"submit\" value=\"Excluir\" name=\"botao\" /></td></tr>");
                out.println("</table></form>");
                out.println("<hr><br>");
                cont2++;
            }
            
            
            
            
            
             out.println("Número de usuários: "+cont2);
             out.println("<br><br><br>");
            
            
            
            
            
            
            
            
             String sql3 = "Select id, username, nome from usuario where tipo='Auxiliar' ORDER BY nome ASC";
            
            ResultSet rs2 = s.executeQuery(sql3);
            
            int cont3=0;
            out.println("<h1>Usuários Auxiliares:</h1><hr><br><br>");
            while(rs2.next())
            {
                out.println("<form name=usuario action='listarUsuario2'>");
                out.println("<table><tr><td>ID: </td><td><input type='text' name=id value='"+rs2.getInt("id")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td>Nome: </td><td><input type='text' name=nome value='"+rs2.getString("nome")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td>Usuario: </td><td><input type='text' value='"+rs2.getString("username")+"' readonly=\"readonly\"/></td></tr>");
                out.println("<tr><td><input type=\"submit\" value=\"Atualizar\" name=\"botao\" /></td></tr>");
                out.println("<tr><td><input type=\"submit\" value=\"Excluir\" name=\"botao\" /></td></tr>");
                out.println("</table></form>");
                out.println("<hr><br>");
                cont3++;
            }
            
           out.println("Número de usuários: "+cont3);
            
          }
          catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
        }
        
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        
        
        out.println("<Br><br>\n" +
"        \n" +
"        <input type=\"submit\" value=\"Voltar\" onclick=\"location.href='inicial.jsp'\"><br><br>\n" +
"        \n" +
"        \n" +
"        </div></div>\n" +
"        <br><br>\n" +
"             <div id=\"rodape\" align=\"center>\"><center><img src=\"rodape_intranet.jpg\" width=\"975\" height=\"56\" alt=\"rodape_intranet\"/></center></div>\n" +
"   \n" +
"        \n" +
"       \n" +
"        ");
            
            
            
            out.println("</body>");
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
