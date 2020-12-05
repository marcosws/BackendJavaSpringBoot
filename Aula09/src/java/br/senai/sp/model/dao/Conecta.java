/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author FIC
 */
public class Conecta {
    
    private Properties connectionProperties = new Properties();
    
    public  Connection getConexao(){

        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        connectionProperties = config.toProperties();
        String strConexao = "jdbc:sqlite:C:/Users/Public/Documents/Backend_Java_SpringBoot/BackendJavaSpringBoot/Aula09/db/aula09.db";
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            
        }
        try{	
            return DriverManager.getConnection(strConexao,connectionProperties);	
	}
	catch(SQLException e){
            e.printStackTrace();
        }
        return null;
        
        
        
    }
    
}
