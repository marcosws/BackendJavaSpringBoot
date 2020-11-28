<%-- 
    Document   : caculadora
    Created on : 28/11/2020, 15:01:26
    Author     : FIC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
                       "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
  <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <%  
             String resp = request.getParameter("resp");  
        %>  
  </head>  
  <body>  
    <form action="Calcular" method="post">  
     <input type="text" name="n1">  
     <br/>  
     <input type="text" name="n2">  
     <input type="submit" value="Calcular">  
    </form>  
    Resposta: <% out.println(resp); %>  
  </body>  
</html>
