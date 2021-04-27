/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolecolor;

/**
 *
 * @author Marcos
 */
public class TestColor {
    
    	private static final String ANSI_RED    = "\u001B[31m";
	private static final String ANSI_GREEN  = "\u001B[32m";
	private static final String ANSI_BLUE   = "\u001B[34m";
	private static final String ANSI_RESET  = "\u001B[0m";
	private static final String RED = "\033[0;31m";    
	private static final String GREEN = "\033[0;32m";  
	private static final String BLUE = "\033[0;34m";    
	private static final String RESET = "\033[0m";  
        
    public static void main(String[] args) {
        
        System.out.println(RED + "Cor 1" + RESET);
        System.out.println(GREEN + "Cor 2" + RESET);
        System.out.println(BLUE + "Cor 3" + RESET);
        
    }
    
    
    
}
