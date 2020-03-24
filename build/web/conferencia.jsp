
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	height: 900px;
	background-color: #F8F8F8;
	margin: auto;
}
#tudo1 {
        margin-left: 30px;
	width: 900px;
	height: 900px;
	background-color: #F8F8F8;
	float: left;
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
    
            <div id="topo">
            <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
    
    
    
       <div id="tudo">
        
        <div id="tudo1">
            <br>
            
            <center><h2>Finalização de envio de projeto</h2></center>
            <hr>
            <br>
            
            <ul>
                <li>Tabela do projeto <img src="certo.png" width="30" height="30"/></li>
                <br>
                <li><a href="terceiros.jsp" target="_blank">Serviços de terceiros</a><img src="certo.png" width="30" height="30"/>
                </li>
                <br>
                <li><a href="consumo.jsp" target="_blank">Material de consumo</a><img src="certo.png" width="30" height="30"/></li>
                <br>
                <li><a href="diarias.jsp" target="_blank">Diárias/Transportes</a><img src="certo.png" width="30" height="30"/></li>
                <br>
                <li><a href="permanente.jsp" target="_blank">Material permanente</a><img src="certo.png" width="30" height="30"/></li>
                <br>
                <li><a href="cronogramad.jsp" target="_blank">Cronograma de desembolso</a><img src="certo.png" width="30" height="30"/></li>
                <br>
                <li><a href="cronogramae.jsp" target="_blank">Cronograma de execução</a><img src="certo.png" width="30" height="30"/></li>                       
            </ul>
            
            
            <br><br><br>
            
            <center><input type="submit" value="Finalizar e enviar projeto" onclick="location.href='inicialComum.jsp' "></center>
            
             </div>
        
        
      
        
        
       </div>
    
     <br><br>
         <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>               
    
    </body>
</html>

   