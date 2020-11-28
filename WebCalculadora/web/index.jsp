<%-- 
    Document   : index
    Created on : 28/11/2020, 16:16:20
    Author     : FIC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%  
             String resultado = request.getParameter("resultado");  
        %>  
    </head>
    <body>
        <div>Calculadora</div>
        <form method="post" action="/WebCalculadora/Calculadora">
            <input type="text" name="valor1" id="valor1">
            <select name="operacao" id="op">
                <option value="soma">Soma</option>
                <option value="subtracao">Subtração</option>
                <option value="divisao">Divisão</option>
                <option value="multiplacacao">Multiplicação</option>
            </select>
            <input type="text" name="valor2" id="valor2">
            <input type="submit" name="valor1" value="Calcular">
            <label name="resultado"><% out.println(resultado); %></label>
        </form>
    </body>
</html>
