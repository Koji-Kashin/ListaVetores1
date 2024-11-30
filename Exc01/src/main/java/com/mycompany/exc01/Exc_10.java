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
public class Exc_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[20];

        int posi = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Preencha o vetor com números inteiros");
            vetor[i] = ler.nextInt();
            if (vetor[i] < 0) {
                System.out.println("Invalido, numeros negativos nao sao permitidos");
                i--;
            }
        }
        int menor_valor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor_valor) {
                menor_valor = vetor[i];
                posi = i;
            }
        }

        System.out.println("O menor valor encontrado no vetor é " + menor_valor + " na posição " + posi);
    }
}
