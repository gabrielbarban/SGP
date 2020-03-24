
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


public class CronogramaDe extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
        String id = (String) request.getSession().getAttribute("idProjeto");
        
        String ano1mp = request.getParameter("ano1mp");
        String ano2mp = request.getParameter("ano2mp");
        String ano3mp = request.getParameter("ano3mp");
        String ano4mp = request.getParameter("ano4mp");
        String totalmp = request.getParameter("totalmp");
        
        String ano1mc = request.getParameter("ano1mc");
        String ano2mc = request.getParameter("ano2mc");
        String ano3mc = request.getParameter("ano3mc");
        String ano4mc = request.getParameter("ano4mc");
        String totalmc = request.getParameter("totalmc");
        
        String ano1sv = request.getParameter("ano1sv");
        String ano2sv = request.getParameter("ano2sv");
        String ano3sv = request.getParameter("ano3sv");
        String ano4sv = request.getParameter("ano4sv");
        String totalsv = request.getParameter("totalsv");
        
        String ano1d = request.getParameter("ano1d");
        String ano2d = request.getParameter("ano2d");
        String ano3d = request.getParameter("ano3d");
        String ano4d = request.getParameter("ano4d");
        String totald = request.getParameter("totald");
        
        String ano1t = request.getParameter("ano1t");
        String ano2t = request.getParameter("ano2t");
        String ano3t = request.getParameter("ano3t");
        String ano4t = request.getParameter("ano4t");
        String totalt = request.getParameter("totalt");
        
        
           
        
        String opcao = request.getParameter("grupo1");
        
        
               
        
        if(opcao.equals("Sim"))
        {
       
           
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            PreparedStatement p;
            Statement s = con.createStatement();
            
            
            //String sql = "insert into 'cadastro' (`usuario`, `senha`, `telefone`, `email`) values (?, ?, ?, ?)";
            p = con.prepareStatement("INSERT INTO cronogramad (id, ano1mp, ano2mp, ano3mp, ano4mp, totalmp, ano1mc, ano2mc, ano3mc, ano4mc, totalmc, ano1sv, ano2sv, ano3sv, ano4sv, totalsv, ano1d, ano2d, ano3d, ano4d, totald, ano1t, ano2t, ano3t ,ano4t, totalt) values ('"+id+"', '"+ano1mp+"', '"+ano2mp+"', '"+ano3mp+"', '"+ano4mp+"', '"+totalmp+"', '"+ano1mc+"', '"+ano2mc+"', '"+ano3mc+"', '"+ano4mc+"', '"+totalmc+"', '"+ano1sv+"', '"+ano2sv+"', '"+ano3sv+"', '"+ano4sv+"', '"+totalsv+"', '"+ano1d+"', '"+ano2d+"', '"+ano3d+"', '"+ano4d+"', '"+totald+"', '"+ano1t+"', '"+ano2t+"', '"+ano3t+"', '"+ano4t+"', '"+totalt+"');");
            p.executeUpdate();
            con.close();
            s.close();
            out.print("<head> <script type=\"text/javascript\"> alert(\"Cadastrado!\");"
                    + "setTimeout(\"document.location = 'cronogramae.jsp?'\",1);"
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
