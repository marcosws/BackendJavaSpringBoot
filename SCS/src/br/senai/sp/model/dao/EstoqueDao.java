/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import br.senai.sp.model.entity.Estoque;
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
public class EstoqueDao {
    
    private Connection connection;
    
    public void inserir(Estoque estoque){
        
        this.connection = new Conexao().getConnection();
        String sql = "INSERT INTO ESTOQUE (EMPRESA) VALUES (?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setLong(1, estoque.getQuantidade());
            stmt.execute();
            stmt.close();	
            this.connection.close();
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void alterar(Estoque estoque){
        
        this.connection = new Conexao().getConnection();
        String sql = "UPDATE ESTOQUE SET QUANTIDADE=? WHERE ID=?;";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setLong(1, estoque.getQuantidade());
            stmt.setLong(3, estoque.getId());
            stmt.execute();
            stmt.close();	
            this.connection.close();
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void excluir(Estoque estoque){
        
        this.connection = new Conexao().getConnection();
        try{
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM ESTOQUE WHERE ID=?");
            stmt.setLong(1, estoque.getId());
            stmt.execute();
            stmt.close();
            this.connection.close();
        }
	catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public Estoque consultar(long id){
        
        this.connection = new Conexao().getConnection();
        Estoque estoque = new Estoque();
        try{
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM ESTOQUE WHERE ID=?"); 
            ptmt.setLong(1,id);
            ResultSet resultSet = ptmt.executeQuery();
            resultSet.next();
            estoque.setId(resultSet.getLong("ID"));
            estoque.setQuantidade(resultSet.getLong("QUANTIDADE"));
           
            resultSet.close();
            this.connection.close();
            return estoque;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    public List<Estoque> consultar(){
        
        this.connection = new Conexao().getConnection();
        try{
            List<Estoque> estoques = new ArrayList<Estoque>();
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM ESTOQUE;");
            ResultSet resultSet = ptmt.executeQuery();
               
            while(resultSet.next()){
                    
                Estoque estoque = new Estoque(); 
                estoque.setId(resultSet.getLong("ID"));
                estoque.setQuantidade(resultSet.getLong("QUANTIDADE"));
                estoques.add(estoque);
                    
            }
            this.connection.close();
            return estoques;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
}
