
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
     <br>
    
    
            <div id="topo">
             <center><font size="6" >Sistema Gerenciador de Projetos</font></center> 
            <div align="right"><% out.println(new SimpleDateFormat().format(new Date())); %> <br> Usuário: <%=(String) request.getSession().getAttribute("nome")%> (<a href="index.html">Sair</a>)</div>
            </div>
    
    
    <br><br>
        
        
        
        <% 
                String numero = (String) request.getSession().getAttribute("numero");
                String titulo = (String) request.getSession().getAttribute("titulo");
                String responsavel = (String) request.getSession().getAttribute("responsavel");
                String coResponsavel = (String) request.getSession().getAttribute("coResponsavel");
                String telefone = (String) request.getSession().getAttribute("telefone");
                String email = (String) request.getSession().getAttribute("email");
                String equipe = (String) request.getSession().getAttribute("equipe");
                String processo = (String) request.getSession().getAttribute("processo");
                String linha = (String) request.getSession().getAttribute("linha");
                String objetivosPrincipais = (String) request.getSession().getAttribute("objetivosPrincipais");
                String resumo = (String) request.getSession().getAttribute("resumo");
                String metas = (String) request.getSession().getAttribute("metas");
                String dataInicio = (String) request.getSession().getAttribute("dataInicio");
                String dataFim = (String) request.getSession().getAttribute("dataFim");
                String situacao = (String) request.getSession().getAttribute("situacao");
                String centro = (String) request.getSession().getAttribute("centro");
                String nucleo = (String) request.getSession().getAttribute("nucleo");
                String obs = (String) request.getSession().getAttribute("obs");
                String usuarioAdm = (String) request.getSession().getAttribute("usuarioAdm");
                String dataCadastro = (String) request.getSession().getAttribute("dataCadastro");
                String status = (String) request.getSession().getAttribute("status");
                String financiamentoExterno = (String) request.getSession().getAttribute("financiamentoExterno");
                String usuarioComum = (String) request.getSession().getAttribute("usuarioComum");
                String custoGlobal = (String) request.getSession().getAttribute("custoGlobal"); 
       
       %>
            
       
      <div id="tudo">
          <div id="tudo1">
            <br>
            <center><h3>Atualizar Projeto</h3></center><hr>
            <br>
        
        <form  method="POST" action="exclusao2">
          
                
            <table>
            <tr><td><b><label>Numero: </label></b></td><td><input type="text" name="numero" value="<%=numero%>" size="75"/></td></tr>
            
            <tr><td><b><label>Titulo: </label></b></td><td><textarea name="titulo" rows="5" cols="75"><%=titulo%></textarea></td></tr>
            
            <tr><td><b><label>Responsável: </label></b></td><td><textarea name="responsavel" rows="3" cols="75" ><%=responsavel%></textarea></tr>
           
            <tr><td><b><label>Co-responsável: </label></b></td><td><textarea name="coResponsavel" rows="5" cols="75"><%=coResponsavel%></textarea></td></tr>
            
            <tr><td><b><label>Telefone: </label></b></td><td><input type="text" name="telefone" value="<%=telefone%>"  placeholder="Telefone" size="14" maxlength="9"/></td></tr>
            
            
            <tr><td><b><label>E-mail: </label></b></td><td><textarea name="email" rows="2" cols="75"><%=email%></textarea></td></tr>
            
            <tr><td><b>Equipe: </b></td><td><textarea name="equipe" rows="5" cols="75"><%=equipe%></textarea></td></tr>
            
            <tr><td><b>Processo: </b></td><td><textarea name="processo" rows="1" cols="75"><%=processo%></textarea></td></tr>
            
            <tr><td><b>Linha: </b></td><td><select name="linha" >
                        <option><%=linha%></option>
                        <option>Biodiversidade e Conservação</option>
                        <option>Mudanças Climáticas</option>
                        <option>Bioprospecção</option>
                        <option>Recursos Hídricos</option>
                    </select></td></tr>
            
            <tr><td><b>Objetivos principais: </b></td><td><textarea name="objetivosPrincipais" rows="5" cols="75"><%=objetivosPrincipais%></textarea></td></tr>
            
            <tr><td><b>Resumo: </b></td><td><textarea name="resumo" rows="20" cols="75"><%=resumo%></textarea></td></tr>
            
            <tr><td><b>Metas: </b></td><td><textarea name="metas" rows="6" cols="75"><%=metas%></textarea></td></tr>
            
            <tr><td><b>Data de início do Projeto: </b></td><td><textarea name="dataInicio" rows="1" cols="75" readonly="readonly"><%=dataInicio%></textarea></td></tr>
                    
            
             <tr><td><b>Data de finalização do Projeto: </b></td><td><textarea name="dataFim" rows="1" cols="75"><%=dataFim%></textarea></td></tr>
                
                
            
            <tr><td><b>Situação: </b></td><td><select name="situacao">
                        <option><%=situacao%></option>
                        <option>Ativo</option>
                        <option>Encerrado</option>
                        <option>Vencido</option>
                    </select></td></tr>
            
            <tr><td><b>Centro: </b></td><td><textarea name="centro" rows="1" cols="75"><%=centro%></textarea></td></tr>
            
            <tr><td><b>Nucleo: </b></td><td><textarea name="nucleo" rows="1" cols="75"><%=nucleo%></textarea></td></tr>
            
            <tr><td><b>Data do envio: </b></td><td><textarea name="dataCadastro" rows="1" cols="75" readonly="readonly"><%=dataCadastro%></textarea></td></tr>
            
            <tr><td><b>Usuário Administrador responsável</b></td><td><textarea name="usuarioAdm" rows="1" cols="75" readonly="readonly"><%=usuarioAdm%></textarea></td></tr>
            
            <tr><td><b>Pesquisador (Usuário): </b></td><td><textarea name="usuarioComum" rows="1" cols="75" readonly="readonly"><%=usuarioComum%></textarea></td></tr>

            <tr><td><b>Custo Global: </b></td><td><textarea name="custoGlobal" rows="3" cols="75"><%=custoGlobal%></textarea></td></tr>
            
            <tr><td><b>Financiamento Externo: </b></td><td><textarea name="financiamentoExterno" rows="3" cols="75"><%=financiamentoExterno%></textarea></td></tr>
            
            <tr><td><b>Obs.: </b></td><td><textarea name="obs" rows="3" cols="75"><%=obs%></textarea></td></tr>
            
            
            <tr><td><br><br><br><input type="submit" name="botao1" value="Atualizar" size="30" /></td></tr>
            <tr><td> <input type="reset" name="botao2" value="Limpar" size="30" /></td></tr>
            </table>
            
        </form>
        <br><br>
        
        <input type="submit" value="Voltar" onclick="location.href='inicial.jsp' ">
        
       
        <br><br>
        
        </div></div>
    
    <br><Br>
    <div id="rodape" align="center>"><center><img src="rodape_intranet.jpg" width="970" height="56" alt="rodape_intranet"/></center></div>
    
    
    </body>
</html>
