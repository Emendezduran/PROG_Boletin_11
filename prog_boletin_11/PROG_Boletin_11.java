/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_11;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class PROG_Boletin_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ESCRIBE A SEGUINTE FRASE : \n"
                + "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");

        System.out.println("\n\"PREME ENTER PARA REMATAR\"");

        long inicio = System.currentTimeMillis();

        String frase = scan.next();

        long finalizado = System.currentTimeMillis();

        float totalTime = (finalizado - inicio) / 1000f;

        System.out.println("Tardastes: " + totalTime + " segundos en terminar");
    }

}
