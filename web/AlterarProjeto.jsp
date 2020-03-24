
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
}
#tudo1 {
	   width: 900px;
	background-color: #F8F8F8;
	margin: auto;
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
     
        <%
            String username=null;
            String password=null;
            String password2=null;
            String nome=null;
            
         try{
            username = (String) request.getSession().getAttribute("username");
            password = (String) request.getSession().getAttribute("password");
            password2 = (String) request.getSession().getAttribute("password");
            nome = (String) request.getSession().getAttribute("nome");
            
         }
            catch(NullPointerException e){
                
            }
            
        %>
      
        <div id="topo">
            <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
     
        
       <div id="tudo">
           
           <div id="tudo1">
            <br>
            
            <%
                String processo = request.getParameter("processo");
            %>
            
            <h2>Solicitar alterações para o Processo <%=processo%>:</h2>
            <form action="AlterarProjeto?processo=<%=processo%>" method="POST">
            Alterações: <br><textarea name="alteracoes" rows="12" cols="75"></textarea>
            <br>
            <input type="submit" name="botao1" value="Solicitar alterações" size="30" />
            </form>
            
            <br><br>
            <input type="submit" value="Voltar" onclick="location.href='visualizaUsuario?processo=<%=processo%>'">
            <br><Br>
          
</div>
        </div>
    <br><Br>
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
    
   
    </body>
</html>