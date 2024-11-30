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
public class Exc_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Array = new int[1000];
        int[] CopiaArray = new int[1000];

        System.out.println("Digite 1000 numeros inteiros:");
        for (int i = 0; i < 1000; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            Array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 1000; i++) {
            CopiaArray[i] = Array[i];
        }

        System.out.println("Array copiado com sucesso! Aqui estão os primeiros 10 elementos do array copiado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(CopiaArray[i] + " ");
        }
    }
}
