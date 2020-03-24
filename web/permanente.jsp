
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

           
            var table = document.getElementById("permanente");
            var numOfRows = table.rows.length;
            var numOfCols = table.rows[numOfRows-1].cells.length;

            
            var newRow = table.insertRow(numOfRows);
 
            
            
                newCell = newRow.insertCell(0);
                newCell.innerHTML = "<td><input type='text' name='item' value='' size='3' /></td>";
                
                newCell = newRow.insertCell(1);
                newCell.innerHTML = "<td><input type='text' name='quantidade' value='' size='9' /></td>";
                
                newCell = newRow.insertCell(2);
                newCell.innerHTML = "<td><input type='text' name='descricao' value='' size='18' /></td>";
                
                newCell = newRow.insertCell(3);
                newCell.innerHTML = "<td><input type='text' name='precoUnitario' value='' size='9' placeholder='R$'/></td>";
                
                newCell = newRow.insertCell(4);
                newCell.innerHTML = "<td><input type='text' name='custoItem' value='' size='8' /></td>";
                
                newCell = newRow.insertCell(5);
                newCell.innerHTML = "<td><input type='text' name='fonte' value='' size='8' /></td>";
                
                newCell = newRow.insertCell(6);
                newCell.innerHTML = "<td><input type='text' name='consumoLuz' value='' size='10' /></td>";
                
                newCell = newRow.insertCell(7);
                newCell.innerHTML = "<td><input type='text' name='consumoAgua' value='' size='9' /></td>";
            

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
            <center><h3>Material permanente:</h3></center><hr>
            
            
            Você utilizou material permanente? <br>
            <form action="Permanente?processo=<%=processo%>">
            Sim<input type="radio" name="grupo1" value="Sim" />
            Não<input type="radio" name="grupo1" value="Não" checked="checked" />
            
            
            <Br><br>
            
            

            <table id="permanente">
                <tr><td>Item: </td><td>Quantidade: </td><td>Descrição: </td><td>Preço Unitário: </td><td>Custo do Item: </td><td>Fonte: </td><td>Consumo Luz (Kw/h): </td><td>Consumo Água (L/Mê): </td></tr>
                <tr><td><input type="text" name="item" value="" size="3" /></td>
                <td><input type="text" name="quantidade" value="" size="9" /></td>
                <td><input type="text" name="descricao" value="" size="18" /></td>
                <td><input type="text" name="precoUnitario" value="" size="9" placeholder="R$"/></td>
                <td><input type="text" name="custoItem" value="" size="8" /></td>
                <td><input type="text" name="fonte" value="" size="8" /></td>
                <td><input type="text" name="consumoLuz" value="" size="10" /></td>
                <td><input type="text" name="consumoAgua" value="" size="9" /></td>
                <td><input type="submit" value="Cadastrar" name="botao" size="20"/></td></tr>
            </table>
             
       
            </form>
            <input type="button" value="Inserir Linha" onclick="inserirLinhaTabela()"  />
            <br><br>
            
            
            <center><input type="submit" value="Voltar" onclick="location.href='diarias.jsp?processo=<%=processo%>' "><input type="submit" value="Avançar" onclick="location.href='cronogramad.jsp?processo=<%=processo%>' "></center>
            <br><br>
        </div>
        
        
        
        
        
        
    </div>
    
        
    <br><Br>
    
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
        
    </body>
</html>
