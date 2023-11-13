/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialnumero;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class FactorialNumero {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número para calcular el factorial: ");
        int numero = scanner.nextInt();

        
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    // metodo para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
    
5
