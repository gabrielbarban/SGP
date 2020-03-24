<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
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

        <% 
       String titulo = (String) request.getSession().getAttribute("titulo");
       String coResponsavel = (String) request.getSession().getAttribute("coResponsavel");
       String telefone = (String) request.getSession().getAttribute("telefone");
       String email = (String) request.getSession().getAttribute("email");
       String equipe = (String) request.getSession().getAttribute("equipe");
       String linha = (String) request.getSession().getAttribute("linha");
       String objetivosPrincipais = (String) request.getSession().getAttribute("objetivosPrincipais");
       String resumo = (String) request.getSession().getAttribute("resumo");
       String metas = (String) request.getSession().getAttribute("metas");
       String dataInicio = (String) request.getSession().getAttribute("dataInicio");
       String dataFim = (String) request.getSession().getAttribute("dataFim");
       String situacao = (String) request.getSession().getAttribute("situacao");
       String centro = (String) request.getSession().getAttribute("centro");
       String nucleo = (String) request.getSession().getAttribute("nucleo");
       String data = (String) request.getSession().getAttribute("data");
       String financiamentoExterno = (String) request.getSession().getAttribute("financiamentoExterno");
       String usuarioComum = (String) request.getSession().getAttribute("usuarioComum");
       String obs = (String) request.getSession().getAttribute("obs");
       String custoGlobal = (String) request.getSession().getAttribute("custoGlobal");
       String abrangencia = (String) request.getSession().getAttribute("abrangencia");
       String relevancia = (String) request.getSession().getAttribute("relevancia");
       
       %>
            
           <br>
                <center><h3>Novo Projeto</h3></center><hr>
            <br>
        <form  method="POST" action="PesquisarProjeto3">
            <table>
           
            <tr><td><b>Número: </b></td><td><textarea name="numero" rows="1" cols="75"></textarea></td></tr>
                
            <tr><td><b>Titulo: </b></td><td><textarea name="titulo" rows="2" cols="75"><%=titulo%></textarea></td></tr>
                       
            <tr><td><b>Co-responsável: </b></td><td><textarea name="coResponsavel" rows="2" cols="75"><%=coResponsavel%></textarea></td></tr>
            
            <tr><td><b>Telefone: </b></td><td><textarea name="telefone" rows="1" cols="75"><%=telefone%></textarea></td></tr>
            
            <tr><td><b>E-mail: </b></td><td><textarea name="email" rows="1" cols="75"><%=email%></textarea></td></tr>
            
            <tr><td><b>Equipe: </b></td><td><textarea name="equipe" rows="3" cols="75"><%=equipe%></textarea></td></tr>
                        
            <tr><td><b>Linha: </b></td><td><select name="linha" >
                        <option><%=linha%></option>
                        <option>Biodiversidade e Conservação</option>
                        <option>Mudanças Climáticas</option>
                        <option>Bioprospecção</option>
                        <option>Recursos Hídricos</option>
                    </select></td></tr>
            
            <tr><td><b>Processo: </b></td><td><textarea name="processo" rows="5" cols="75"></textarea></td></tr>
            
            <tr><td><b>Objetivos principais: </b></td><td><textarea name="objetivosPrincipais" rows="5" cols="75"><%=objetivosPrincipais%></textarea></td></tr>
            
            <tr><td><b>Resumo: </b></td><td><textarea name="resumo" rows="20" cols="75"><%=resumo%></textarea></td></tr>
            
            <tr><td><b>Metas: </b></td><td><textarea name="metas" rows="8" cols="75"><%=metas%></textarea></td></tr>
                        
            <tr><td><b>Início: </b></td><td><textarea name="dataInicio" rows="1" cols="75"><%=dataInicio%></textarea></td></tr>
            
            <tr><td><b>Previsão de encerramento: </b></td><td><textarea name="dataFim" rows="1" cols="75"><%=dataFim%></textarea></td></tr>
            
            <tr><td><b>Situação: </b></td><td><select name="situacao">
                        <option><%=situacao%></option>
                        <option>Ativo</option>
                        <option>Encerrado</option>
                        <option>Vencido</option>
                    </select></td></tr>
            
            <tr><td><b>Centro: </b></td><td><textarea name="centro" rows="1" cols="75"><%=centro%></textarea></td></tr>
            
            <tr><td><b>Nucleo: </b></td><td><textarea name="nucleo" rows="1" cols="75"><%=nucleo%></textarea></td></tr>
            
            <tr><td><b>Data do envio: </b></td><td><textarea name="data" rows="1" cols="75" readonly="readonly"><%=data%></textarea></td></tr>
            
            <tr><td><b>Financiamento externo: </b></td><td><textarea name="financiamentoExterno" rows="1" cols="75"><%=financiamentoExterno%></textarea></td></tr>
            
                      
            <tr><td><b>Obs.: </b></td><td><textarea name="obs" rows="2" cols="61"><%=obs%></textarea></td></tr>
            
            <tr><td><b>Custo global: </b></td><td><textarea name="obs" rows="2" cols="61"><%=custoGlobal%></textarea></td></tr>
            
            <tr><td><b>Abrangência: </b></td><td><textarea name="obs" rows="2" cols="61"><%=abrangencia%></textarea></td></tr>
            
            <tr><td><b>Relevância: </b></td><td><textarea name="obs" rows="2" cols="61"><%=relevancia%></textarea></td></tr>
            
            <tr><td><b>Enviado pelo usuário: </b></td><td><textarea name="usuarioComum" rows="1" cols="75" readonly="readonly"><%=usuarioComum%></textarea></td></tr>
            
            
           <tr><td><br><br><br><input type="submit" name="botao1" value="Incluir" size="30" /></td></tr>
            <tr><td> <input type="reset" name="botao2" value="Limpar" size="30" /></td></tr>
            </table>
        </form>
        <br><br>
        
        <input type="submit" value="Voltar" onclick="location.href='listarProjeto' ">
        <br>
        
       
        <br>
        
            </div></div>
    
    <br><Br>
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
    
   
    </body>
</html>