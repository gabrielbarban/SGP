<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html>
     <head>
            <link rel="icon" type="image/png" href="favicon.jpg" />
		<title>SGP</title>
		<meta charset="utf-8" />
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
	height: 600px;
	background-color: #F8F8F8;
	margin: auto;
}
#tudo1 {
	width: 700px;
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
            <br>
            <br>
            <input type="submit" value="Ver projetos enviados" onclick="location.href='listarProjeto' ">
            <br>
            <input type="submit" value="Pesquisar projeto enviado" onclick="location.href='pesquisarProjeto.jsp' ">
             <Br>
            <form action="PesquisarProjeto">
                Processo: <input type="text" name="processo" value="" /><input type="submit" value="Ok" height="1"/>
            </form>
            <br>
            <input type="submit" value="Excluir algum projeto enviado" onclick="location.href='excluirProjeto2.jsp' ">
        </div>
        
        
         <div id="tudo2">
            <br>
            
            <input type="submit" value="Atualizar cadastro" onclick="location.href='AtualizarUsuario' "><Br>       
            <input type="submit" value="Sair" onclick="location.href='index.html' ">
            
              <br><br><br>
            
             <input type="submit" value="Incluir novo usuário" onclick="location.href='novoUsuario.jsp' ">
              <br>  
             <input type="submit" value="Excluir usuário" onclick="location.href='excluirUsuario.jsp' ">
              <br> 
             <input type="submit" value="Pesquisar Usuário" onclick="location.href='pesquisarUsuario.jsp' ">
              <br>
             <input type="submit" value="Exibir usuários ADM " onclick="location.href='listarUsuario' ">
              <br>
              <input type="submit" value="Exibir usuários Comuns" onclick="location.href='listarUsuario2' ">

        </div>
        
        
      
        
        
       </div>
    
     <br><br>
         <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>               
    
    </body>
</html>
