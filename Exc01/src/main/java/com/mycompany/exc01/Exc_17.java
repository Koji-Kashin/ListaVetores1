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
public class Exc_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] nums = new int[30];
        System.out.print("Digite 30 numeros: ");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = ler.nextInt();
        }

        System.out.print("Digite um numero para contar quantas vezes ele aparece no vetor: ");
        int numCount = ler.nextInt();

        int cont = 0;
        for (int i = 0; i < 30; i++) {
            if (nums[i] == numCount) {
                cont++;
            }
        }

        System.out.println("O número " + numCount + " aparece " + cont + " vezes no vetor.");

    }
}
