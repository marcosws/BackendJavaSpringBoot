/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.dao;

import br.senai.sp.model.entity.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FIC
 */
public class AlunoDao {
    
    /**
     *
     * @param aluno
     * @return
     * @throws SQLException
     */
    
    Conecta conecta = new Conecta();
    
    public String inserirAluno(Aluno aluno) throws SQLException{
        return null;
        
 /*       String resp = "";
        try{
                Connection con;
            con = conecta.getConexao();
                String sql = "INSERT INTO DADOS(RGM, NOME NOTA1, NOTA2) VALUES(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, aluno.getRgm());
                ps.setString(2, aluno.getNome());
                ps.setFloat(3, aluno.getNota1());
                ps.setFloat(4, aluno.getNota2());
                ps.execute();
                ps.close();
            }
            return "OK";
        }
        catch(SQLException e){
            e.printStackTrace();
        }  */
         
    }
    public String alterarAluno(Aluno aluno) {
        return null;
        
  /*      String resp = "";
        Connection con = Conecta.getConexao();
        
        String sql = "UPDATE DADOS SET  NOME, NOTA1, NOTA2 WHERE RGM = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setFloat(2, aluno.getNota1());
            ps.setFloat(3, aluno.getNota2());
            ps.setString(4, aluno.getRgm());
            ps.execute();
            ps.close();
            con.close();
            resp = "OK";    
        } 
        catch (SQLException e) {
            resp = "ERRO: " + e.getMessage();
        }
        return resp;*/
            
    }
    public String excluirAluno(Aluno aluno){
        return null;
        
  /*      String resp = "";
        Connection con = Conecta.getConexao();
        
        String sql = "DELETE FROM DADOS WHERE RGM=?";
        PreparedStatement ps;
        try{
             ps = con.prepareStatement(sql);
             ps.setString(1, aluno.getNome());
        }
        catch(SQLException e){
            resp = "ERRO: " + e.getMessage();
        }
        return resp; */
    }
    
    public ArrayList<Aluno> getAlunos(){
        
   /*     ArrayList<Aluno> lista = new ArrayList<Aluno>();
        try{

            Connection con = Conecta.getConexao();
            
      
            PreparedStatement ptmt = con.prepareStatement("SELECT * FROM DADOS;");
            ResultSet rs = ptmt.executeQuery();

            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setRgm(rs.getString("RGM"));
                aluno.setNome(rs.getString("NOME"));
                aluno.setNota1(rs.getFloat("NOTA1"));
                aluno.setNota2(rs.getFloat("NOTA2"));

                lista.add(aluno);
            }
            rs.close();
            ptmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }*/
        return null;
    
    }
    public Aluno consultarAluno(String rgm) {
        return null;
    /*    Aluno aluno = new Aluno();
        try {
            try (Connection con = Conecta.getConexao()) {
                Statement stmt = con.createStatement();
                String sql = "SELECT * FROM dados WHERE rgm='" + rgm + "'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()) {
                    aluno.setRgm(rs.getString("rgm"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setNota1(rs.getFloat("nota1"));
                    aluno.setNota2(rs.getFloat("nota2"));
                }
                else {
                    aluno.setRgm("");
                    aluno.setNome("Nao encontrado");
                    aluno.setNota1(0);
                    aluno.setNota2(0);
                }
                
                rs.close();
                stmt.close();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return aluno; */
    }

}
