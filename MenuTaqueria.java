/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menutaqueria;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class MenuTaqueria {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("----- Menú de Taquería -----");
            
            System.out.println("1. Taco al pastor");
            System.out.println("2. Taco de bistec");
            System.out.println("3. Taco de pollo");
            System.out.println("4. Salir");

            
            System.out.print("Ingrese el número de la opción deseada: ");
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Taco al pastor. ¡Disfrute su Comida");
                    break;
                case 2:
                    System.out.println("Has seleccionado Taco de bistec. ¡Disfrute su Comida!");
                    break;
                case 3:
                    System.out.println("Has seleccionado Taco de pollo. ¡Disfrute su Comida!");
                    break;
                case 4:
                    System.out.println("Saliendo del menú. Excelente Provecho");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

    

