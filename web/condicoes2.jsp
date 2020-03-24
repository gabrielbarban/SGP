
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
             <center><h1>TERMOS E CONDIÇÕES</h1></center>
             <hr>
             <br>
             <br>
             <br>
             <br>
             <br>
             <br>
             <br>
             <br>
             <br>
             <br>
             <br>
             <center><input type="submit" value="Concordo" onclick="location.href='cadastrar.jsp' "> <input type="submit" value="Não concordo" onclick="location.href='inicialAuxiliar.jsp' "></center>
        <br><br>
        
        <input type="submit" value="Voltar" onclick="location.href='inicialAuxiliar.jsp' ">
        
       
        <br><Br>
        
    
        
     </div></div>
    
    <br><Br>
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
    
   
    </body>
</html>
    
    </body>
</html>
