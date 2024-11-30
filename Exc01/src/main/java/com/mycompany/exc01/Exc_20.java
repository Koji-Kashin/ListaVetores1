/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

import java.util.Scanner;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc_20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numNúmeros = 1000;

     
        int[] numeros = new int[numNúmeros];

        
        System.out.println("Digite 1000 numeros:");

        for (int i = 0; i < numNúmeros; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }

        // A) Números na ordem inversa
        System.out.println("Numeros na ordem inversa:");
        for (int i = numNúmeros - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        // b) Números ímpares
        System.out.println("Numeros ímpares digitados:");
        for (int i = 0; i < numNúmeros; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // c) Numeros 10 a 50 (10 e 50 incluidos)
        System.out.println("Numeros entre 10 e 50:");
        for (int i = 0; i < numNúmeros; i++) {
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
