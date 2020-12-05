<%-- 
    Document   : index
    Created on : 05/12/2020, 15:11:14
    Author     : FIC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.senai.sp.model.entity.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.senai.sp.model.dao.AlunoDao"%>
<%@page import="br.senai.sp.model.dao.Conecta"%>
<%
    if(request.getParameter("status") == null){request.setAttribute("status", "");}
    String status = request.getParameter("status");
    
    if(status != null){
        if(status.equals("OK")) {
            out.println("Registro Inserido com sucesso");
        }
        else {
            out.println("ERRO: " + status);
        }
    }
    
    String rgm = request.getParameter("rgm");
    Aluno aluno = new Aluno();
    if(rgm != null) {
        aluno = new AlunoDao().consultarAluno(rgm);
    }  
%>
<html>
    <head>
        <title>Banco de Dados</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>
    
    <body>
        <form name="form1" action="gravar.jsp" method="post">
            <table border="1">
                <tr>
                    <td>RGM:</td>
                    <td><input type="text" name="rgm" value="<%= aluno.getRgm() %>"></td>
                </tr>
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="nome"  value="<%= aluno.getNome() %>"></td>
                </tr>
                <tr>
                    <td>Nota 1:</td>
                    <td><input type="text" name="nota1"  value="<%= aluno.getNota1()%>"></td>
                </tr>
                <tr>
                    <td>Nota 2:</td>
                    <td><input type="text" name="nota2"  value="<%= aluno.getNota2() %>"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Gravar"></td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <tr>
                <td>Nome</td>
                <td>RGM</td>
                <td>Nota 1</td>
                <td>Nota 2</td>
            </tr>
        <%
            ArrayList<Aluno> lista = new AlunoDao().getAlunos();
            for(int i=0; i<lista.size(); i++) {
                out.println("<tr>");
                out.println("<td><a href='index.jsp?rgm=" + lista.get(i).getRgm() + "'>" + lista.get(i).getRgm()+ "</a></td>");
                out.println("<td>" + lista.get(i).getNome() + "</td>");
                out.println("<td>" + lista.get(i).getNota1()+ "</td>");
                out.println("<td>" + lista.get(i).getNota2()+ "</td>");
                out.println("</tr>");
            }
        %>
        
        </table>
    </body>
</html>

