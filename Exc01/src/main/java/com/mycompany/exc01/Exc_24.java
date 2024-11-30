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
public class Exc_24 {

    public static void main(String[] args) {

        System.out.print("Digite o valor do Kw: ");
        Scanner ler = new Scanner(System.in);

        double valorKw = ler.nextDouble();
        ler.nextLine();

        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite o nome do consumidor: ");
            String nome = ler.nextLine();

            System.out.print("Agora, digite a quantidade de Kw consumidos por " + nome + ": ");
            double kwConsumidos = ler.nextDouble();
            ler.nextLine();

            double totalPagar = kwConsumidos * valorKw;

            System.out.println("Nome: " + nome + " - Total a pagar: R$ " + totalPagar);

            System.out.print("Deseja cadastrar outro consumidor? (S/N): ");
            String resposta = ler.nextLine();
            if (resposta.equals("N")) {
                continuar = false;
            }
        }

    }
}
