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
public class Exc_26 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[100];

        System.out.println("Digite 100 numeros inteiros:");
        for (int i = 0; i < 100; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }

        System.out.print("Digite o numero que deseja procurar: ");
        int numeroProcurado = ler.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == numeroProcurado) {
                System.out.println("Numero encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Numero não encontrado.");
        }
    }

}
