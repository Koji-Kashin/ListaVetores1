/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc23;
import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] estados = new String[3][2]; // Matriz de estado e capital

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do estado " + (i + 1) + ": ");
            estados[i][0] = ler.nextLine();
            System.out.print("Digite a capital do estado " + (i + 1) + ": ");
            estados[i][1] = ler.nextLine();
        }

        System.out.println("\nEstados e suas capitais:");
        for (int i = 0; i < 3; i++) {
            System.out.println(estados[i][0] + " - " + estados[i][1]);
        }
    }
}
