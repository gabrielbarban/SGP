<%@ page contentType="text/html" language="java" import="java.sql.*"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
  

<html>
<head>  
   <title>Teste de Conex�o</title>  
</head>  
  
<body>  
  
<%  
    Connection conexao;  
    
    
      
    String url= "jdbc:Mysql://localhost:3306/botanica";
        String usuario="root";
        String senha="botanica";
        try {
            //carregar o driver de conex�o
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);            
            out.println("CONECTADO COM SUCESSO!");
        }
        catch(ClassNotFoundException e)
        {
            out.println("Problemas ao carregar o driver de conex�o");
        }
        catch(SQLException e)
        {
            out.println("Problemas ao estabelecer conex�o com o banco");
        }
    
      
%>  
  
</body> 
</html>