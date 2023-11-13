/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dafichadecontacto;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class FichaContacto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame tu edad");
        String edad = scanner.nextLine();
        
        System.out.println("Dame tu nombre");
        String nombre = scanner.nextLine();
        
        System.out.println("Damme tu numero de telefono");
        String telefono = scanner.nextLine();
        
        System.out.println("Ingrese su correo electronico");
        String correo = scanner.nextLine();
        
        
        
        System.out.println("\nFicha de Contacto:");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
      
        
        scanner.close();
        
    }
}
    

