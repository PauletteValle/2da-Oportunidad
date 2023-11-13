/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosprimos2y500;

/**
 *
 * @author moram
 */
public class NumerosPrimos2y500 {

    public static void main(String[] args) {
          
        System.out.println("Números primos entre 2 y 500:");

        for (int i = 2; i <= 500; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    

