/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avulso;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class UsaHashCrip {
    
    public static void main(String[] args) {
        
        String input = "admin";
        String hash = "";
        
        hash = encryptThisString(input);
        System.out.println("hash1: " + hash);
        hash = "";
        
       
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.reset();
            try {
                messageDigest.update(input.getBytes("utf8"));
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            hash = String.format("%0128x", new BigInteger(1, messageDigest.digest()));
            System.out.println("hash2: " + hash);
            
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
        
    }
    
    public static String encryptThisString(String input) 
    { 
        try { 
            // getInstance() method is called with algorithm SHA-512 
            MessageDigest md = MessageDigest.getInstance("SHA-512"); 
  
            // digest() method is called 
            // to calculate message digest of the input string 
            // returned as array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
  
            // Add preceding 0s to make it 32 bit 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            // return the HashText 
            return hashtext; 
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    
}
