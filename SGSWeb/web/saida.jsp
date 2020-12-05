<%-- 
    Document   : saida
    Created on : 02/12/2020, 14:34:10
    Author     : Marcos
--%>

<%@page import="br.senai.sp.model.entity.Saida"%>
<%@page import="br.senai.sp.model.dao.SaidaDao"%>
<%@page import="br.senai.sp.model.service.CommonService"%>
<%@page import="br.senai.sp.model.entity.Compra"%>
<%@page import="br.senai.sp.model.entity.Produto"%>
<%@page import="java.util.List"%>
<%@page import="br.senai.sp.model.dao.CompraDao"%>
<%@page import="br.senai.sp.model.dao.ProdutoDao"%>
<%@page import="br.senai.sp.model.dao.DepartamentoDao"%>
<%@page import="br.senai.sp.model.dao.MarcaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>::: SGS :::</title>
    </head>
    <body>
        <div id="body">
        <div id="cabecalho">
            <div id="logo">
                <h1>SGS</h1>
                <p id="subtitulo">Sistema de Gerenciamento de Suprimentos</p>
            </div>
            <div id="menu">
                <a href="index.jsp">Home</a>
                <a href="marca.jsp">Marca</a>
                <a href="departamento.jsp">Departamento</a>
                <a href="produto.jsp">Produto</a>
                <a href="compra.jsp">Compra</a>
                <a href="saida.jsp" id="selected">Saida</a>
                <a href="estoque.jsp">Estoque</a>
            </div>
        </div>
            <div id="container">
                <h1>Saida</h1>
                <p>Sistema de Gerenciamento de Suprimentos</p>
                <form method="post" action="Saida?operacao=<%=request.getAttribute("operacao")%>&editar=N">
                    
                    <label for="id-saida">Id:</label><br />
                    <input type="text" id="id-saida" class="txt-formulario" readonly="true" name="idSaida" value="<%= request.getAttribute("idSaida") %>"/><br />
                    
                    
                    <label for="data-saida">Data:</label><br />
                    <input type="text" id="data-saida" class="txt-formulario" readonly="true" name="dataSaida" value="<%= request.getAttribute("dataSaida") %>"/><br />
                    
                    <label for="cb-compra">Compra:</label><br />
                    <select id="cb-compra" class="cb-formulario" name="idCompra">
                        <% 
                            CommonService commonService = new CommonService();
                            MarcaDao marcaDao = new MarcaDao();
                            DepartamentoDao departamentoDao = new DepartamentoDao();
                            ProdutoDao produtoDao = new ProdutoDao();
                            CompraDao compraDao = new CompraDao();
                            List<Compra> compras = compraDao.consultar();
                            for(Compra c: compras){
                        %>
                        <option value="<%=c.getId() %>"><%=c.getId() + " | Preço: " + 
                                          c.getPreco() + " | " + 
                                          commonService.getStringData(c.getData())  + " | Quantidade: " +
                                          c.getQuantidade()+ " | Estoque: " +
                                          c.getTotal() + " | " +
                                          produtoDao.consultar(c.getIdProduto()).getNome()+ " | " +
                                          marcaDao.consultar(produtoDao.consultar(c.getIdProduto()).getIdMarca()).getNome()   + " | " +
                                          marcaDao.consultar(produtoDao.consultar(c.getIdProduto()).getIdMarca()).getEmpresa()   + " | " +
                                          departamentoDao.consultar(produtoDao.consultar(c.getIdProduto()).getIdDept()).getNome()  %></option>
                       <%
                          }
                        %>
                    </select><br />
               
                    <label for="quantidade-saida">Quantidade Retirada:</label><br />
                    <input type="text" id="quantidade-saida" class="txt-formulario" name="quantidadeSaida" value="<%= request.getAttribute("quantidadeSaida") %>"/><br />
                  
                    <script>
                        document.getElementById('cb-compra').value = "<%=request.getAttribute("idCompra") %>";
                    </script>
                    <input type="submit" id="enviar" class="btn-formulario" value="Salvar" name="enviar"/>  
                    <input type="button" id="cancelar" class="btn-formulario" value="Cancelar" name="cancelar" onClick="window.location.href='saida.jsp'"/>  
                    <label name="operacao">  <%= request.getAttribute("operacao") %></label><br />
                </form>
                <div id="tabela">
                    <table>
                        <caption>Compra</caption>
                        <tr>
                            <th class="compra-coluna1">Id</th>
                            <th class="compra-coluna2">Data</th>
                            <th class="compra-coluna4">Quantidade</th>
                            <th class="compra-coluna5">Compra</th>
                            <th class="compra-coluna7">Operação</th>
                        </tr>
                        <%
                            SaidaDao saidaDao = new SaidaDao();
                            List<Saida> saidas = saidaDao.consultar();
                            for(Saida s: saidas){
                        %>
                        <tr>
                            <td class="compra-coluna1"><%=s.getId() %></td>
                            <td class="compra-coluna2"><%=commonService.getStringData(s.getData()) %></td>
                            <td class="compra-coluna4"><%=s.getQuantidade() %></td>
                            <td class="compra-coluna6"><%=compraDao.consultar(s.getIdCompra()).getId() + " | Preço: " + compraDao.consultar(s.getIdCompra()).getPreco() %></td>                              
                            <td class="compra-coluna7"><a href="Saida?idSaida=<%=s.getId() %>&operacao=Alterar&editar=S" >Alterar</a> | <a href="Saida?idSaida=<%=s.getId() %>&operacao=Excluir&editar=S" >Excluir</a></td>
                        </tr>
                        <%
                            }
                        %>
                    </table><br /><br /><br />
                
                <div id="footer">
                    <small>SGS - Sistema de Gerenciamento de Suprimentos</small>
                </div>
            </div>
        </div>
    </body>
</html>

