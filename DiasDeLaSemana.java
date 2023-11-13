/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diasdelasemana;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class DiasDeLaSemana {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número del 1 al 7: ");
        
        int numeroDia = scanner.nextInt();

        
        switch (numeroDia) {
            case 1:
                System.out.println("Hola, soy el día lunes.");
                break;
                
            case 2:
                System.out.println("Hola, soy el día martes.");
                break;
                
            case 3:
                System.out.println("Hola, soy el día miércoles.");
                break;
                
            case 4:
                System.out.println("Hola, soy el día jueves.");
                break;
                
            case 5:
                System.out.println("Hola, soy el día viernes.");
                break;
                
            case 6:
                System.out.println("Hola, soy el día sábado.");
                break;
                
            case 7:
                System.out.println("Hola, soy el día domingo.");
                break;
                
            default:
                System.out.println("Número no válido. Ingrese un número del 1 al 7.");
        }

        scanner.close();
    }
}
    

