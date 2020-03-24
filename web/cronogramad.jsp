
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

#tudo2 {
	background-color: #F8F8F8;
        margin: auto;
        width: 976px;
          border-color: #F8F8F8;
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
             <center><h3>Cronograma de desembolso</h3></center><hr>
            
            
            Você precisa de cronograma para desembolso? <br>
            <form action="CronogramaDe">
            Sim<input type="radio" name="grupo1" value="Sim" />
            Não<input type="radio" name="grupo1" value="Não" checked="checked" />
            
            
            <Br><br>
            
            

            <table id="cronogramad">
                <tr>
                    <td>Item: </td>
                    <td>Ano 1: </td>
                    <td>Ano 2: </td>
                    <td>Ano 3: </td>
                    <td>Ano 4: </td>
                    <td>Total: </td>
                </tr>
                
                
                
                <tr>
                    <td><b>Material permanente: </b></td>
                    <td><input type="text" name="ano1mp" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano2mp" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano3mp" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano4mp" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="totalmp" value="" size="10" placeholder='R$'/></td>
                </tr>
                
                <tr>
                    <td><b>Material de Consumo: </b></td>
                    <td><input type="text" name="ano1mc" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano2mc" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano3mc" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano4mc" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="totalmc" value="" size="10" placeholder='R$'/></td>
                </tr>
                
                <tr>
                    <td><b>Serviços de Terceiros: </b></td>
                    <td><input type="text" name="ano1sv" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano2sv" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano3sv" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano4sv" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="totalsv" value="" size="10" placeholder='R$'/></td>
                </tr>
                
                <tr>
                    <td><b>Diárias/Transporte: </b></td>
                    <td><input type="text" name="ano1d" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano2d" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano3d" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano4d" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="totald" value="" size="10" placeholder='R$'/></td>
                </tr>
                
                <tr>
                    <td><b>Total Geral: </b></td>
                    <td><input type="text" name="ano1t" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano2t" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano3t" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="ano4t" value="" size="8" placeholder='R$'/></td>
                    <td><input type="text" name="totalt" value="" size="10" placeholder='R$'/></td>
                    <td><input type="submit" value="Avançar" name="botao" size="40"/></td>
                </tr>
                
            </table>
             
        </form>
        
            <br><br>
        </div>
        
        
        
        
        
        
    </div>
    
        
    <br><Br>
    
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
        
    </body>
</html>
