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
public class Exc_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[20];
        int newVet[];
        int num;
        boolean encontrado = false;

        System.out.println("Insira 20 numeros INTEIROS no vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i + 1) + "o numero: ");
            vetor[i] = ler.nextInt();
        }

        System.out.println("Digite o numero que deseja encontrar: ");
        num = ler.nextInt();

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == num) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            newVet = new int[vetor.length - 1];
            int j = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != num) {
                    newVet[j] = vetor[i];
                    j++;
                }
            }
            System.out.println("Novo vetor sem número " + num + ":");
            for (int n : newVet) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Sinto muito, o número " + num + " não foi encontrado.");
        }
    }
}
