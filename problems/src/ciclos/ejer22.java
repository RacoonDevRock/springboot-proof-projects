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
public class ejer22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int nota;
        boolean alumnoSuspendido = false;
        
        System.out.println("NOTA MAXIMA = 10 | NOTA MINIMA = 0");
        
        for (int i = 1; i <= 5; i++) {
            do {                
                System.out.print("Ingrese nota: ");
                nota = s.nextInt();
            } while (nota < 0 || nota > 10);
            
            if (nota < 5) {
                alumnoSuspendido = true;
            }
            
        }
        
        if (alumnoSuspendido == true) {
            System.out.println("SI, existe alumno(s) suspendido(s)");
        } else {
            System.out.println("NO, existe alumno(s) suspendido(s)");
        }
        
    }
}
