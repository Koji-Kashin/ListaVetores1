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
public class Exc_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vet = new int[50];
        System.out.print("Insira 50 numeros no vetor: ");
        for (int i = 0; i < 50; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vet[i] = ler.nextInt();
        }
        System.out.println("\nNúmeros repetidos e suas posições:");
        boolean numRep = false;
        for (int i = 0; i < 50; i++) {
            int numAtual = vet[i];
            boolean numeroRepetido = false;

            for (int j = i + 1; j < 50; j++) {
                if (vet[j] == numAtual) {
                    if (!numeroRepetido) {

                        System.out.print("Número " + numAtual + " está nas posições: ");
                        System.out.print(i + 1 + " ");
                        numeroRepetido = true;
                    }
                    System.out.print(j + 1 + " ");
                }
            }

            if (numeroRepetido) {
                numRep = true;
                System.out.println();
            }
        }

        if (!numRep) {
            System.out.println("Não há números repetidos no vetor.");
        }

    }
}
