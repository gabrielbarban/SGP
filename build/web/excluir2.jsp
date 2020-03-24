

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>

<html>
  <head>
            <link rel="icon" type="image/png" href="favicon.jpg" />
		<title>SGP</title>
		<meta charset="Latin1" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
                
                <style>
                    #topo{
                 background-color: #F8F8F8;
                 border-style: solid;
                 border-color: #F8F8F8;
                 margin: auto;
                 width: 976px;
                    }


#tudo {
        width: 976px;
	background-color: #F8F8F8;
	margin: auto;
        height: 600px;
}
#tudo1 {
	width: 488px;
	height: 600px;
	background-color: #F8F8F8;
	float: left;
        margin-left: 30px;
}

#tudo4 {
	width: 488px;
	height: 600px;
	background-color: #F8F8F8;
	float: right;
}

#rodape{
        width: 976px;
        margin: auto; 
}
</style>
                </style>

	</head>
    
        <body background="mobile_r.jpg" bgproperties="fixed" background="transparent">
    <center><img src="banner.jpg" width="980" height="110"/></center>
    
            <div id="topo">
            <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
    
    
    
       <div id="tudo">
           
             <div id="tudo1">
            
            <br>
            <input type="submit" value="Incluir novo Projeto" onclick="location.href='cadastrar.jsp' ">
            <br>            
           <input type="submit" value="Atualizar Projeto" onclick="location.href='excluir.jsp' ">
           <br>
           <form name="pesquisa" method="POST" action="exclusao1" >
            Número: <input type="text" name="numero" value="" size="20" />  
            <input type="submit" value="Pesquisar" name="enviar" />
            <Br><br>
            <p>Nada encontrado.</p>
            </form>

            <br><Br><br>
            <input type="submit" value="Projetos Enviados" onclick="location.href='listarProjeto' ">
            <br>            
           <input type="submit" value="Pedidos de alteração enviados" onclick="location.href='visualizarAlteracoes' ">
        
        </div>
              
           
        <div id="tudo2">
            
            <br>
            
            <input type="submit" value="Atualizar cadastro" onclick="location.href='AtualizarUsuario' "><Br>       
            <input type="submit" value="Sair" onclick="location.href='index.html' ">
            
            <br><br><br>
            
             <input type="submit" value="Incluir novo usuário" onclick="location.href='novoUsuario.jsp' ">
              <br>
             <input type="submit" value="Exibir usuários" onclick="location.href='listarUsuario' ">

         
        
        </div>
        
        
      
        
        
       </div>
    
     <br><br>
         <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>               
    
    </body>
</html>
