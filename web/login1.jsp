<%-- 
    Document   : login
    Created on : 18/08/2015, 18:41:50
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <br>
    <center><img src="logoBOTANICA.jpg" width="1200" height="168" border="2"/></center>
        <form name="loginFORM" method="POST">
              <center>
                  <h3>Autenticação</h3>
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
            
            
            if( (usuario != null) && (senha != null) )
            {
                request.setAttribute("usuario", usuario);
                request.setAttribute("senha", senha);
                request.getRequestDispatcher("Login").forward(request, response);  
            }    
        
        %>
        
        
        
    </body>
</html>
