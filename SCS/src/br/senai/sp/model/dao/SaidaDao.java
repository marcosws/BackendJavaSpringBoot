/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import br.senai.sp.model.entity.Saida;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class SaidaDao {

    private Connection connection;
    
    public void inserir(Saida saida){
        
        this.connection = new Conexao().getConnection();
        String sql = "INSERT INTO SAIDA (DT, ID_COMPRA, ID_ESTOQUE, ID_PRODUTO) VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setDate(1, new Date(saida.getData().getTimeInMillis()));
            stmt.setLong(2, saida.getIdCompra());
            stmt.setLong(3, saida.getIdEstoque());
            stmt.setLong(4, saida.getIdProduto());
            stmt.execute();
            stmt.close();	
            this.connection.close();
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
        
    }
    public void alterar(Saida saida){
        
        this.connection = new Conexao().getConnection();
        String sql = "UPDATE SAIDA SET DT=?, ID_COMPRA=?, ID_ESTOQUE=?, ID_PRODUTO=? WHERE ID=?;";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);	
            stmt.setDate(2, new Date(saida.getData().getTimeInMillis()));
            stmt.setLong(2, saida.getIdCompra());
            stmt.setLong(2, saida.getIdEstoque());
            stmt.setLong(2, saida.getIdProduto());
            stmt.setLong(4, saida.getId());
            stmt.execute();
            stmt.close();	
            this.connection.close();
	}
        catch(SQLException e){
            throw new RuntimeException(e);
	}
    }
    public void excluir(Saida saida){
                this.connection = new Conexao().getConnection();
        try{
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM SAIDA WHERE ID=?");
            stmt.setLong(1, saida.getId());
            stmt.execute();
            stmt.close();
            this.connection.close();
        }
	catch(SQLException e){
            throw new RuntimeException(e);
	}
    }
    public Saida consultar(long id){
        
        this.connection = new Conexao().getConnection();
        Saida saida = new Saida();
        try{
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM SAIDA WHERE ID=?"); 
            ptmt.setLong(1,id);
            ResultSet resultSet = ptmt.executeQuery();
            resultSet.next();
            saida.setId(resultSet.getLong("ID"));
            Calendar data = Calendar.getInstance();
            data.setTime(resultSet.getDate("DT"));
            saida.setData(data);
            saida.setIdCompra(resultSet.getLong("ID_COMPRA"));
            saida.setIdEstoque(resultSet.getLong("ID_ESTOQUE"));
            saida.setIdProduto(resultSet.getLong("ID_PRODUTO"));
            
            resultSet.close();
            this.connection.close();
            return saida;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    public List<Saida> consultar(){
        
        this.connection = new Conexao().getConnection();
        try{
            List<Saida> saidas = new ArrayList<Saida>();
            PreparedStatement ptmt = this.connection.prepareStatement("SELECT * FROM SAIDA;");
            ResultSet resultSet = ptmt.executeQuery();
              
            while(resultSet.next()){
                    
                Saida saida = new Saida();  
                saida.setId(resultSet.getLong("ID"));
                Calendar data = Calendar.getInstance();
                data.setTime(resultSet.getDate("DT"));
                saida.setData(data);
                saida.setIdCompra(resultSet.getLong("ID_COMPRA"));
                saida.setIdEstoque(resultSet.getLong("ID_ESTOQUE"));
                saida.setIdProduto(resultSet.getLong("ID_PRODUTO"));
                saidas.add(saida);
                    
            }
            this.connection.close();
            return saidas;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
}
