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


public class PesquisarProjeto3 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        out.println("<head><title>Novo Projeto</title></head>");
        
        
       String id = (String) request.getSession().getAttribute("id");
        
       String numero = request.getParameter("numero");
       String titulo = request.getParameter("titulo");
       String coResponsavel =  request.getParameter("coResponsavel");
       String telefone = request.getParameter("telefone");
       String email = request.getParameter("email");
       String equipe = request.getParameter("equipe");
       String linha =  request.getParameter("linha");
       String objetivosPrincipais = request.getParameter("objetivosPrincipais");
       String resumo =  request.getParameter("resumo");
       String metas =  request.getParameter("metas");
       String processo = request.getParameter("processo");
       String dataInicio =  request.getParameter("dataInicio");
       String dataFim =  request.getParameter("dataFim");
       String situacao =  request.getParameter("situacao");
       String centro = request.getParameter("centro");
       String nucleo =  request.getParameter("nucleo");
       String obs = request.getParameter("obs");
       String usuarioAdm = (String) request.getSession().getAttribute("nome");
       String data = request.getParameter("data");
       String status = "Cadastrado";
       String usuarioComum = request.getParameter("usuarioComum");
       String abrangencia = request.getParameter("abrangencia");
       String relevancia = request.getParameter("relevancia");
       String custoGlobal = request.getParameter("custoGlobal");
       
       
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
            
            //String sql = "insert into 'cadastro' (`usuario`, `senha`, `telefone`, `email`) values (?, ?, ?, ?)";
            p = con.prepareStatement("INSERT INTO projeto (numero, titulo, processo, coResponsavel, telefone, email, equipe, linha, objetivosPrincipais, resumo, metas, dataInicio, dataFim, situacao, centro, nucleo, obs, usuarioAdm, dataCadastro, status, usuarioComum, abrangencia, relevancia, custoGlobal) values ('"+numero+"','"+titulo+"','"+processo+"', '"+coResponsavel+"', '"+telefone+"', '"+email+"', '"+equipe+"', '"+linha+"', '"+objetivosPrincipais+"', '"+resumo+"', '"+metas+"', '"+dataInicio+"', '"+dataFim+"', '"+situacao+"', '"+centro+"', '"+nucleo+"',  '"+obs+"', '"+usuarioAdm+"','"+data+"', '"+status+"', '"+usuarioComum+"', '"+abrangencia+"', '"+relevancia+"', '"+custoGlobal+"')");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Projeto incluído\");"
                    + "setTimeout(\"document.location = 'inicial.jsp'\",1);"
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
       
       
       
       
       
       
       
       
       
       
       
       
       
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            //String sql = "update projeto set numero='"+numero1+"', titulo='"+titulo1+ "', responsavel='"+responsavel1+"', coResponsavel='"+coResponsavel1+"', contato='"+contato1+"', equipe='"+equipe1+"', processo='"processo1+"', linha='"+linha1+"', objetivosPrincipais='"+objetivosPrincipais1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"' where numero='"+numero1+"'";
            String sql = "delete from projeto2 where id="+id;
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
