<%-- 
    Document   : teste
    Created on : 12/11/2015, 16:06:17
    Author     : Suporte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <script>
function redireciona1()
{
document.usuario.action="bolacha1.jsp";
document.usuario.submit();
}




function redireciona2()
{
document.usuario.action="bolacha2.jsp";
document.usuario.submit();
}

</script>


    </head>
    <body>
        <h1>Hello World!</h1>
       
        
        
        <form name="usuario">
            ID: <input type="text" name="id" value="" />
            NOME: <input type="text" name="Nome:" value="" />
            <input type="button" value="Acao1" onclick="redireciona1();">
            <input type="button" value="Acao2" onclick="redireciona2();">
            <input type="submit" value="Atualizar" name="botao" />
        </form>
    </body>
</html>
