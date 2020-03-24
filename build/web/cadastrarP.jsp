
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
           
        
         <script type="text/javascript">

       var conta=0;

       function novaLinha()
       {
                 conta++;

                 var parte1 = "<tr><td>Teste " + conta + "</td>";
                 var parte2 = "<td  id='numero" + conta + "'><input type='button' ";
                 var parte3 = "value='remover' onClick=\"javascript:removeLinha('numero"+conta+"')\"></input>";

                 document.getElementById("numero").innerHTML += parte1 + parte2 + parte3;
                 document.getElementById("numero").innerHTML += "</td></tr>";

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
    
    
            <div id="topo">
             <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
        
    
    <div id="tudo2">
        <%
        
        
        String usuarioComum = request.getParameter("nome");
       
        %>
         </div>
    
    <br><br>
        
     <div id="tudo">
         
                 
         <div id="tudo1">
            <br>
            <center><h3>Novo Projeto</h3></center><hr>
            <br>
            
           <form method="post" action="Cadastrar" name="cadastro">
                
            <table>
                
            <tr><td><b>Pesquisador(a) Responsável: </b></td><td><input type="text" name="usuarioComum" value="<%=usuarioComum%>" readonly=readonly placeholder="Pesquisador" size="40"/><br><br></td></tr>
             
            <tr><td><b><label>Número: </label></b></td><td><textarea name="numero" rows="1" cols="75"></textarea><br><br></td></tr>
                
            <tr><td><b><label>Título: </label></b></td><td><textarea name="titulo" rows="5" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b><label>Co-responsável: </label></b></td><td><textarea name="coResponsavel" rows="5" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b><label>Telefone: </label></b></td><td><input type="text" name="ddd" value=""  placeholder="ddd" size="3" maxlength="2" /><input type="text" name="telefone" value=""  placeholder="Telefone" size="14" maxlength="9"/><br><br></td></tr>
            
            <tr><td><b><label>E-mail: </label></b></td><td><input type="text" name="email" value="" size="30" /><br><br></td></tr>
            
            <tr><td><b>Equipe: </b></td><td><textarea name="equipe" rows="5" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Processo: </b></td><td><textarea name="processo" rows="1" cols="75"></textarea><br><br></td></tr>
         
            <tr><td><b>Linha: </b></td><td>
                    <select name="linha" >
                        <option>Escolha uma linha...</option>
                        <option>Biodiversidade e Conservação</option>
                        <option>Mudanças Climáticas</option>
                        <option>Bioprospecção</option>
                        <option>Recursos Hídricos</option>
                    </select><br><br></td></tr>
            
            <tr><td><b>Objetivos principais: </b></td><td><textarea name="objetivosPrincipais" rows="5" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Resumo: </b></td><td><textarea name="resumo" rows="20" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Metas: </b></td><td><textarea name="metas" rows="6" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Abrangência: </b></td><td><textarea name="abrangencia" rows="6" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Relevância/Aplicação: </b></td><td><textarea name="relevancia" rows="6" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Data de início:</b></td><td>
                 Mês <select name="mesInicio">
                        <option>--</option>
                        <option>01</option>
                        <option>02</option>
                        <option>03</option>
                        <option>04</option>
                        <option>05</option>
                        <option>06</option>
                        <option>07</option>
                        <option>08</option>
                        <option>09</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                    </select>
                Ano <select name="anoInicio">
                        <option>--</option>
                        <option>1990</option>
                        <option>1991</option>
                        <option>1992</option>
                        <option>1993</option>
                        <option>1994</option>
                        <option>1995</option>
                        <option>1996</option>
                        <option>1997</option>
                        <option>1998</option>
                        <option>1999</option>
                        <option>2000</option>
                        <option>2001</option>
                        <option>2002</option>
                        <option>2003</option>
                        <option>2004</option>
                        <option>2005</option>
                        <option>2006</option>
                        <option>2007</option>
                        <option>2008</option>
                        <option>2009</option>
                        <option>2010</option>
                        <option>2011</option>
                        <option>2012</option>
                        <option>2013</option>
                        <option>2014</option>
                        <option>2015</option>
                        <option>2016</option>
                        <option>2017</option>
                        <option>2018</option>
                        <option>2019</option>
                        <option>2020</option>
                        <option>2021</option>
                        <option>2022</option>
                        <option>2023</option>
                        <option>2024</option>
                        <option>2025</option>
                        <option>2026</option>
                        <option>2027</option>
                        <option>2028</option>
                        <option>2029</option>
                        <option>2030</option>
                        <option>2031</option>
                        <option>2032</option>
                        <option>2033</option>
                        <option>2034</option>
                        <option>2035</option>
                        <option>2036</option>
                        <option>2037</option>
                        <option>2038</option>
                        <option>2039</option>
                        <option>2040</option>
                        <option>2041</option>
                        <option>2042</option>
                        <option>2043</option>
                        <option>2044</option>
                        <option>2045</option>
                        <option>2046</option>
                        <option>2047</option>
                        <option>2048</option>
                        <option>2049</option>
                        <option>2050</option>
                        <option>2051</option>
                        <option>2052</option>
                        <option>2053</option>
                        <option>2054</option>
                        <option>2055</option>
                        <option>2056</option>
                        <option>2057</option>
                        <option>2058</option>
                        <option>2059</option>
                        <option>2060</option>
                        <option>2061</option>
                        <option>2062</option>
                        <option>2063</option>
                        <option>2064</option>
                        <option>2065</option>
                        <option>2066</option>
                        <option>2066</option>
                        <option>2067</option>
                        <option>2068</option>
                        <option>2069</option>
                        <option>2070</option>
                        <option>2071</option>
                        <option>2072</option>
                        <option>2073</option>
                        <option>2074</option>
                        <option>2075</option>
                        <option>2076</option>
                        <option>2077</option>                        
                        <option>2078</option>
                        <option>2079</option>
                        <option>2080</option>
                    </select><br><br></td></tr>
            
            <tr><td><b>Data de finalização: </b></td><td>
                Mês <select name="mesFim">
                        <option>--</option>
                        <option>01</option>
                        <option>02</option>
                        <option>03</option>
                        <option>04</option>
                        <option>05</option>
                        <option>06</option>
                        <option>07</option>
                        <option>08</option>
                        <option>09</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                    </select>
                Ano <select name="anoFim">
                        <option>--</option>
                        <option>2000</option>
                        <option>2001</option>
                        <option>2002</option>
                        <option>2003</option>
                        <option>2004</option>
                        <option>2005</option>
                        <option>2006</option>
                        <option>2007</option>
                        <option>2008</option>
                        <option>2009</option>
                        <option>2010</option>
                        <option>2011</option>
                        <option>2012</option>
                        <option>2013</option>
                        <option>2014</option>
                        <option>2015</option>
                        <option>2016</option>
                        <option>2017</option>
                        <option>2018</option>
                        <option>2019</option>
                        <option>2020</option>
                        <option>2021</option>
                        <option>2022</option>
                        <option>2023</option>
                        <option>2024</option>
                        <option>2025</option>
                        <option>2026</option>
                        <option>2027</option>
                        <option>2028</option>
                        <option>2029</option>
                        <option>2030</option>
                        <option>2031</option>
                        <option>2032</option>
                        <option>2033</option>
                        <option>2034</option>
                        <option>2035</option>
                        <option>2036</option>
                        <option>2037</option>
                        <option>2038</option>
                        <option>2039</option>
                        <option>2040</option>
                        <option>2041</option>
                        <option>2042</option>
                        <option>2043</option>
                        <option>2044</option>
                        <option>2045</option>
                        <option>2046</option>
                        <option>2047</option>
                        <option>2048</option>
                        <option>2049</option>
                        <option>2050</option>
                        <option>2051</option>
                        <option>2052</option>
                        <option>2053</option>
                        <option>2054</option>
                        <option>2055</option>
                        <option>2056</option>
                        <option>2057</option>
                        <option>2058</option>
                        <option>2059</option>
                        <option>2060</option>
                        <option>2061</option>
                        <option>2062</option>
                        <option>2063</option>
                        <option>2064</option>
                        <option>2065</option>
                        <option>2066</option>
                        <option>2066</option>
                        <option>2067</option>
                        <option>2068</option>
                        <option>2069</option>
                        <option>2070</option>
                        <option>2071</option>
                        <option>2072</option>
                        <option>2073</option>
                        <option>2074</option>
                        <option>2075</option>
                        <option>2076</option>
                        <option>2077</option>                        
                        <option>2078</option>
                        <option>2079</option>
                        <option>2080</option>
                    </select><br><br></td></tr>
                <br><br></td></tr>
            
            <tr><td><b>Situação: </b></td><td><select name="situacao">
                        <option>Escolha uma situação...</option>
                        <option>Ativo</option>
                        <option>Encerrado</option>
                        <option>Vencido</option>
                    </select><br><br></td></tr>
            
            <tr><td><b>Centro: </b></td><td><textarea name="centro" rows="1" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Nucleo: </b></td><td><textarea name="nucleo" rows="1" cols="75"></textarea><br><br></td></tr>
            
            <tr><td><b>Financiamento Externo: </b></td><td>
                Sim <input type="radio" name="grupo1" value="Sim" />
                Não <input type="radio" name="grupo1" value="Não" />
                <Br> (Se sim, escolha) FAPESP <input type="radio" name="grupo2" value="fapesp" /> CAPES <input type="radio" name="grupo2" value="capes" /> CNPQ <input type="radio" name="grupo2" value="cnpq" />
            <br><br></td></tr>
                        
            <tr><td><b>Custo Global: </b></td><td><input type="text" name="custoGlobal" value="" placeholder="R$"/><br><br></td></tr>         
                      
            <tr><td><b>Observação: </b></td><td><textarea name="obs" rows="3" cols="75"></textarea><br><br><br><br></td></tr>
                        
            <tr>
                <td><left><input type="reset" name="botao2" value="Limpar" size="30" /></left></td>
                <td><right><input type="submit" name="botao1" value="Avançar" size="30" /></right></td>
        </tr>
            </table>
        </form>
        <br><br>
     
     </div></div>
    
    <br><Br>
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
    
   
    </body>
</html>