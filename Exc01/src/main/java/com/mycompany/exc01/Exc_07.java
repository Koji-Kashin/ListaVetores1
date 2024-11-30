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
public class Exc_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] nome = new String[10];

        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite um nome:");
            nome[i] = ler.nextLine();
        }
        System.out.println("Agora, digite o nome de quem deseja encontrar:");
        String buscar = ler.nextLine();

        for (int i = 0; i <= 9; i++) {
            if (nome[i].equals(buscar)) {
                System.out.println("Encontrei " + nome[i]+ " na " + (i + 1) + " coluna");
                break;
            } else {
                if (i == 9) {
                    System.out.println("Fulaninho nao encontrado");
                }
            }
        }
    }
}
