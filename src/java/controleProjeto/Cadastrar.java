package controleProjeto;


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
import java.sql.ResultSet;


public class Cadastrar extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        String botao1 = request.getParameter("botao1");
        
        
        
        if(botao1.equals("Pesquisar"))
        {
               
        out.println("<head>\n" +
"            <link rel=\"icon\" type=\"image/png\" href=\"favicon.jpg\" />\n" +
"		<title>SGP</title>\n" +
"		<meta charset=\"latin1\" />\n" +
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
"	background-color: #F8F8F8;\n" +
"	margin: auto;\n" +
"}\n" +
"#tudo1 {\n" +
"       margin-left: 30px;\n" +
"	width: 925px;\n" +
"	background-color: #F8F8F8;\n" +
"	margin: auto;\n" +
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

             
             out.println(" <div id=\"tudo\"><div id=\"tudo1\">" +
"            <br>");
        
            
            String usuarioComum = request.getParameter("usuarioComum");
            
                    
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            
            
            String sql = "SELECT nome FROM usuario WHERE (nome LIKE '%"+usuarioComum+"%' AND tipo= 'Comum') OR (nome LIKE '"+usuarioComum+"%' AND tipo= 'Comum') OR (nome LIKE '%"+usuarioComum+"' AND tipo= 'Comum')";
            
            ResultSet rs = s.executeQuery(sql);
            
            out.println("<h3>Filtro de pesquisadores: "+usuarioComum+"</h3>");
            
            int cont=0;
              while(rs.next())
            {
                out.println("<form action='cadastrarP.jsp' method='post'>");
                out.println("<input type=text name=nome readonly=readonly value='"+rs.getString("nome")+"' size=50/>");
                out.println("<input type=submit value='Ok'/>");
                out.println("</form><br>");
                cont++;
            }
            
            out.println("<br><br>");
            out.println("Pesquisadores encontrados: "+cont);
                          
            
            
      
            
            
            }
        catch(ClassNotFoundException e){
              out.print("<head> <script type=\"text/javascript\"> alert(\"Usuario não encontrado!\");"
                    + "setTimeout(\"document.location = 'cadastrar.jsp'\",1);"
                    + " </script> </head>");
            System.out.println("erro1");
        }
        
        catch(SQLException e){
            System.out.println("erro2");
        }
        
        catch(Exception e){
            System.out.println("erro3");
        }
        
        
        
        out.println("<Br><br>\n" +
"        \n" +
"        <input type=\"submit\" value=\"Voltar\" onclick=\"location.href='cadastrar.jsp'\"><Br><br>\n" +
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        else
        {
        
        out.println("<head>                  \n" +
"<style>\n" +
"            \n" +
"#topo{\n" +
"margin: 0; \n" +
"padding: 0;\n" +
"height: 40px;\n" +
"width: 974px;\n" +
"align-items: center;\n" +
"background-color: #F8F8F8;\n" +
"border-style: solid;\n" +
"border-color: #F8F8F8;\n" +
"margin:0 auto;\n" +
"}\n" +
"\n" +
"\n" +
"#geral {\n"+
"position:absolute;\n" +
"background: transparent;\n" +
"top:40%;\n" +
"left:50.55%;\n" +
"width:500px;\n" +
"height:50px;\n" +
"margin-left:-250px;\n" +
"margin-top:-150px;\n" +
"border-style: solid;\n" +
"border-color: #F8F8F8;\n" +
"background-color: #F8F8F8;   //#E0EEEE \n" +
"\n" +
"\n" +
"\n" +
"#tudo1{\n" +
"position:relative;\n" +
"width: 500px;\n" +
"left: 24%;\n" +
"background-color: #F8F8F8;\n" +
"height: 580px;\n" +
"float: left;\n" +
"}\n" +
"\n" +
"\n" +
"#tudo2 {\n" +
"background-color: #F8F8F8;\n" +
"position: relative;\n" +
"width: 500px;\n" +
"right: 24%;\n" +
"height: 580px;	\n" +
"float: right;\n" +
"}\n" +
"\n" +
"\n" +
"#rodape{\n" +
"width: 974px;\n" +
"left: 24.6%;\n" +
"margin: 0; \n" +
"padding: 0;\n" +
"position: absolute;\n" +
"bottom:0;\n" +
"height: 195.5px;\n" +
"}\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"</style><title>Inserido!</title></head><body background=\"mobile_r.jpg\" bgproperties=\"fixed\" onload=\"javascript:cadastro.numero.focus()\">\n" +
"    <center><img src=\"banner.jpg\" width=\"980\" height=\"110\"/></center>");
                
       
       String numero = request.getParameter("numero");
       String titulo = request.getParameter("titulo");
       String responsavel = request.getParameter("responsavel");
       String coResponsavel = request.getParameter("coResponsavel");
       String telefone = (request.getParameter("ddd"))+(request.getParameter("telefone"));
       String email = request.getParameter("email");
       String equipe = request.getParameter("equipe");
       String processo = request.getParameter("processo");
       String linha = request.getParameter("linha");
       String objetivosPrincipais = request.getParameter("objetivosPrincipais");
       String resumo = request.getParameter("resumo");
       String metas = request.getParameter("metas");
       String abrangencia = request.getParameter("abrangencia");
       String relevancia = request.getParameter("relevancia");
       
       String mesInicio = request.getParameter("mesInicio");
       String anoInicio = request.getParameter("anoInicio");
       String dataInicio = mesInicio+"/"+anoInicio;
       
       String mesFim = request.getParameter("mesFim");
       String anoFim = request.getParameter("anoFim");
       String dataFim = mesFim+"/"+anoFim;
       
       String situacao = request.getParameter("situacao");
       String centro = request.getParameter("centro");
       String nucleo = request.getParameter("nucleo");
       String obs = request.getParameter("obs");
       String status = "Cadastrado.";
       String custoGlobal = ("R$ "+request.getParameter("custoGlobal"));
       String usuarioComum = request.getParameter("usuarioComum");
       String usuarioAdm = (String) request.getSession().getAttribute("nome");
       
       
       
       
       
       
        String vetor[] = new String[10];
        
        vetor = request.getParameterValues("numero");
       
       
       
       
       
       
       
       
       
       String grupo1 = request.getParameter("grupo1");
       
       if(grupo1.equals("Sim"))
       {
           String financiamentoExterno = request.getParameter("grupo2");
           
           try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
            
            //String sql = "insert into 'cadastro' (`usuario`, `senha`, `telefone`, `email`) values (?, ?, ?, ?)";
            p = con.prepareStatement("INSERT INTO projeto (numero, titulo, responsavel, coResponsavel, telefone, email,  equipe, processo, linha, objetivosPrincipais, resumo, metas, abrangencia, relevancia, dataInicio, dataFim, situacao, centro, nucleo, obs, usuarioComum, dataCadastro, status, financiamentoExterno, custoGlobal, usuarioAdm) values ('"+numero+"','"+titulo+"', '"+responsavel+"', '"+coResponsavel+"', '"+telefone+"', '"+email+"', '"+equipe+"', '"+processo+"', '"+linha+"', '"+objetivosPrincipais+"', '"+resumo+"', '"+metas+"', '"+abrangencia+"', '"+relevancia+"','"+dataInicio+"', '"+dataFim+"', '"+situacao+"', '"+centro+"', '"+nucleo+"', '"+obs+"', '"+usuarioComum+"', '"+new SimpleDateFormat().format(new Date())+"', '"+status+"', '"+financiamentoExterno+"', '"+custoGlobal+"', '"+usuarioAdm+"')");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Processo Cadastrado!\");"
                    + "setTimeout(\"document.location = 'terceiros.jsp'\",1);"
                    + " </script> </head>");
            
           
            
            
            
            
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
       
       
       
       
       else if(grupo1.equals("Não"))
       {
           
           String financiamentoExterno = "Não tem.";
           
           
           try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
            
            //String sql = "insert into 'cadastro' (`usuario`, `senha`, `telefone`, `email`) values (?, ?, ?, ?)";
            p = con.prepareStatement("INSERT INTO projeto (numero, titulo, responsavel, coResponsavel, telefone, email, equipe, processo, linha, objetivosPrincipais, resumo, metas, dataInicio, dataFim, situacao, centro, nucleo, obs, usuarioComum, dataCadastro, status, financiamentoExterno, custoGlobal, usuarioAdm) values ('"+numero+"','"+titulo+"', '"+responsavel+"', '"+coResponsavel+"', '"+telefone+"', '"+email+"', '"+equipe+"', '"+processo+"', '"+linha+"', '"+objetivosPrincipais+"', '"+resumo+"', '"+metas+"', '"+dataInicio+"', '"+dataFim+"', '"+situacao+"', '"+centro+"', '"+nucleo+"','"+obs+"', '"+usuarioComum+"', '"+new SimpleDateFormat().format(new Date())+"', '"+status+"', '"+financiamentoExterno+"', '"+custoGlobal+"', '"+usuarioAdm+"')");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Processo Cadastrado!\");"
                    + "setTimeout(\"document.location = 'terceiros.jsp'\",1);"
                    + " </script> </head>");
            
            
            response.sendRedirect("terceiros.jsp?processo='"+processo+"'");
            
            
            
            
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
