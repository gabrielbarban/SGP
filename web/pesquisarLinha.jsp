

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
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/png" href="favicon.jpg" />
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <link rel="stylesheet" href="assets/css/main.css" />
        <title>SGP</title>
        
        
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
	width: 488px;
	height: 600px;
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
            </div>
    
    
    <br><br>
    
    <div id="tudo">
    
    
   <div id="tudo1">
         <Br>
         <center><input type="submit" value="Pesquisar pelo Número do Projeto" onclick="location.href='pesquisarNumero.jsp' "></center><br>
        
        <center><input type="submit" value="Pesquisar pelo Número do Processo" onclick="location.href='pesquisarProcesso.jsp' "></center><BR>
        
        <center><input type="submit" value="Pesquisar pela Linha" onclick="location.href='pesquisarLinha.jsp' "></center>
        <Br>
        
        <center><form name="pesquisa" method="POST">
            Linha:   
            <select name="linha">
                <option></option>
                <option>Biodiversidade e Conservação</option>
                <option>Mudanças Climáticas</option>
                <option>Bioprospecção</option>
                <option>Recursos Hídricos</option>
            </select><Br>
            <input type="submit" value="Pesquisar" name="enviar" />
            </form></center>
        <br>
        
       <center> <input type="submit" value="Pesquisar pelo Situação" onclick="location.href='pesquisarSituacao.jsp' "></center><BR>
        
        <center><input type="submit" value="Pesquisar pelo Responsável" onclick="location.href='pesquisarResponsavel.jsp' "></center><BR>
        
        
        
        
        <%
        
            
       String numero = null;
       String titulo = null;
       String responsavel = null;;
       String coResponsavel = null;
       String contato = null;
       String equipe = null;
       String processo = null;
       String linha = request.getParameter("linha");
       String objetivosPrincipais = null;
       String resumo = null;
       String metasAno1 = null;
       String metasAno2 = null;
       String metasAno3 = null;
       String metasAno4 = null;
       String inicio = null;
       String previsaoFim = null;
       String situacao = null;
       String centro = null;
       String nucleo = null;
       String prazo = null;
       String obs = null;
        
        
       
       
       
        
        
        
           if(linha != null)
       {
           request.setAttribute("numero", numero);
           request.setAttribute("titulo", titulo);
           request.setAttribute("responsavel", responsavel);
           request.setAttribute("coResponsavel", coResponsavel);
           request.setAttribute("contato", contato);
           request.setAttribute("equipe", equipe);
           request.setAttribute("processo", processo);
           request.setAttribute("linha", linha);
           request.setAttribute("objetivosPrincipais", objetivosPrincipais);
           request.setAttribute("resumo", resumo);
           request.setAttribute("metasAno1", metasAno1);
           request.setAttribute("metasAno2", metasAno2);
           request.setAttribute("metasAno3", metasAno3);
           request.setAttribute("metasAno4", metasAno4);
           request.setAttribute("inicio", inicio);
           request.setAttribute("previsaoFim", previsaoFim);
           request.setAttribute("situacao", situacao);
           request.setAttribute("centro", centro);
           request.setAttribute("nucleo", nucleo);
           request.setAttribute("prazo", prazo);
           request.setAttribute("obs", obs);           
           request.getRequestDispatcher("pesquisarLinha").forward(request, response);           
       }
        
        
     
      %>
       
        
      
        
    </div>

     
       
    
    <div id="tudo2">
        <br>
         <form name="loginFORM" method="POST" action="Login">
              <center>
                  <h3>Autenticação</h3>
            <table>
                <tr><td>USUÁRIO: </td><td><input type="text" name="usuario" value="" size="30" /></td></tr>
            <tr><td>SENHA: </td><td><input type="password" name="senha" value="" size="30" /></td></tr>
            <tr><td><input type="submit" value="Entrar" name="botao1" size="40"/></td><td><input type="reset" value="Limpar" name="botao2" size="40"/></td></tr>
            </table>
              </center>
        </form>
        
        
    </div>
    
    
    
   
    
    
    
   </font> 
    
    </font>
    
    
    
    
    
    
    </div>
    
       <br><br>
         <div id="rodape"> <img src="rodape_intranet.jpg" width="975" height="56" alt="rodape_intranet"/>
    </div>       
    
        
    </body>
</html>
