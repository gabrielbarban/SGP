package controleProjeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author rm70347
 */
public class pesquisarResponsavel extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=Latin1");
        PrintWriter out = response.getWriter();
        
        out.println("<head><title>Responsável</title></head>");
        
        out.println("<body>");
        
             try {
            
            
            
            
       String numero = request.getParameter("numero");
       String titulo = request.getParameter("titulo");
       String responsavel = request.getParameter("responsavel");
       String coResponsavel = request.getParameter("coResponsavel");
       String contato = request.getParameter("contato");
       String equipe = request.getParameter("equipe");
       String processo = request.getParameter("processo");
       String linha = request.getParameter("linha");
       String objetivosPrincipais = request.getParameter("objetivosPrincipais");
       String resumo = request.getParameter("resumo");
       String metasAno1 = request.getParameter("metasAno1");
       String metasAno2 = request.getParameter("metasAno2");
       String metasAno3 = request.getParameter("metasAno3");
       String metasAno4 = request.getParameter("metasAno4");
       String inicio = request.getParameter("inicio");
       String previsaoFim = request.getParameter("previsaoFim");
       String situacao = request.getParameter("situacao");
       String centro = request.getParameter("centro");
       String nucleo = request.getParameter("nucleo");
       String prazo = request.getParameter("prazo");
       String obs = request.getParameter("obs");
       
       
       

            
            
            
       
       
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/botanica", "root", "botanica");
            Statement s = con.createStatement();
            String sql = "Select numero, titulo, responsavel, coResponsavel, contato, equipe, processo, linha, objetivosPrincipais, resumo, metasAno1, metasAno2, metasAno3, metasAno4, inicio, previsaoFim, situacao, centro, nucleo, prazo, obs from projeto where responsavel='"+responsavel+"'";
            
            ResultSet rs = s.executeQuery(sql);
            
            int contador=1;
            while(rs.next())
            { 
                out.println("<body><table border=\"1\"><tr><td><b>Número: </b></td><td>"+rs.getString("numero")+"</td></tr>");
        out.println("<tr><td><b>Titulo: </b></td><td>"+rs.getString("titulo")+"</td></tr>");
        out.println("<tr><td><b>Responsável: </b></td><td>"+rs.getString("responsavel")+"</td></tr>");
        out.println("<tr><td><b>Co-Responsável: </b></td><td>"+rs.getString("coResponsavel")+"</td></tr>");
        out.println("<tr><td><b>Contato: </b></td><td>"+rs.getString("contato")+"</td></tr>");
        out.println("<tr><td><b>Equipe: </b></td><td>"+rs.getString("equipe")+"</td></tr>");
        out.println("<tr><td><b>Processo: </b></td><td>"+rs.getString("processo")+"</td></tr>");
        out.println("<tr><td><b>Linha: </b></td><td>"+rs.getString("linha")+"</td></tr>");
        out.println("<tr><td><b>Objetivos principais: </b></td><td>"+rs.getString("objetivosPrincipais")+"</td></tr>");
        out.println("<tr><td><b>Resumo: </b></td><td>"+rs.getString("resumo")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 1: </b></td><td>"+rs.getString("metasAno1")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 2: </b></td><td>"+rs.getString("metasAno2")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 3: </b></td><td>"+rs.getString("metasAno3")+"</td></tr>");
        out.println("<tr><td><b>Metas Ano 4: </b></td><td>"+rs.getString("metasAno4")+"</td></tr>");
        out.println("<tr><td><b>Início: </b></td><td>"+rs.getString("inicio")+"</td></tr>");
        out.println("<tr><td><b>Previsão Fim: </b></td><td>"+rs.getString("previsaoFim")+"</td></tr>");
        out.println("<tr><td><b>Situação: </b></td><td>"+rs.getString("situacao")+"</td></tr>");
        out.println("<tr><td><b>Centro: </b></td><td>"+rs.getString("centro")+"</td></tr>");
        out.println("<tr><td><b>Núcleo: </b></td><td>"+rs.getString("nucleo")+"</td></tr>");
        out.println("<tr><td><b>Prazo: </b></td><td>"+rs.getString("prazo")+"</td></tr>");
        out.println("<tr><td><b>Observação: </b></td><td>"+rs.getString("obs")+"</td></tr></table>");
                out.println("<br><br>------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------"
                        + "--------------------------<br><Br><Br>");
                contador++;
            }
            out.println("Numero de registros encontrados: "+(contador-1));
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
  
        
            
     
        out.println("<BR><BR><BR><BR><input type=\"submit\" value=\"Voltar\" onclick=\"location.href='pesquisarResponsavel.jsp' \">");
            
            
            
            
            
            
           
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
