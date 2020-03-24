
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Conexao extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        
        
        
         Connection conexao;  
    
    
      
    String url= "jdbc:Mysql://localhost:3307/botanica2";
        String usuario="gabrielbarban";
        String senha="gabriel1995";
        try {
            //carregar o driver de conexão
            Class.forName("com.mysql.jdbc.Driver");
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);            
            response.sendRedirect("Conexao.jsp");
        }
        catch(ClassNotFoundException e)
        {
            out.println("Problemas ao carregar o driver de conexão");
        }
        catch(SQLException e)
        {
            out.println("Problemas ao estabelecer conexão com o banco");
        }
        
        
        
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Conexao</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form name=\"pesquisa\" method=\"POST\">\n" +
"            <input type=\"submit\" value=\"TESTAR CONEXAO\" name=\"botao\" />\n" +
"        </form>");
            out.println("</body>");
            out.println("</html>");
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
