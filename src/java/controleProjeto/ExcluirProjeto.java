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


public class ExcluirProjeto extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
        out.println("<head><title>Exclusão de Projeto</title></head>");
        
       
        
        String numero = request.getParameter("numero");
        String numero1=null;
        
     
        
        
       
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select * from projeto where numero='"+numero+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next())
            {
                numero1 = rs.getString("numero");
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      if(numero1 != null)
      {
        
         try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            //String sql = "update projeto set numero='"+numero1+"', titulo='"+titulo1+ "', responsavel='"+responsavel1+"', coResponsavel='"+coResponsavel1+"', contato='"+contato1+"', equipe='"+equipe1+"', processo='"processo1+"', linha='"+linha1+"', objetivosPrincipais='"+objetivosPrincipais1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"' where numero='"+numero1+"'";
            String sql = "delete from projeto where numero='"+numero+"'";
            p = con.prepareStatement(sql);
            p.executeUpdate(sql);
            p.close();
            con.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Projeto "+numero+" excluído!\");"
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
      }
      
      else
          out.print("<head> <script type=\"text/javascript\"> alert(\"Projeto não encontrado!\");"
                    + "setTimeout(\"document.location = 'excluirProjeto.jsp'\",1);"
                    + " </script> </head>");
         
             
    
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
