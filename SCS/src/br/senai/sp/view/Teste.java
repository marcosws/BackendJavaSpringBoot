/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import br.senai.sp.model.dao.MarcaDao;
import br.senai.sp.model.entity.Marca;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Teste {
    
    public static void main(String[] args) {
        System.out.println("Dir: " + System.getProperty("user.dir"));
        MarcaDao marcaDao = new MarcaDao();
        int linha = 0;
        List<Marca> marcas = marcaDao.consultar();
        for(Marca m: marcas){
            System.out.println("ID:" + m.getId());
            System.out.println("linha:" + linha);
            linha++;
        }
    //}
        //marcaDao.consultar().forEach((e) ->{
        //    System.out.println(e.getId() +  " " + e.getNome());
       // });
    }
    
}
