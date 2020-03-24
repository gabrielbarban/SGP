<%-- 
    Document   : loginNOVO
    Created on : 30/08/2015, 19:35:59
    Author     : Gabriel
--%>

<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Área Exclusiva</title>
    </head>
    <body>
        <form name="loginFORM" method="POST">
              <center>
                  <h3>Área Exclusiva</h3>
            <table>
                <tr><td>USUÁRIO: </td><td><input type="text" name="usuario" value="" size="30" /></td></tr>
            <tr><td>SENHA: </td><td><input type="password" name="senha" value="" size="30" /></td></tr>
            <tr><td><input type="submit" value="Entrar" name="botao" size="40"/></td></tr>
            </table>
              </center>
        </form>
        
        
        
        
        
        <%
            
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");
            
            try{
            if(usuario.equals("informatica") && senha.equals("catarinacsr@"))
            {
                response.sendRedirect("novoUsuario.jsp");
            }    
            }catch
                (Exception e){
            System.out.println(e.toString());
            }
        %>
        
        
        
    </body>
</html>
