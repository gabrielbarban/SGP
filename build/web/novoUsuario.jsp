<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	height: 650px;
	background-color: #F8F8F8;
	margin: auto;
}
#tudo1 {
	width: 900px;
	height: 650px;
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
    
         
       <div id="tudo">
           <div id="tudo1">
        <form name="loginFORM" method="POST" action="novoUsuario.jsp">
                  <Br>
                  <h2>novo usuário:</h2>
                  <hr>
            <table>
                <tr><td>Nome: </td><td><input type="text" name="nome" value="" size="30" /></td></tr>
                <tr><td>Usuário: </td><td><input type="text" name="username" value="" size="30" /></td></tr>
            <tr><td>Senha: </td><td><input type="password" name="password" value="" size="30" /></td></tr>
            <tr><td>Senha<br>Novamente: </td><td><input type="password" name="password2" value="" size="30" /></td></tr>
                        <tr><td>Tipo de usuário:</td><td><select name="tipo">
                        <option>Selecione um tipo...</option>
                        <option>Comum</option>
                        <option>Auxiliar</option>
                        <option>Administrador</option>
                    </select></td></tr>
            <tr><td><input type="submit" value="Cadastrar" name="botao" size="40"/></td></tr>
            <tr><td><input type="reset" value="Limpar" name="botao" size="40"/></td></tr>
            </table>
             
        </form>
        
        
        <br><Br><br>
        <input type="submit" value="Voltar" onclick="location.href='inicial.jsp'">
        <br>
        
        
        <%
            
            try{

           String username = request.getParameter("username");
           String password = request.getParameter("password");
           String password2 = request.getParameter("password2");
           String nome = request.getParameter("nome");
           String tipo = request.getParameter("tipo");
           
           
       
            
        if(request.getParameter("tipo").equals("Selecione um tipo...") == true || (password.equals(password2) == false)) { %>                
                <script type="text/javascript"> 
                    alert("Tipo não foi selecionado e/ou senhas não conferem!");
                    setTimeout("document.location = 'novoUsuario.jsp'",1);
                </script> <% 
            }
        
        
        
         else {
           request.setAttribute("username", request.getParameter("username"));
           request.setAttribute("password", request.getParameter("password"));
           request.setAttribute("nome", request.getParameter("nome"));
           request.setAttribute("tipo", request.getParameter("tipo"));
           request.getRequestDispatcher("novoUsuario").forward(request, response);  
         } 
           
           
            }
            catch(NullPointerException e){
                
          
            }
           
           
        %>
        
        
        
     
           </div>  </div>
    
     <br><br>
         <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>               
    
    </body>
</html>
