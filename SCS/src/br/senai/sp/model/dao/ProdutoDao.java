/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import br.senai.sp.model.entity.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class ProdutoDao {
    
    private final Connection connection;
    public ProdutoDao(){
	this.connection = new Conexao().getConnection();
    }
    
    public void inserir(Produto produto){
        
        String sql = "INSERT INTO PRODUTO (NOME, ID_MARCA, ID_DEPT) VALUES (?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setString(1, produto.getNome());
            stmt.setLong(2, produto.getIdMarca());
            stmt.setLong(2, produto.getIdDept());
            stmt.execute();
            stmt.close();	
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void alterar(Produto produto){
        
        String sql = "UPDATE PRODUTO SET NOME=?, ID_MARCA=?, ID_DEPT=? WHERE ID=?;";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setString(1, produto.getNome());
            stmt.setLong(2, produto.getIdMarca());
            stmt.setLong(3, produto.getIdDept());
            stmt.setLong(4, produto.getId());
            stmt.execute();
            stmt.close();	
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void excluir(Produto produto){
        
        try{
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID=?");
            stmt.setLong(1, produto.getId());
            stmt.execute();
            stmt.close();
        }
	catch(SQLException e){
            throw new RuntimeException(e);
	}
    }
    public Produto consultar(long id){
        
        Produto produto = new Produto();
        try{
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM PRODUTO WHERE ID = ?"); 
            ptmt.setString(1,Long.toString(id));
            ResultSet resultSet = ptmt.executeQuery();
                
            resultSet.first();  
            produto.setId(resultSet.getLong("ID"));
            produto.setNome(resultSet.getString("NOME"));
            produto.setIdMarca(resultSet.getLong("ID_MARCA"));
            produto.setIdDept(resultSet.getLong("ID_DEPT"));
            
            return produto;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public List<Produto> consultar(){
        
         try{
            List<Produto> produtos = new ArrayList<Produto>();
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM PRODUTO;");
            ResultSet resultSet = ptmt.executeQuery();
                
            while(resultSet.next()){
                    
                Produto produto = new Produto();
                produto.setId(resultSet.getLong("ID"));
                produto.setNome(resultSet.getString("NOME"));
                produto.setIdMarca(resultSet.getLong("ID_MARCA"));
                produto.setIdDept(resultSet.getLong("ID_DEPT"));
                produtos.add(produto);
                    
            }
            return produtos;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
