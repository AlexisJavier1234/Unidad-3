/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner lecturaDatos = new Scanner(System.in);
     System.out.println("Ingrese un numero entero");
      int numero = lecturaDatos.nextInt();
      
    if(numero %2 ==0){  
System.out.println("el numero "+numero+" es par ");
    }else {
        System.out.println("el numero es impar");
    }
}
}