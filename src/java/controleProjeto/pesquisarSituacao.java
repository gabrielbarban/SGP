package controleProjeto;


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


public class pesquisarSituacao extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        out.println("<head>\n" +
"            <link rel=\"icon\" type=\"image/png\" href=\"favicon.jpg\" />\n" +
"		<title>SGP</title>\n" +
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
"	width: 700px;\n" +
"	height: 600px;\n" +
"	background-color: #F8F8F8;\n" +
"	float: left;\n" +
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
"            <center><font size=\"6\" >Sistema Gerenciador de Projetos</font></center></div><br><br>");

             
             out.println(" <div id=\"tudo\">\n" +
"            <br>");
            
        
      try {
            
            
            
            
       String numero = request.getParameter("numero");
       String titulo = request.getParameter("titulo");
       String responsavel = request.getParameter("responsavel");
       String coResponsavel = request.getParameter("coResponsavel");
       String contato = request.getParameter("contato");
       String equipe = request.getParameter("equipe");
       String processo = request.getParameter("processo");
       String linha = request.getParameter("linha");
       String objetivosPrincipais = request.getParameter("objetivosPrincipais");
       String resumo = request.getParameter("resumo");
       String metasAno1 = request.getParameter("metasAno1");
       String metasAno2 = request.getParameter("metasAno2");
       String metasAno3 = request.getParameter("metasAno3");
       String metasAno4 = request.getParameter("metasAno4");
       String inicio = request.getParameter("inicio");
       String previsaoFim = request.getParameter("previsaoFim");
       String situacao = request.getParameter("situacao");
       String centro = request.getParameter("centro");
       String nucleo = request.getParameter("nucleo");
       String prazo = request.getParameter("prazo");
       String obs = request.getParameter("obs");
       
       
       
       out.println("<h3>Projetos com a Situação: "+situacao+"</h3><hr><bR>");
            
            
            
       
       
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            
            int i=0;
            
            
            String sql = "Select numero, titulo, responsavel, coResponsavel, contato, equipe, processo, linha, objetivosPrincipais, resumo, metasAno1, metasAno2, metasAno3, metasAno4, inicio, previsaoFim, situacao, centro, nucleo, prazo, obs from projeto where situacao='"+situacao+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            int contador=1;
            while(rs.next())
            {
                                 
        out.println("<body><table border=\"1\"><tr><td><b>Número: </b></td><td>"+rs.getString("numero")+"</td></tr>");
        out.println("<tr><td><b>Titulo: </b></td><td>"+rs.getString("titulo")+"</td></tr>");
        out.println("<tr><td><b>Responsável: </b></td><td>"+rs.getString("responsavel")+"</td></tr>");
        out.println("<tr><td><b>Co-Responsável: </b></td><td>"+rs.getString("coResponsavel")+"</td></tr>");
        out.println("<tr><td><b>Contato: </b></td><td>"+rs.getString("contato")+"</td></tr>");
        out.println("<tr><td><b>Equipe: </b></td><td>"+rs.getString("equipe")+"</td></tr>");
        out.println("<tr><td><b>Processo: </b></td><td>"+rs.getString("processo")+"</td></tr>");
        out.println("<tr><td><b>Linha: </b></td><td>"+rs.getString("linha")+"</td></tr>");
        out.println("<tr><td><b>Objetivos principais: </b></td><td>"+rs.getString("objetivosPrincipais")+"</td></tr>");
        out.println("<tr><td><b>Resumo: </b></td><td>"+rs.getString("resumo")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 1: </b></td><td>"+rs.getString("metasAno1")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 2: </b></td><td>"+rs.getString("metasAno2")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 3: </b></td><td>"+rs.getString("metasAno3")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 4: </b></td><td>"+rs.getString("metasAno4")+"</td></tr>");
        out.println("<tr><td><b>Início: </b></td><td>"+rs.getString("inicio")+"</td></tr>");
        out.println("<tr><td><b>Previsão Fim: </b></td><td>"+rs.getString("previsaoFim")+"</td></tr>");
        out.println("<tr><td><b>Situação: </b></td><td>"+rs.getString("situacao")+"</td></tr>");
        out.println("<tr><td><b>Centro: </b></td><td>"+rs.getString("centro")+"</td></tr>");
        out.println("<tr><td><b>Núcleo: </b></td><td>"+rs.getString("nucleo")+"</td></tr>");
        out.println("<tr><td><b>Prazo: </b></td><td>"+rs.getString("prazo")+"</td></tr>");
        out.println("<tr><td><b>Observação: </b></td><td>"+rs.getString("obs")+"</td></tr></table>");
                out.println("<br><br>------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------<br><Br><Br><body>");
                        contador++;
                        i++;
                        
                
            }
            out.println("Numero de projetos encontrados: "+(contador-1));
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
  
        
            
     
        out.println("<br><br>\n" +
"        \n" +
"        <input type=\"submit\" value=\"Voltar\" onclick=\"location.href='pesquisarSituacao.jsp' \">\n" +
"        \n" +
"       \n" +
"        <br>\n" +
"        \n" +
"        </div>\n" +
"    \n" +
"    <br><Br>\n" +
"    <div id=\"rodape\" align=\"center>\"><center><img src=\"rodape_intranet.jpg\" width=\"970\" height=\"56\" alt=\"rodape_intranet\"/></center></div>\n" +
"    \n" +
"   \n" +
"    </body>");
            
            
            
            
            
            
           
        } finally {
            out.close();
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
