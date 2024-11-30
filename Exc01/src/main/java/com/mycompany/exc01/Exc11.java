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
public class Exc11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] M = new int[10];
        int X;

        System.out.println("Insira 10 numeros no vetor ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + " numero desejado: ");
            A[i] = ler.nextInt();
        }

        System.out.print("Por qual valor estes numeros serao multiplicados?: ");
        X = ler.nextInt();

        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("Resultado da multiplicação dos numeros foi: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Multiplicando " + A[i] + " x " + X + " = " + M[i]);
        }


    }
}
