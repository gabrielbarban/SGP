
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/png" href="favicon.jpg" />
        
          <style>

#tudo1 {
	position:relative;
	width: 500px;
	height: 500px;
	background-color: white;
	float: left;
}

#tudo2 {
	position: relative;
	width: 500px;
	height: 500px;
	background-color: white;
	float: right;
}


</style>
        
        
        
        
        
        
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
    </head>
    <body>
        <br>
    <center><img src="logoBOTANICA.jpg" width="1200" height="168" border="2"/></center>
        <font family="verdana">
        
        <%
            out.println("<br><center>São Paulo, ");
            out.println(new SimpleDateFormat().format(new Date()));
            out.println("<br><br><br><br><br>Olá "+(String) request.getSession().getAttribute("nome")+", o que você deseja fazer?</center><BR><Br><BR>");
            
        %>
        
        <div id="tudo1">
        <ul>
            <li><input type="submit" value="Incluir novo Projeto" onclick="location.href='cadastrar.jsp' "></li>
            <br>            
            <li><input type="submit" value="Atualizar Projeto" onclick="location.href='excluir.jsp' "></li>
            <br>
            <li><input type="submit" value="Excluir Projeto" onclick="location.href='excluirProjeto.jsp' "></li>
            <br>
            <form action="ExcluirProjeto">
                Número: <input type="text" name="numero" value="" /><input type="submit" value="Ok" />
            </form>
            <br><br>
            <li><input type="submit" value="Ver projetos enviados" onclick="location.href='listarProjeto' "></li>
            <br>
            <li><input type="submit" value="Pesquisar projeto enviado" onclick="location.href='pesquisarProjeto.jsp' "></li>
             <br>
            <li><input type="submit" value="Excluir algum projeto enviado" onclick="location.href='excluirProjeto2.jsp' "></li>
        </ul>
        </div>
        
        
        <div id="tudo2">
            <ul>
            <li><input type="submit" value="Atualizar cadastro" onclick="location.href='AtualizarUsuario' "></li>
            <br>            
            <li><input type="submit" value="Sair" onclick="location.href='index.jsp' "></li>
        </ul>
        </div>
        
        
        </font>
    </body>
</html>
