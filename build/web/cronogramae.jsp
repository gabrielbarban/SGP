
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
                
        
        
          <script language="javascript">
            
             function inserirLinhaTabela() 
             {

           
            var table = document.getElementById("cronogramae");
            var numOfRows = table.rows.length;
            var numOfCols = table.rows[numOfRows-1].cells.length;

            
            var newRow = table.insertRow(numOfRows);
 
            
            
                newCell = newRow.insertCell(0);
                newCell.innerHTML = "<td><input type='text' name='anoMes' value='' size='7' /></td>";
                
                newCell = newRow.insertCell(1);
                newCell.innerHTML = "<td><input type='text' name='prev1' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(2);
                newCell.innerHTML = "<td><input type='text' name='exec1' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(3);
                newCell.innerHTML = "<td><input type='text' name='prev2' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(4);
                newCell.innerHTML = "<td><input type='text' name='exec2' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(5);
                newCell.innerHTML = "<td><input type='text' name='prev3' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(6);
                newCell.innerHTML = "<td><input type='text' name='exec3' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(7);
                newCell.innerHTML = "<td><input type='text' name='prev4' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(8);
                newCell.innerHTML = "<td><input type='text' name='exec4' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(9);
                newCell.innerHTML = "<td><input type='text' name='prev5' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(10);
                newCell.innerHTML = "<td><input type='text' name='exec5' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(11);
                newCell.innerHTML = "<td><input type='text' name='prev6' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(12);
                newCell.innerHTML = "<td><input type='text' name='exec6' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(13);
                newCell.innerHTML = "<td><input type='text' name='prev7' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(14);
                newCell.innerHTML = "<td><input type='text' name='exec7' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(15);
                newCell.innerHTML = "<td><input type='text' name='prev8' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(16);
                newCell.innerHTML = "<td><input type='text' name='exec8' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(17);
                newCell.innerHTML = "<td><input type='text' name='prev9' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(18);
                newCell.innerHTML = "<td><input type='text' name='exec9' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(19);
                newCell.innerHTML = "<td><input type='text' name='prev10' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(20);
                newCell.innerHTML = "<td><input type='text' name='exec10' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(21);
                newCell.innerHTML = "<td><input type='text' name='prev11' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(22);
                newCell.innerHTML = "<td><input type='text' name='exec11' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(23);
                newCell.innerHTML = "<td><input type='text' name='prev12' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(24);
                newCell.innerHTML = "<td><input type='text' name='exec12' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(25);
                newCell.innerHTML = "<td><input type='text' name='totalExecAno' value='' size='1' /></td>";
                
                newCell = newRow.insertCell(26);
                newCell.innerHTML = "<td><input type='text' name='totalExecProjeto' value='' size='1' /></td>";
                            

        } 
              
        </script>
        
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
        margin-left: 15px;
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
                </style>

	</head>

        
     <body background="mobile_r.jpg" bgproperties="fixed" background="transparent">
     <center><img src="banner.jpg" width="980" height="110"/></center>
     <br>
    
     <%
         String processo = request.getParameter("processo");   
     %>
    
            <div id="topo">
             <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>    
    <br><br>
    
    <div id="tudo">
        
        <div id="tudo1">
             <br>
             <center><h3>Cronograma de Execução</h3></center><hr>
            
            
            Você precisa de cronograma de execução? <br>
            <form action="CronogramaE">
            Sim<input type="radio" name="grupo1" value="Sim" />
            Não<input type="radio" name="grupo1" value="Não" checked="checked" />
            
            
            <Br><br>
            
            

            <table id="cronogramae">
                <tr><td>Ano/Mês: </td><td>P1: </td><td>E1: </td><td>P2: </td><td>E2: </td><td>P3: </td><td>E3: </td><td>P4: </td><td>E4: </td>
                    <td>P5: </td><td>E5: </td><td>P6: </td><td>E6: </td><td>P7: </td><td>E7: </td>
                    <td>P8: </td><td>E8: </td><td>P9: </td><td>E9: </td><td>P10: </td><td>E10: </td>
                    <td>P11: </td><td>E11: </td><td>P12: </td><td>E12: </td><td>TEA: </td><td>TEP: </td></tr>
                    
                
                <tr><td><input type="text" name="anoMes" value="" size="7" /></td> 
                    <td><input type="text" name="prev1" value="" size="1" /></td>
                   <td><input type="text" name="exec1" value="" size="1" /></td>
                   <td><input type="text" name="prev2" value="" size="1" /></td>
                   <td><input type="text" name="exec2" value="" size="1" /></td>
                   <td><input type="text" name="prev3" value="" size="1" /></td>
                   <td><input type="text" name="exec3" value="" size="1" /></td>
                   <td><input type="text" name="prev4" value="" size="1" /></td>
                   <td><input type="text" name="exec4" value="" size="1" /></td>
                   <td><input type="text" name="prev5" value="" size="1" /></td>
                   <td><input type="text" name="exec5" value="" size="1" /></td>
                  <td><input type="text" name="prev6" value="" size="1" /></td>
                <td><input type="text" name="exec6" value="" size="1" /></td>
               <td><input type="text" name="prev7" value="" size="1" /></td>
                <td><input type="text" name="exec7" value="" size="1" /></td>
                <td><input type="text" name="prev8" value="" size="1" /></td>
                <td><input type="text" name="exec8" value="" size="1" /></td>
                <td><input type="text" name="prev9" value="" size="1" /></td>
                <td><input type="text" name="exec9" value="" size="1" /></td>
                <td><input type="text" name="prev10" value="" size="1" /></td>
                <td><input type="text" name="exec10" value="" size="1" /></td>
                <td><input type="text" name="prev11" value="" size="1" /></td>
                <td><input type="text" name="exec11" value="" size="1" /></td>
                <td><input type="text" name="prev12" value="" size="1" /></td>
                <td><input type="text" name="exec12" value="" size="1" /></td>
                <td><input type="text" name="totalExecAno" value="" size="1" /></td>
                <td><input type="text" name="totalExecProjeto" value="" size="1" /></td>
                <td><input type="submit" value="Cadastrar" name="botao" size="20"/></td><td></tr>
            </table>
             
        </form>
            <input type="button" value="Inserir Linha" onclick="inserirLinhaTabela()"/>
            <br><br>
            *P=Previsão, E=Execução
            
            
            <p><input type="submit" value="Finalizar" onclick="location.href='conferencia.jsp' ">
            <br><br>
        </div>
        
        
        
        
        
        
    </div>
    
        
    <br><Br>
    
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
        
    </body>
</html>
