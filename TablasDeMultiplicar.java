/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablasdemultiplicar;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class TablasDeMultiplicar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de la tabla
        System.out.print("Ingrese el número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Mostrar la tabla de multiplicar para el número ingresado
        mostrarTablaMultiplicar(numero);

       
        scanner.close();
    }

    // Método para mostrar la tabla de multiplicar
    public static void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");

        // mostrar los resultados
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}

    

