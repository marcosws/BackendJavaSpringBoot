<%-- 
    Document   : grava
    Created on : 05/12/2020, 15:20:41
    Author     : FIC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.senai.sp.model.entity.Aluno"%>
<%@page import="br.senai.sp.model.dao.AlunoDao"%>
<%@page import="br.senai.sp.model.dao.Conecta"%>
<%
    //Captura os dados do formulário do index
    String rgm = request.getParameter("rgm");
    String nome = request.getParameter("nome");
    String nota1 = request.getParameter("nota1");
    String nota2 = request.getParameter("nota2");
    
    //Monta objeto Aluno
    Aluno aluno = new Aluno();
    aluno.setRgm(rgm);
    aluno.setNome(nome);
    aluno.setNota1(Float.parseFloat(nota1));
    aluno.setNota2(Float.parseFloat(nota2));
    
    //Grava o dado
    String resp = new AlunoDao().inserirAluno(aluno);
        
    //Manda de volta para o index com uma mensagem (sucesso)
    response.sendRedirect("index.jsp?status=" + resp);
%>

