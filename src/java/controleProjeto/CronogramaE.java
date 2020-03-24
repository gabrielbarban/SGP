
package controleProjeto;

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


public class CronogramaE extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
        
        
        String id = (String) request.getSession().getAttribute("idProjeto");
        
        String anoMes = request.getParameter("anoMes");
        
        String prev1 = request.getParameter("prev1");
        String exec1 = request.getParameter("exec1");
        
        String prev2 = request.getParameter("prev2");
        String exec2 = request.getParameter("exec2");
        
        String prev3 = request.getParameter("prev3");
        String exec3 = request.getParameter("exec3");
        
        String prev4 = request.getParameter("prev4");
        String exec4 = request.getParameter("exec4");
        
        String prev5 = request.getParameter("prev5");        
        String exec5 = request.getParameter("exec5");
        
        String prev6 = request.getParameter("prev6");
        String exec6 = request.getParameter("exec6");
        
        String prev7 = request.getParameter("prev7");
        String exec7 = request.getParameter("exec7");
        
        String prev8 = request.getParameter("prev8");
        String exec8 = request.getParameter("exec8");
        
        String prev9 = request.getParameter("prev9");
        String exec9 = request.getParameter("exec9");;
        
        String prev10 = request.getParameter("prev10");
        String exec10 = request.getParameter("exec10");
        
        String prev11 = request.getParameter("prev11");
        String exec11 = request.getParameter("exec11");
        
        String prev12 = request.getParameter("prev12");
        String exec12 = request.getParameter("exec12");
        
        String totalExecAno = request.getParameter("totalExecAno");
        String totalExecProjeto = request.getParameter("totalExecProjeto");
        
        
           
        
        String opcao = request.getParameter("grupo1");
        
        
               
        
        if(opcao.equals("Sim"))
        {
       
           
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
            
            //String sql = "insert into 'cadastro' (`usuario`, `senha`, `telefone`, `email`) values (?, ?, ?, ?)";
            p = con.prepareStatement("INSERT INTO cronogramae (id,anoMes,prev1,exec1,prev2,exec2,prev3,exec3,prev4,exec4,prev5,exec5,prev6,exec6,prev7,exec7,prev8,exec8,prev9,exec9,prev10,exec10,prev11,exec11,prev12,exec12,totalExecAno,totalExecProjeto) values ('"+id+"', '"+anoMes+"', '"+prev1+"', '"+exec1+"', '"+prev2+"', '"+exec2+"', '"+prev3+"', '"+exec3+"', '"+prev4+"', '"+exec4+"', '"+prev5+"', '"+exec5+"', '"+prev6+"', '"+exec6+"', '"+prev7+"', '"+exec7+"', '"+prev8+"', '"+exec8+"', '"+prev9+"', '"+exec9+"', '"+prev10+"', '"+exec10+"', '"+prev11+"', '"+exec11+"', '"+prev12+"', '"+exec12+"', '"+totalExecAno+"', '"+totalExecProjeto+"');");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Cadastrado!\");"
                    + "setTimeout(\"document.location = 'conferencia.jsp?'\",1);"
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
        
        
        
        
        
        
    
        
        
            else 
    {
        String totalmp1;
        totalmp1 = request.getParameter("totalmp");
        
               if(totalmp1.equals("") == false)
                   out.print("<head> <script type=\"text/javascript\"> alert(\"Você preencheu itens mas não colocou 'Sim', faça novamente!\");"
                    + "setTimeout(\"document.location = 'cronogramad.jsp'\",1);"
                    + " </script> </head>");
               
               else
                   response.sendRedirect("cronogramae.jsp");
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
