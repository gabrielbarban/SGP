

<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <title>Área Exclusiva</title>
        
    
        <style>
            #foda{
                  position: absolute;
                  left: 42%;
                  width: 340px;
                  border-style: solid;
                  border-color: black;
                  background-color: #C1CDCD;   //#E0EEEE       
                 }          
                 
                 
                 
                 #geral {
position:absolute;
top:50%;
left:55%;
width:340px;
margin-left:-250px;
margin-top:-150px;
text-align:center;
border-style: solid;
                  border-color: black;
                  background-color: #C1CDCD;   //#E0EEEE    
}
        </style>
        
    </head>
   
     <body background="mobile_r.jpg" bgproperties="fixed">
         <br><br><br><br><br><br><br><br><br><Br><br>
         <font color="white">
        
         
     <center>
         <div id="geral">
        <form>
              <center>
                  <h2>Área Exclusiva</h2>
            <table>
                <tr><td>USUÁRIO: </td><td><input type="text" name="usuario" value="" size="30" /></td></tr>
            <tr><td>SENHA: </td><td><input type="password" name="senha" value="" size="30" /></td></tr>
            
            </table>
                  <br>
            <input type="submit" value="Entrar" name="botao" size="40"/>
            <input type="reset" value="Limpar" name="botao" size="40"/>
              
        </form>
        
         </div>
</center>
           </font>
        
        <%
            
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");
            
            try{
            if(usuario.equals("informatica") && senha.equals("catarinacsr@"))
            {
                response.sendRedirect("inicial3.jsp");
            }
            
            else{
                %>                
                <script type="text/javascript"> 
                    alert("Usuário e/ou senha incorretos!");
                    setTimeout("document.location = 'LoginNovo.jsp'",1);
                </script> <% 
            }
            }catch
                (Exception e){
            System.out.println(e.toString());
            }
        %>
        
     
        
    </body>
</html>
