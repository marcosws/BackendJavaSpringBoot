/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import br.senai.sp.model.entity.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcos
 */
public class MarcaDao {
    
    private final Connection connection;
    public MarcaDao(){
	this.connection = new Conexao().getConnection();
    }
    
    public void inserir(Marca marca){
        
        String sql = "INSERT INTO MARCA (NOME, EMPRESA) VALUES (?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setString(1, marca.getNome());
            stmt.setString(2, marca.getEmpresa());
            stmt.execute();
            stmt.close();	
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void alterar(Marca marca){
        
        String sql = "UPDATE MARCA SET NOME=?, EMPRESA=? WHERE ID=?;";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setString(1, marca.getNome());
            stmt.setString(2, marca.getEmpresa());
            stmt.setLong(3, marca.getId());
            stmt.execute();
            stmt.close();	
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void excluir(Marca marca){
        
        try{
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM MARCA WHERE ID=?");
            stmt.setLong(1, marca.getId());
            stmt.execute();
            stmt.close();
        }
	catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public Marca consultar(long id){
        
        Marca marca = new Marca();
        
        try{
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM MARCA WHERE ID = ?"); 
            ptmt.setString(1,Long.toString(id));
            ResultSet resultSet = ptmt.executeQuery();
                
            resultSet.first();  
            marca.setId(resultSet.getLong("ID"));
            marca.setNome(resultSet.getString("NOME"));
            marca.setEmpresa(resultSet.getString("EMPRESA"));
            return marca;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }

    }
    public List<Marca> consultar(){
        
        try{
            List<Marca> marcas = new ArrayList<Marca>();
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM MARCA;");
            ResultSet resultSet = ptmt.executeQuery();
                
            while(resultSet.next()){
                    
                Marca marca = new Marca();
                marca.setId(resultSet.getLong("ID"));
                marca.setNome(resultSet.getString("NOME"));
                marca.setEmpresa(resultSet.getString("EMPRESA"));
                marcas.add(marca);
                    
            }
            
            return marcas;
        }
        catch(SQLException e){
            System.out.println("deu erro aqui");
            throw new RuntimeException(e);
        }
    }
    
}
