
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
	width: 900px;
	height: 600px;
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
    
            <div id="topo">
            <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
    
            
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
        
 
        <div id="tudo">
            <div id="tudo1">
            <br>
        <h1>Atualização de Usuário:</h1>
        <hr>
        <br>
       <form method="post">
            <table>
                <tr><td>Usuário:</td><td><input type="text" name="username" value=<%=username%> readonly="readonly" /></td></tr>
                <tr><td>Senha:</td><td><input type="password" name="password" value=<%=password%> /></td></tr>
                <tr><td>Senha Novamente:</td><td><input type="password" name="password2" value=<%=password%> /></td></tr>
                <tr><td>Nome:</td><td><input type="text" name="nome" value=<%=nome%> readonly="readonly" /></td></tr>
            </table>
            <br><Br>
            <input type="submit" value="Atualizar" />
            </form>
        
        
        <%
        try{
                
    if(request.getParameter("password").equals(request.getParameter("password2")) == false) { %>                
                <script type="text/javascript"> 
                    alert("Senhas não conferem!!!");
                    setTimeout("document.location = 'atualizarUsuario.jsp'",1);
                </script> <% 
            }
    
    
    else {
           request.setAttribute("username", request.getParameter("username"));
           request.setAttribute("password", request.getParameter("password"));
           request.setAttribute("nome", request.getParameter("nome"));          
           request.getRequestDispatcher("AtualizarUsuario2").forward(request, response);  
         } 
            
           }
            catch(NullPointerException e){
                
            }
            
            
            
        %>
       

        <Br><br>
        
        <input type="submit" value="Voltar" onclick="location.href='inicial.jsp'">
        
        
            </div></div>
        <br><br>
             <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/></center></div>
   
        
       
        
        
        
    </body>
</html>
