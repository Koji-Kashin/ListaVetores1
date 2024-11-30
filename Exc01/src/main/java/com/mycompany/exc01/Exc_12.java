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
public class Exc_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[20];

        System.out.print("Digite 20 numeros: ");
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1 ) + " Numero: \n");
            num[i] = ler.nextInt();
        }

        System.out.println("Numeros na ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }
}
