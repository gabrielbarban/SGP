
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
}
#tudo1 {
	width: 900px;
	background-color: #F8F8F8;
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
     <br>
    
    
            <div id="topo">
             <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
        
        
     <div id="tudo">
         <div id="tudo1">
            <br>
            <center><h3>Novo Projeto</h3></center><hr>
            <br>
            
            <form method="post" action="Cadastrar" name="cadastro">
                
            <table>  
                <tr><td><b>Pesquisador(a) <br>Responsável: </b></td><td><input type="text" name="usuarioComum" value="" placeholder="Nome" size="40"/><input type="submit" name="botao1" value="Pesquisar" size="20" /></td></tr>
            </table>
        </form>
        <br><br>
        
        <a href="javascript:window.history.go(-1)">Voltar</a>
        
       
        <br><Br>
        
    
        
     </div></div>
    
    <br><Br>
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
    
   
    </body>
</html>