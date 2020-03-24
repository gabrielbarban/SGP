package controleProjeto;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class pesquisarNumero extends HttpServlet {

    
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n" +
"        <title>SGP</title>\n" +
"        \n" +
"        \n" +
"            <style>\n" +
"\n" +
"#tudo1 {\n" +
"	position:relative;\n" +
"	width: 500px;\n" +
"	height: 500px;\n" +
"	\n" +
"	float: left;\n" +
"}\n" +
"\n" +

" #top{\n" +
"                  position: absolute;\n" +
"                  width: 1330px;\n" +
"                  border-style: solid;\n" +
"                  border-color: black;\n" +
"                  background-color: #C1CDCD;   //#E0EEEE       \n" +
"              }   "+
"\n" +
"\n" +
"\n" +
"</style>\n" +
"        \n" +
"    </head>\n" +
"    ");
            
        out.println("<body background=\"mobile_r.jpg\" bgproperties=\"fixed\">");    
            
            
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
       
       

            
            
            
       
       
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select numero, titulo, responsavel, coResponsavel, contato, equipe, processo, linha, objetivosPrincipais, resumo, metasAno1, metasAno2, metasAno3, metasAno4, inicio, previsaoFim, situacao, centro, nucleo, prazo, obs from projeto where numero='"+numero+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next())
            { 
                numero = rs.getString("numero");
                titulo = rs.getString("titulo");
                responsavel = rs.getString("responsavel");
                coResponsavel = rs.getString("coResponsavel");
                contato = rs.getString("contato");
                equipe = rs.getString("equipe");
                processo = rs.getString("processo");
                linha = rs.getString("linha");
                objetivosPrincipais = rs.getString("objetivosPrincipais");
                resumo = rs.getString("resumo");
                metasAno1 = rs.getString("metasAno1");
                metasAno2 = rs.getString("metasAno2");
                metasAno3 = rs.getString("metasAno3");
                metasAno4 = rs.getString("metasAno4");
                inicio = rs.getString("inicio");
                previsaoFim = rs.getString("previsaoFim");
                situacao = rs.getString("situacao");
                centro = rs.getString("centro");
                nucleo = rs.getString("nucleo");
                prazo = rs.getString("prazo");
                obs = rs.getString("obs");              
            }
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
  
        
            
          out.println("<div id=top>");
            
            
            
        if(numero != null && titulo != null && responsavel != null)
        {
        out.println(" <table border=\"1\"><tr><td><b>Número: </b></td><td>"+numero+"</td></tr>");
        out.println("<tr><td><b>Titulo: </b></td><td>"+titulo+"</td></tr>");
        out.println("<tr><td><b>Responsável: </b></td><td>"+responsavel+"</td></tr>");
        out.println("<tr><td><b>Co-Responsável: </b></td><td>"+coResponsavel+"</td></tr>");
        out.println("<tr><td><b>Contato: </b></td><td>"+contato+"</td></tr>");
        out.println("<tr><td><b>Equipe: </b></td><td>"+equipe+"</td></tr>");
        out.println("<tr><td><b>Processo: </b></td><td>"+processo+"</td></tr>");
        out.println("<tr><td><b>Linha: </b></td><td>"+linha+"</td></tr>");
        out.println("<tr><td><b>Objetivos principais: </b></td><td>"+objetivosPrincipais+"</td></tr>");
        out.println("<tr><td><b>Resumo: </b></td><td>"+resumo+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 1: </b></td><td>"+metasAno1+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 2: </b></td><td>"+metasAno2+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 3: </b></td><td>"+metasAno3+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 4: </b></td><td>"+metasAno4+"</td></tr>");
        out.println("<tr><td><b>Início: </b></td><td>"+inicio+"</td></tr>");
        out.println("<tr><td><b>Previsão Fim: </b></td><td>"+previsaoFim+"</td></tr>");
        out.println("<tr><td><b>Situação: </b></td><td>"+situacao+"</td></tr>");
        out.println("<tr><td><b>Centro: </b></td><td>"+centro+"</td></tr>");
        out.println("<tr><td><b>Núcleo: </b></td><td>"+nucleo+"</td></tr>");
        out.println("<tr><td><b>Prazo: </b></td><td>"+prazo+"</td></tr>");
        out.println("<tr><td><b>Observação: </b></td><td>"+obs+"</td></tr></table>");
        }
            
            
        else
            out.println("Não foram encontrados registros com esse numero");
        
        
        out.println("<BR><BR><BR><BR><input type=\"submit\" value=\"Voltar\" onclick=\"location.href='pesquisarNumero.jsp' \">");
         out.println("</div>");   
            
            
            
            
            
           
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
