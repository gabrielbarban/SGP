package controleAdmin;


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


public class excluirUsuario extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        out.println("<head><title>Exclusão de usuário</title></head>");
        
        
        String nome = request.getParameter("nome");
        int id1=0;
        
     
        
        
       
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select id from usuario where nome='"+nome+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next())
            {
                id1 = rs.getInt("id");
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      if(id1 != 0)
      {
        
         try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            //String sql = "update projeto set numero='"+numero1+"', titulo='"+titulo1+ "', responsavel='"+responsavel1+"', coResponsavel='"+coResponsavel1+"', contato='"+contato1+"', equipe='"+equipe1+"', processo='"processo1+"', linha='"+linha1+"', objetivosPrincipais='"+objetivosPrincipais1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"' where numero='"+numero1+"'";
            String sql = "delete from usuario where id="+id1;
            p = con.prepareStatement(sql);
            p.executeUpdate(sql);
            p.close();
            con.close();
            out.println("<br><br><br><center><h3><b>Usuário "+nome+" excluído em ");
            out.println(new SimpleDateFormat().format(new Date())+"</b></h3></center><br><br><br>");
           out.print("<head> <script type=\"text/javascript\"> alert(\"Usuário Excluído!\");"
                    + "setTimeout(\"document.location = 'listarUsuario'\",1);"
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
