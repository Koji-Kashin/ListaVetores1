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
public class Exc_14 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dias_ano = 365;

        float[] temp = new float[dias_ano];

        System.out.println("Insira a temperatura media de cada dia do ano ");
        for (int i = 0; i < dias_ano; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temp[i] = ler.nextFloat();
        }

        float TempMin = temp[0];
        float TempMax = temp[0];
        float soma_temperaturas = 0;
        int abaixoMedia = 0;

        for (int i = 0; i < dias_ano; i++) {
            if (temp[i] < TempMin) {
                TempMin = temp[i];
            }
            if (temp[i] > TempMax) {
                TempMax = temp[i];
            }
            soma_temperaturas += temp[i];
        }

        float temp_MediaAno = soma_temperaturas / dias_ano;

        for (int i = 0; i < dias_ano; i++) {
            if (temp[i] < temp_MediaAno) {
                abaixoMedia++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Menor temperatura do ano: " + TempMin);
        System.out.println("Maior temperatura do ano: " + TempMax);
        System.out.println("Temperatura média anual: " + temp_MediaAno);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + abaixoMedia);
    }
}
