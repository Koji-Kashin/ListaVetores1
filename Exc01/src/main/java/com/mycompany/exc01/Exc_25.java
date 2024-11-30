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
public class Exc_25 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.print("Digite o número de um mes (1-12): ");
        int mesNumero = ler.nextInt();

        if (mesNumero >= 1 && mesNumero <= 12) {

            System.out.println("O mes é: " + meses[mesNumero - 1]);
        } else {

            System.out.println("Numero invalido! O mês deve estar entre 1 e 12.");
        }

    }
}
