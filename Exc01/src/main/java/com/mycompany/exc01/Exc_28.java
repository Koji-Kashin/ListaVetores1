/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc_28 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }

        Arrays.sort(numeros);

        // Exibir o vetor ordenado
        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
