
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acesso Restrito</title>

    </head>
    <body>
        
    <center><h1>Acesso Restrito</h1><img src="download.jpg" width="200" height="150" border="2"/></center>

    
    <br><bR>
    
    <ul>
        <li><input type="submit" value="Incluir novo usuário" onclick="location.href='novoUsuario.jsp' "></li> </li><br>
                
        <li><input type="submit" value="Excluir usuário" onclick="location.href='excluirUsuario.jsp' "></li><BR>
        
        <li><input type="submit" value="Pesquisar Usuário" onclick="location.href='pesquisarUsuario.jsp' "></li><BR>
        <form action="PesquisarUsuario" method="POST">
            ID: <input type="text" name="id" value="" /><input type="submit" value="Ok" />
        </form>
        <br>
        
        <li><input type="submit" value="Exibir usuários ADM " onclick="location.href='listarUsuario' "></li><BR>
       
        <li><input type="submit" value="Exibir usuários Comuns" onclick="location.href='listarUsuario2' "></li><BR>
        
        <br><br><br>
        
        
         <li><input type="submit" value="Sair" onclick="location.href='index.jsp' "></li>
        
        </ul>
    
    
    
    </body>
</html>
