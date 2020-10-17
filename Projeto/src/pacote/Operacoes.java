/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

/**
 *
 * @author FIC
 */
public class Operacoes {

    public static void main(String[] args) {

        double db1 = 13, db2 = 2;

        System.out.println("Soma:            (db1 + db2): " + (db1 + db2));
        System.out.println("Subtração:       (db1 - db2): " + (db1 - db2));
        System.out.println("Multiplicação:   (db1 * db2): " + (db1 * db2));
        System.out.println("Divisão:         (db1 / db2): " + (db1 / db2));
        System.out.println("Modulo:          (db1 % db2): " + (db1 % db2));

        db1++;
        db2--;

        System.out.println("db1 = " + db1);
        System.out.println("db2 = " + db2);

        double val = 2;

        System.out.println(val += 2);
        System.out.println(val -= 3);
        System.out.println(val *= 2);
        System.out.println(val /= 2);
        System.out.println(val %= 2);

    }

}
