/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaciculo;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class AreaCiculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}

