
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <title>Acesso Restrito</title>

    </head>
    <body>
        
    <center><h1>Acesso Restrito</h1><img src="download.jpg" width="200" height="150" border="2"/></center>
   
    
    <br><bR>
    
    <ul>
        <li><input type="submit" value="Incluir novo usu�rio" onclick="location.href='novoUsuario.jsp' "></li> </li><br>
                
        <li><input type="submit" value="Excluir usu�rio" onclick="location.href='excluirUsuario.jsp' "></li><BR>
        <form name="pesquisa" method="POST" action="excluirUsuario" >
            ID: <input type="text" name="id" value="" size="40" />  
            <input type="submit" value="Ok" name="enviar" />
        </form>
            <br>
<li><input type="submit" value="Pesquisar Usu�rio" onclick="location.href='pesquisarUsuario.jsp' "></li><BR>

        <li><input type="submit" value="Exibir usu�rios ADM" onclick="location.href='listarUsuario' "></li><BR>
       
        <li><input type="submit" value="Exibir usu�rios Comuns" onclick="location.href='listarUsuario2' "></li><BR>
        
        <br><br><br>
        
        
         <li><input type="submit" value="Sair" onclick="location.href='index.jsp' "></li>
        
        </ul>
    
    
    
    </body>
</html>
