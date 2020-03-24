package controleAdmin;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PesquisarUsuario2 extends HttpServlet {

    
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
"	width: 976px;\n" +
"	height: 600px;\n" +
"	background-color: #F8F8F8;\n" +
"	margin: auto;\n" +
"}\n" +
"#tudo1 {\n" +
"        margin-left: 30px;\n" +
"	width: 488px;\n" +
"	height: 600px;\n" +
"	background-color: #F8F8F8;\n" +
"	float: left;\n" +
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

             
             out.println(" <div id=\"tudo\">\n" +
"            <br>");
        
        
        
         
         if(request.getParameter("password").equals(request.getParameter("password2")))
         {
              String id = request.getParameter("id");
              String username = request.getParameter("username");
              String password = request.getParameter("password");
              String nome = request.getParameter("nome");
              String tipo = request.getParameter("tipo");
              
               out.println(username);
        
         try
        {           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
         
            String sql = "UPDATE USUARIO SET username='"+username+"', password='"+password+"', nome='"+nome+"', tipo='"+tipo+"' where id='"+id+"'";
           
            
             out.print("<head> <script type=\"text/javascript\"> alert(\"Usuário Atualizado!\");"
                    + "setTimeout(\"document.location = 'inicial.jsp'\",1);"
                    + " </script> </head>");
           
            
            p = con.prepareStatement(sql);
            p.executeUpdate(sql);
            p.close();
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
         
         
         
         else{
            out.print("<head> <script type=\"text/javascript\"> alert(\"Senhas não conferem!!\");"
                    + "setTimeout(\"document.location = 'listarUsuario'\",1);"
                    + " </script> </head>"); }
         
         
          
        out.println("<Br><br>\n" +
"        \n" +
"        <input type=\"submit\" value=\"Voltar\" onclick=\"location.href='inicialComum.jsp'\">\n" +
"        \n" +
"        \n" +
"        </div>\n" +
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
