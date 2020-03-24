<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="latin1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=latin1">
        <title>JSP Page</title>
    </head>
    <body>
                
        <%
            
            String valor = (String) request.getSession().getAttribute("cont");
            
            int k = Integer.valueOf(valor);
            
            
            
            int a=0;
            
            
            
            while(a<k)
            {
                out.println(request.getSession().getAttribute("k"+a));
                a++;
            }
           
         %>
    </body>
</html>
