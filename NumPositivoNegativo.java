/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numpositivonegativo;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class NumPositivoNegativo {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es positivo o negativo y mostrar el resultado
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        scanner.close();
    }
}
    

