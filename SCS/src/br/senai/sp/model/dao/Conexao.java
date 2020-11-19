/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Marcos
 */
public class Conexao {
    
    public Connection getConnection(){
        try{	
            String path = System.getProperty("user.dir");
            String partialPath = "/DB/";
            path = path.replace("\\", "/");
            return DriverManager.getConnection("jdbc:sqlite:" + path + partialPath + "SCSDB.db");	
	}
	catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
