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
public class Exc_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira os tamanhos desejado para os vetores A e B : ");
        int N = ler.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] soma = new int[N];

        System.out.println("Digite os numeros no vetor (A):");
        for (int i = 0; i < N; i++) {
            System.out.print("A" + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        System.out.println("Digite os numeros contidos no vetor (B):");
        for (int i = 0; i < N; i++) {
            System.out.print("B" + (i + 1) + ": ");
            B[i] = ler.nextInt();
        }

        for (int i = 0; i < N; i++) {
            soma[i] = A[i] + B[i];
        }

        System.out.println("A soma dos Vetores A e B: ");
        for (int i = 0; i < N; i++) {
            System.out.println("Soma[" + (i + 1) + "] = " + soma[i]);
        }

    }
}
