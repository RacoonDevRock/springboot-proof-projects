/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class ejer14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double sueldo, sumaSueldo = 0;
        int contadorSueldo = 0;
        
        System.out.println("INGRESE 10 SUELDOS...");
                
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese sueldo: ");
            sueldo = s.nextDouble();
            
            if (sueldo > 1000) {
                contadorSueldo++;
            }
            
            sumaSueldo += sueldo;
            
        }
        
        System.out.println("La suma de los 10 sueldos es: $"+sumaSueldo);
        System.out.println("Hay "+contadorSueldo+" sueldos mayores a $1000");
    }
}
