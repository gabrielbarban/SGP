
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


public class listarProjeto3 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
          out.println(" <head>\n" +
"            <link rel=\"icon\" type=\"image/png\" href=\"favicon.jpg\" />\n" +
"		<title>Projetos Recebidos</title>\n" +
"		<meta charset=\"utf-8\" />\n" +
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
"	 background-color: #F8F8F8;\n" +
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

             
             out.println(" <div id=\"tudo\"><div id=tudo1>\n" +
"            <br>");
             
             
       String id = request.getParameter("id");
        
        
        

       
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "SELECT * FROM projeto2 WHERE id="+id;
            
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next())
            {
                out.println("<h3>Projeto: "+rs.getString("titulo")+"</h3><hr><br>");     
                out.println("<table border=\"1\"><tr><td><b>Titulo: </b></td><td>"+rs.getString("titulo")+"</td></tr>");
                out.println("<tr><td><b>Co-Responsável: </b></td><td>"+rs.getString("coResponsavel")+"</td></tr>");
                out.println("<tr><td><b>Telefone: </b></td><td>"+rs.getString("telefone")+"</td></tr>");
                out.println("<tr><td><b>E-mail: </b></td><td>"+rs.getString("email")+"</td></tr>");
                out.println("<tr><td><b>Equipe: </b></td><td>"+rs.getString("equipe")+"</td></tr>");
                out.println("<tr><td><b>Identificação: </b></td><td>"+rs.getString("id")+"</td></tr>");
                out.println("<tr><td><b>Linha: </b></td><td>"+rs.getString("linha")+"</td></tr>");
                out.println("<tr><td><b>Objetivos principais: </b></td><td>"+rs.getString("objetivosPrincipais")+"</td></tr>");
                out.println("<tr><td><b>Resumo: </b></td><td>"+rs.getString("resumo")+"</td></tr>");
                out.println("<tr><td><b>Metas: </b></td><td>"+rs.getString("metas")+"</td></tr>");
                out.println("<tr><td><b>Início: </b></td><td>"+rs.getString("dataInicio")+"</td></tr>");
                out.println("<tr><td><b>Previsão Fim: </b></td><td>"+rs.getString("dataFim")+"</td></tr>");
                out.println("<tr><td><b>Situação: </b></td><td>"+rs.getString("situacao")+"</td></tr>");
                out.println("<tr><td><b>Centro: </b></td><td>"+rs.getString("centro")+"</td></tr>");
                out.println("<tr><td><b>Núcleo: </b></td><td>"+rs.getString("nucleo")+"</td></tr>");
                out.println("<tr><td><b>Observação: </b></td><td>"+rs.getString("obs")+"</td></tr>");
                out.println("<tr><td><b>Data do envio: </b></td><td>"+rs.getString("data")+"</td></tr>");
                out.println("<tr><td><b>Financiamento externo: </b></td><td>"+rs.getString("financiamentoExterno")+"</td></tr>");
                out.println("<tr><td><b>Usuário: </b></td><td>"+rs.getString("usuarioComum")+"</td></tr>");
                out.println("<tr><td><b>Custo global: </b></td><td>"+rs.getString("custoGlobal")+"</td></tr>");
                out.println("<tr><td><b>Abrangência: </b></td><td>"+rs.getString("abrangencia")+"</td></tr>");
                out.println("<tr><td><b>Relevância: </b></td><td>"+rs.getString("relevancia")+"</td></tr>");
                out.println("<tr><td><b>Status: </b></td><td>Em avaliação.</td></tr>");
                out.println("<tr><td><b>Custo Global: </b></td><td>"+rs.getString("custoGlobal")+"</td></tr></table>");
            }
     
        
         out.println("<Br><br>\n" +
"        \n" +
"        <input type=\"submit\" value=\"Voltar\" onclick=\"location.href='listarProjeto'\"><Br><br>\n" +
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
            rs.close();
            s.close();
            con.close();  
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
