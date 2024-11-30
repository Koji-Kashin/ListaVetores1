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
public class Exc_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numPessoas = 250;

        String[] nomes = new String[numPessoas];
        double[] alturas = new double[numPessoas];
        double[] pesos = new double[numPessoas];
        char[] sexos = new char[numPessoas];

        // Armazenar estatísticas
        int qtdHomens = 0, qtdMulheres = 0;
        double somaPesos = 0;
        double maiorAltura = 0;
        String nomeMaiorAltura = "";

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Pessoa " + (i + 1));

            System.out.print("Digite o nome: ");
            nomes[i] = ler.nextLine();

            System.out.print("Agora, digite a altura (em metros): ");
            alturas[i] = ler.nextDouble();

            System.out.print("Digite seu peso (em kg): ");
            pesos[i] = ler.nextDouble();

            System.out.print("Por fim digite seu sexo (M para masculino, F para feminino): ");
            sexos[i] = ler.next().charAt(0);
            ler.nextLine();

            
            if (sexos[i] == 'M' || sexos[i] == 'm') {
                qtdHomens++;
            } else if (sexos[i] == 'F' || sexos[i] == 'f') {
                qtdMulheres++;
            }

            somaPesos += pesos[i];

           
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
                nomeMaiorAltura = nomes[i];
            }
        }

        // A) Listar todas as pessoas
        System.out.println("Listagem de todas as pessoas:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println(nomes[i] + " - Altura: " + alturas[i] + "m, Peso: " + pesos[i] + "kg, Sexo: " + sexos[i]);
        }

        // B) Quantidade de homens e mulheres e o seu percentual
        System.out.println("\nQuantidade de homens e mulheres:");
        System.out.println("Homens: " + qtdHomens);
        System.out.println("Mulheres: " + qtdMulheres);
        System.out.println("Percentual de homens: " + (qtdHomens * 100.0 / numPessoas) + "%");
        System.out.println("Percentual de mulheres: " + (qtdMulheres * 100.0 / numPessoas) + "%");

        // C) Média de peso do grupo de pessoas
        double mediaPeso = somaPesos / numPessoas;
        System.out.println("\nMédia de peso: " + mediaPeso + "kg");

        // D) Nome da pessoa mais alta do grupo
        System.out.println("\nA pessoa mais alta é: " + nomeMaiorAltura + " com " + maiorAltura + " metros.");

    }
}
