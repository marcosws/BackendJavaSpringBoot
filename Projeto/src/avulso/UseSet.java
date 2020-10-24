/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avulso;

import java.util.Set;
import java.util.HashSet;



/**
 * @author FIC
 */
public class UseSet {
    
    public static void main(String[] args){
        
        Set<String> nomes = new HashSet();
        nomes.add("nor");
        nomes.add("xor");
        nomes.add("or");
        nomes.forEach(System.out::println);
        
    }
    
}