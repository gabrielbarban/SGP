package controleUsuario;

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


public class Login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("usuario");
        String password = request.getParameter("senha");

        
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select * from usuario where username='"+username+"' and password='"+password+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
            {
                request.getSession().setAttribute("id", rs.getString("id"));
                request.getSession().setAttribute("nome", rs.getString("nome"));
                request.getSession().setAttribute("tipo", rs.getString("tipo"));
                
                
                if(rs.getString("tipo").equals("Administrador"))
                    response.sendRedirect("inicial.jsp");
                                
                if(rs.getString("tipo").equals("Comum"))
                    response.sendRedirect("inicialComum.jsp");
                
                if(rs.getString("tipo").equals("Auxiliar"))
                    response.sendRedirect("inicialAuxiliar.jsp");
            }
            
            
            else
                response.sendRedirect("index2.html");
            
            
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
