<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<%@ page contentType="text/html" language="java" import="java.util.*"%> 
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/png" href="favicon.jpg" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SGP</title>
        
        
        
        <style>
            
            #topo{
                 margin: 0; 
                 padding: 0;
                 height: 34px;
                 width: 974px;
                 align-items: center;
                 background-color: #F8F8F8;
                 border-style: solid;
                 border-color: #F8F8F8;
                 margin:0 auto;
                 
            }

#tudo1 {
	position:relative;
	width: 500px;
        left: 24%;
        background-color: #F8F8F8;
	height: 614px;
	float: left;
}

#tudo2 {
        background-color: #F8F8F8;
	position: relative;
	width: 500px;
        right: 24%;
	height: 614px;	
	float: right;
}


#rodape{
        width: 974px;
        left: 24.5%;
        margin: 0; 
        padding: 0;
	position: absolute;
	bottom:0;
        height: 195.5px;
}


</style>
        
        
        
        
        
        
        
        
        
        
        
    </head>
      <body background="mobile_r.jpg" bgproperties="fixed" background="transparent">
        <body background="mobile_r.jpg" bgproperties="fixed">
    <center><img src="banner.jpg" width="980" height="110"/></center>
        
        <div id="topo">
            <center><font size="6">Sistema Gerenciador de Projetos</font></center>            
        </div>
        
   
    
    
    <font color="black">
    
    
    <br><br><br><br>
    
    
    <div id="tudo1">
        <ul>
        <li><input type="submit" value="Pesquisar pelo Número do Projeto" size="10" onclick="location.href='pesquisarNumero.jsp'"></li> </li><br>
        
        <li><input type="submit" value="Pesquisar pelo Número do Processo" onclick="location.href='pesquisarProcesso.jsp' "></li><BR>
        
        <li><input type="submit" value="Pesquisar pela Linha" onclick="location.href='pesquisarLinha.jsp' "></li><BR>
        
        <li><input type="submit" value="Pesquisar pelo Situação" onclick="location.href='pesquisarSituacao.jsp' "></li><BR>
        
        <li><input type="submit" value="Pesquisar pelo Responsável" onclick="location.href='pesquisarResponsavel.jsp' "></li><BR>
        </ul>
        
    </div>

     
       
    
    <div id="tudo2">
         <form name="loginFORM" method="POST" action="Login">
              <center>
                  <h3>Autenticação</h3>
            <table>
            <tr><td>USUÁRIO: </td><td><input type="text" name="usuario" value="" size="30" /></td></tr>
            <tr><td>SENHA: </td><td><input type="password" name="senha" value="" size="30" /></td></tr>
            <tr><td><input type="submit" value="Entrar" name="botao1" size="40"/></td><td><input type="reset" value="Limpar" name="botao2" size="40"/></td></tr>
            </table>
                  
              </center>
        </form>
        
        
    </div>
    

    
    <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>
    
    
    
    </font>
    </body>
</html>
