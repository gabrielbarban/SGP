package controleProjeto;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class visualizarAlteracoes2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
        
        
        
        
        
        
        String alteracao = request.getParameter("alteracao");
        String observacao = request.getParameter("observacao");
        String processo = request.getParameter("processo");
        String botao = request.getParameter("botao");
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        if(botao.equals("Visualizar e Atualizar Projeto")==true)
        {
            
                try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select * from projeto where processo='"+processo+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
            { 
                request.getSession().setAttribute("numero", rs.getString("numero"));
                request.getSession().setAttribute("titulo", rs.getString("titulo"));
                request.getSession().setAttribute("responsavel", rs.getString("responsavel"));
                request.getSession().setAttribute("coResponsavel", rs.getString("coResponsavel"));
                request.getSession().setAttribute("telefone", rs.getString("telefone"));
                request.getSession().setAttribute("email", rs.getString("email"));
                request.getSession().setAttribute("equipe", rs.getString("equipe"));
                request.getSession().setAttribute("processo", rs.getString("processo"));
                request.getSession().setAttribute("linha", rs.getString("linha"));
                request.getSession().setAttribute("objetivosPrincipais", rs.getString("objetivosPrincipais"));
                request.getSession().setAttribute("resumo", rs.getString("resumo"));
                request.getSession().setAttribute("metas", rs.getString("metas"));
                request.getSession().setAttribute("dataInicio", rs.getString("dataInicio"));
                request.getSession().setAttribute("dataFim", rs.getString("dataFim"));
                request.getSession().setAttribute("situacao", rs.getString("situacao"));
                request.getSession().setAttribute("centro", rs.getString("centro"));
                request.getSession().setAttribute("nucleo", rs.getString("nucleo"));
                request.getSession().setAttribute("obs", rs.getString("obs"));
                request.getSession().setAttribute("usuarioAdm", rs.getString("usuarioAdm"));
                request.getSession().setAttribute("dataCadastro", rs.getString("dataCadastro"));
                request.getSession().setAttribute("status", rs.getString("status"));
                request.getSession().setAttribute("financiamentoExterno", rs.getString("financiamentoExterno"));
                request.getSession().setAttribute("usuarioComum", rs.getString("usuarioComum"));
                request.getSession().setAttribute("custoGlobal", rs.getString("custoGlobal"));   
                response.sendRedirect("atualizarProjeto.jsp");
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
        
        
        
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if(botao.equals("Autorizar Mudanças")==true)
        {
            
            String status = "Autorizado";
    
      
         try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            //String sql = "update projeto set numero='"+numero1+"', titulo='"+titulo1+ "', responsavel='"+responsavel1+"', coResponsavel='"+coResponsavel1+"', contato='"+contato1+"', equipe='"+equipe1+"', processo='"processo1+"', linha='"+linha1+"', objetivosPrincipais='"+objetivosPrincipais1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"' where numero='"+numero1+"'";
            String sql = "delete from alteracoes where processo='"+processo+"' and status='Em avaliação.'";
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
            
            
            
            
            
               
            
             try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
                 
            
            p = con.prepareStatement("INSERT INTO alteracoes (alteracao, observacao, processo, status) VALUES ('"+alteracao+"', '"+observacao+"', '"+processo+"', '"+status+"')");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Alteração aceita!\");"
                    + "setTimeout(\"document.location = 'visualizarAlteracoes'\",1);"
                    + " </script></head>");
           
            
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
            
            
            
        
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
        if(botao.equals("Negar Mudanças")==true)
         {
            
            String status = "Negado";
    
      
         try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            //String sql = "update projeto set numero='"+numero1+"', titulo='"+titulo1+ "', responsavel='"+responsavel1+"', coResponsavel='"+coResponsavel1+"', contato='"+contato1+"', equipe='"+equipe1+"', processo='"processo1+"', linha='"+linha1+"', objetivosPrincipais='"+objetivosPrincipais1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"' where numero='"+numero1+"'";
            String sql = "delete from alteracoes where processo='"+processo+"' and status='Em avaliação.'";
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
            
            
            
            
            
            
            
            
            
                     
            
             try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
                 
            
            p = con.prepareStatement("INSERT INTO alteracoes (alteracao, observacao, processo, status) VALUES ('"+alteracao+"', '"+observacao+"', '"+processo+"', '"+status+"')");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Alteração negada com sucesso!\");"
                    + "setTimeout(\"document.location = 'visualizarAlteracoes'\",1);"
                    + " </script></head>");
           
            
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
