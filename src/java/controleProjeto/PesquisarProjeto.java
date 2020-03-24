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


public class PesquisarProjeto extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
        String id = request.getParameter("id");
        
        
        
        
         try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select * from projeto2 where id="+id;
            
            ResultSet rs = s.executeQuery(sql);
            
            
            if(rs.next())
            {
                request.getSession().setAttribute("titulo", rs.getString("titulo"));
                request.getSession().setAttribute("coResponsavel", rs.getString("coResponsavel"));
                request.getSession().setAttribute("telefone", rs.getString("telefone"));
                request.getSession().setAttribute("email", rs.getString("email"));
                request.getSession().setAttribute("equipe", rs.getString("equipe"));
                request.getSession().setAttribute("linha", rs.getString("linha"));
                request.getSession().setAttribute("id", rs.getString("id"));
                request.getSession().setAttribute("objetivosPrincipais", rs.getString("objetivosPrincipais"));
                request.getSession().setAttribute("resumo", rs.getString("resumo"));
                request.getSession().setAttribute("metas", rs.getString("metas"));
                request.getSession().setAttribute("dataInicio", rs.getString("dataInicio"));
                request.getSession().setAttribute("dataFim", rs.getString("dataFim"));
                request.getSession().setAttribute("situacao", rs.getString("situacao"));
                request.getSession().setAttribute("centro", rs.getString("centro"));
                request.getSession().setAttribute("nucleo", rs.getString("nucleo"));
                request.getSession().setAttribute("obs", rs.getString("obs"));
                request.getSession().setAttribute("data", rs.getString("data"));
                request.getSession().setAttribute("financiamentoExterno", rs.getString("financiamentoExterno"));
                request.getSession().setAttribute("usuarioComum", rs.getString("usuarioComum"));
                request.getSession().setAttribute("custoGlobal", rs.getString("custoGlobal"));
                request.getSession().setAttribute("abrangencia", rs.getString("abrangencia"));
                request.getSession().setAttribute("relevancia", rs.getString("relevancia"));
                rs.close();
                s.close();
                con.close(); 
                response.sendRedirect("pesquisarProjeto3.jsp");
            }
            
            
            else
                response.sendRedirect("pesquisarProjeto2.jsp");
            
             
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
