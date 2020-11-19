/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import br.senai.sp.model.entity.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcos
 */
public class DepartamentoDao {
    
    private final Connection connection;
    public DepartamentoDao(){
	this.connection = new Conexao().getConnection();
    }
    
    public void inserir(Departamento departamento){
        
        String sql = "INSERT INTO DEPARTAMENTO (NOME) VALUES (?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setString(1, departamento.getNome());
            stmt.execute();
            stmt.close();	
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
    }
    public void alterar(Departamento departamento){
        String sql = "UPDATE DEPARTAMENTO SET NOME=? WHERE ID=?;";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setString(1, departamento.getNome());
            stmt.setLong(2, departamento.getId());
            stmt.execute();
            stmt.close();	
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
    }
    public void excluir(Departamento departamento){
        try{
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM DEPARTAMENTO WHERE ID=?");
            stmt.setLong(1, departamento.getId());
            stmt.execute();
            stmt.close();
        }
	catch(SQLException e){
            throw new RuntimeException(e);
	}
    }
    public Departamento consultar(long id){
        
        Departamento departamento = new Departamento();
        try{
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM DEPARTAMENTO WHERE ID = ?"); 
            ptmt.setString(1,Long.toString(id));
            ResultSet resultSet = ptmt.executeQuery();
                
            resultSet.first();  
            departamento.setId(resultSet.getLong("ID"));
            departamento.setNome(resultSet.getString("NOME"));
            return departamento;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public List<Departamento> consultar(){
    
        try{
            List<Departamento> departamentos = new ArrayList<Departamento>();
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM DEPARTAMENTO;");
            ResultSet resultSet = ptmt.executeQuery();
                
            while(resultSet.next()){
                    
                Departamento departamento = new Departamento();
                departamento.setId(resultSet.getLong("ID"));
                departamento.setNome(resultSet.getString("NOME"));
                departamentos.add(departamento);
                    
            }
            return departamentos;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
