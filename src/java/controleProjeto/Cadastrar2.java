package controleProjeto;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Cadastrar2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
        out.println("<title>Inserido!</title><body>");
                
        
       String titulo = request.getParameter("titulo");
       String coResponsavel = request.getParameter("coResponsavel");
       String telefone = (request.getParameter("ddd")) + (request.getParameter("telefone"));
       String email = request.getParameter("email");
       String equipe = request.getParameter("equipe");
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
       String status = "Em avaliação";
       String custoGlobal = request.getParameter("custoGlobal");
       
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
            p = con.prepareStatement("INSERT INTO projeto2 (titulo, coResponsavel, telefone, email,  equipe, linha, objetivosPrincipais, resumo, metas, abrangencia, relevancia, dataInicio, dataFim, situacao, centro, nucleo, obs, usuarioComum, data, status, financiamentoExterno, custoGlobal) values ('"+titulo+"', '"+coResponsavel+"', '"+telefone+"', '"+email+"', '"+equipe+"', '"+linha+"', '"+objetivosPrincipais+"', '"+resumo+"', '"+metas+"', '"+abrangencia+"', '"+relevancia+"', '"+dataInicio+"', '"+dataFim+"', '"+situacao+"', '"+centro+"', '"+nucleo+"', '"+obs+"', '"+(String) request.getSession().getAttribute("nome")+"', '"+new SimpleDateFormat().format(new Date())+"', '"+status+"', '"+financiamentoExterno+"', '"+custoGlobal+"')");
            p.executeUpdate();
            
            
            
            response.sendRedirect("Cadastrar3?titulo="+titulo);
            
            
            
            
         
            
            
            
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
            p = con.prepareStatement("INSERT INTO projeto2 (titulo, coResponsavel, telefone, email,  equipe, linha, objetivosPrincipais, resumo, metas, abrangencia, relevancia, dataInicio, dataFim, situacao, centro, nucleo, obs, usuarioComum, data, status, financiamentoExterno, custoGlobal) values ('"+titulo+"', '"+coResponsavel+"', '"+telefone+"', '"+email+"', '"+equipe+"', '"+linha+"', '"+objetivosPrincipais+"', '"+resumo+"', '"+metas+"', '"+abrangencia+"', '"+relevancia+"', '"+dataInicio+"', '"+dataFim+"', '"+situacao+"', '"+centro+"', '"+nucleo+"', '"+obs+"', '"+(String) request.getSession().getAttribute("nome")+"', '"+new SimpleDateFormat().format(new Date())+"', '"+status+"', '"+financiamentoExterno+"', '"+custoGlobal+"')");
            p.executeUpdate();
            s.close();
            p.close();
            
            response.sendRedirect("Cadastrar3?titulo="+titulo);
            
            
       
            
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
