
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AtualizarStatus extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        
                 
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            
            
            String sql = "SELECT numero, dataFim FROM projeto WHERE situacao = 'Ativo'";
            
            ResultSet rs = s.executeQuery(sql); 
            
            
            
            CalculoDias calc = new CalculoDias();
       
                        
            
            String inicioMes= null;
            String inicioAno= null;
            char[] caractere;
            String a= null;
            String b= null;
            String c= null;
            String d= null;
            String mes = null;
            int mesNumero = 0;
            String ano = null;
            int anoNumero = 0;
            int mesAtual = 0;
            int anoAtual = 0;
            String numero = null;
            
            while(rs.next())
            {
                numero = rs.getString("numero");
                               
               inicioMes = rs.getString("dataFim");
               caractere = inicioMes.toCharArray();
               a = String.valueOf(caractere[0]);
               b = String.valueOf(caractere[1]);
               mes = a+b;
                mesNumero = Integer.valueOf(mes);
                mesAtual = calc.calculoMes();
                
                
               inicioAno = rs.getString("dataFim");
               caractere = inicioAno.toCharArray();
               c = String.valueOf(caractere[5]);
               d = String.valueOf(caractere[6]);
               ano = c+d;
                anoNumero = Integer.valueOf(ano);
                anoAtual = calc.calculoAno(); 
                
                
                if( (mesNumero<mesAtual &&  anoNumero<anoAtual) || (mesNumero<mesAtual &&  anoNumero==anoAtual))
                {
                    
                    try{
           
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con1 = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
                    PreparedStatement p1;
                    Statement s1 = con1.createStatement();
                    //String sql = "update projeto set numero='"+numero1+"', titulo='"+titulo1+ "', responsavel='"+responsavel1+"', coResponsavel='"+coResponsavel1+"', contato='"+contato1+"', equipe='"+equipe1+"', processo='"processo1+"', linha='"+linha1+"', objetivosPrincipais='"+objetivosPrincipais1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"', responsavel1='"+responsavel1+"' where numero='"+numero1+"'";
                    String sql1 = "update projeto set situacao='Vencido' where numero='"+numero+"'";
                    p1 = con1.prepareStatement(sql1);
                    p1.executeUpdate(sql1);
                    p1.close();
                    con1.close();
                    out.print("<head> <script type=\"text/javascript\"> alert(\"Projetos atualizados!\");"
                    + "setTimeout(\"document.location = 'inicial.jsp'\",1);"
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
            
            if(rs.next() == false)
                response.sendRedirect("inicial.jsp");
            
           
            
            
            }
        
        catch(ClassNotFoundException e){
            System.out.println(e.toString());
             response.sendRedirect("inicial.jsp");
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
        }
        
        catch(Exception e){
            System.out.println(e.toString());
             response.sendRedirect("inicial.jsp");
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
