/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avulso;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author FIC
 */
public class Geral {
    
    public static void main(String[] args) {
        
        List<Usuario> usuarios = new ArrayList();
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("Marcos");
        usuarios.add(usuario);
        Usuario usuario1 = new Usuario();
        usuario1.setId(2);
        usuario1.setNome("João");
        usuarios.add(usuario1);
        usuarios.forEach((Usuario e) -> {
            System.out.println("id: " + e.getId());
            System.out.println("Nome: " + e.getNome());
            System.out.println("=================================");
        });
    }
    
}
