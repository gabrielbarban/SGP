<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
            String id = (String) request.getAttribute("id");
            String username = (String) request.getAttribute("username");
            String password = (String) request.getAttribute("password");
            String nome = (String) request.getAttribute("nome");
            String tipo = (String) request.getAttribute("tipo");
                       
        %>
        
        <div id="tudo">
            <div id="tudo1">
            <br>
            <h3>Atualização de usuário</h3>
            <hr>
        <form method="get "action="PesquisarUsuario2">
        <table>
            <tr><td>ID: </td><td><input type="text" name="id" value=<%=id%> size="30" readonly="readonly"/></td></tr>    
            <tr><td>Usuário: </td><td><input type="text" name="username" value=<%=username%> size="30" readonly="readonly"/></td></tr>
                <tr><td>Nome: </td><td><input type="text" name="nome" value=<%=nome%> size="30" readonly="readonly" /></td></tr>
            <tr><td>Senha: </td><td><input type="password" name="password" value=<%=password%> size="30" /></td></tr>
            <tr><td>Confirmação de senha: </td><td><input type="password" name="password2" value=<%=password%> size="30" /></td></tr>
                        <tr><td>Tipo de usuário:</td><td><select name="tipo">
                        <option><%=tipo%></option>
                        <option>Comum</option>
                        <option>Administrador</option>
                    </select></td></tr>
            <tr><td><input type="submit" value="Atualizar" name="botao" size="40"/></td></tr>
            </table>
        </form>
                        
                        <br><br><br>
                        
                        <input type="submit" value="Voltar" onclick="location.href='listarUsuario' ">
                        
                        
         
         <%               
        try{
         if(request.getParameter("password").equals(request.getParameter("password2")))
         {
             request.setAttribute("id", id);
             request.setAttribute("username", request.getParameter("username"));
           request.setAttribute("password", request.getParameter("password"));
           request.setAttribute("nome", request.getParameter("nome"));
           request.setAttribute("tipo", request.getParameter("tipo"));
           request.getRequestDispatcher("PesquisarUsuario2").forward(request, response);
         }
         
         
         
         else{
             %><script type="text/javascript"> 
                     alert("Senhas não conferem!");
                     setTimeout("document.location = 'inicial3.jsp'",1);
                   </script><% }
         
        }
        catch(NullPointerException e){
            
        }
           
                   
                  
                        
                        
         %>             
           
       </div></div>
    
     <br><br>
         <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>               
    
    </body>
</html>
