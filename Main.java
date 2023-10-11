/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3practica;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int numero,fibo1,fibo2,i;
    
     do{
         
    System.out.print("Introduce un numero elementos requeridos: ");
    numero = sc.nextInt();
     }while(numero<=1);
     
     System.out.println("Los " + numero + " primeros numeros de la serie son:");
     
     fibo1=0;
     fibo2=1;
     
        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
     }
        System.out.println();   
    }  
}
