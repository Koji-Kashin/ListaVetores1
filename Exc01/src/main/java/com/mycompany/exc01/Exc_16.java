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
public class Exc_16 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

        int[] V1 = new int[15];
        int[] V2 = new int[15];
        int contPosicao_igual = 0;
        int contNum_reptds = 0;

        System.out.println("Insira 15 numeros no vetor V1: ");
        for (int i = 0; i < V1.length; i++) {
            System.out.print((i + 1) + "ª posicao de V1: ");
            V1[i] = ler.nextInt();
        }

        System.out.println("Insira 15 numeros no vetor V2: ");
        for (int i = 0; i < V2.length; i++) {
            System.out.print((i + 1) + "ª posicao de V2: ");
            V2[i] = ler.nextInt();
        }

        for (int i = 0; i < V1.length; i++) {
            if (V1[i] == V2[i]) {
                contPosicao_igual++;
            }
        }

        for (int i = 0; i < V1.length; i++) {
            for (int j = 0; j < V2.length; j++) {
                if (V1[i] == V2[j]) {
                    contNum_reptds++;
                    break;
                }
            }
        }

        System.out.println("Numero de vezes os vetores V1 e V2 tem os mesmos numeros na mesma posicao: " + contPosicao_igual);
        System.out.println("Quantidade de vezes que V1 e V2 tem os mesmos numeros na mesma posicao ou nao: " + contNum_reptds);
    }
}
