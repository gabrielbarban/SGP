import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Diarias extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
       
          String opcao = request.getParameter("grupo1");
        
        
        if(opcao.equals("Sim"))
        {
        
        String id = (String) request.getSession().getAttribute("idProjeto");

        String[] item;
        String[] localidade;
        String[] tipo;
        String[] periodo;
        String[] diariasApoio;
        String[] diariasPqc;
        String[] valorTotal;
        String[] fonte;
        
               
        
        item = request.getParameterValues("item");
        localidade = request.getParameterValues("localidade");
        tipo = request.getParameterValues("tipo");
        periodo = request.getParameterValues("periodo");
        diariasApoio = request.getParameterValues("diariasApoio");
        diariasPqc = request.getParameterValues("diariasPqc");
        valorTotal = request.getParameterValues("valorTotal");
        fonte = request.getParameterValues("fonte");
        
        
        
        
        
        for(int i=0 ; i<item.length ; i++)
        {
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
            
            //String sql = "insert into 'cadastro' (`usuario`, `senha`, `telefone`, `email`) values (?, ?, ?, ?)";
            p = con.prepareStatement("INSERT INTO diarias (id, item, localidade, tipo, periodo, diariasApoio, diariasPqc, valorTotal, fonte) values ('"+id+"', '"+item[i]+"', '"+localidade[i]+"', '"+tipo[i]+"', '"+periodo[i]+"', '"+diariasApoio[i]+"', '"+diariasPqc[i]+"', '"+valorTotal[i]+"', '"+fonte[i]+"');");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Cadastrado!\");"
                    + "setTimeout(\"document.location = 'permanente.jsp?id="+id+"'\",1);"
                    + " </script> </head>");
            
            
            
            
        } 
            
            
     
       
        catch(ClassNotFoundException e){
            System.out.println("erro1");
        }
        
        catch(SQLException e){
            System.out.println("erro2");
        }
        
        catch(Exception e){
            System.out.println("erro3");
        }
            
        
        
        }
 
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        else 
    {
        String[] localidade;
        localidade = request.getParameterValues("localidade");
        
               if(localidade[0].equals("") == false)
                   out.print("<head> <script type=\"text/javascript\"> alert(\"Você preencheu itens mas não colocou 'Sim', faça novamente!\");"
                    + "setTimeout(\"document.location = 'diarias.jsp'\",1);"
                    + " </script> </head>");
               
               else
                   response.sendRedirect("permanente.jsp");
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
