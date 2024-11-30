/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

/**
 *
 * @author d.rodrigues
 */
public class Exc04 {

    public static void main(String[] args) {
        int[] quadrados = new int[10];
        int index = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                quadrados[index] = i * i;
                index++;
            }
        }

        System.out.println("Quadrados dos numeros impares de 1 a 20:");
        for (int i = 0; i < quadrados.length; i++) {
            System.out.println("Quadrado de " + (2 * i + 1) + " = " + quadrados[i]);
        }
    }

}
