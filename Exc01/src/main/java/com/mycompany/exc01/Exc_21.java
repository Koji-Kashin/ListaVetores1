/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc_21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        double somaSalarios = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do funcionario: ");
            String nome = ler.nextLine();

            System.out.print("Agora, digite o salario de " + nome + ": ");
            double salario = ler.nextDouble();
            ler.nextLine();

            nomes.add(nome);
            salarios.add(salario);

            somaSalarios += salario;

            System.out.print("Deseja cadastrar outro funcionario? (S/N): ");
            String resposta = ler.nextLine();
            if (resposta.equals("N") && resposta.equals("n")) {
                continuar = false;
            }
        }

        double mediaSalarial = somaSalarios / salarios.size();

        // A) Exibe nome e salário dos funcionarios acima da média salarial
        System.out.println("\nFuncionários que recebem acima da média salarial (" + mediaSalarial + "):");
        for (int i = 0; i < nomes.size(); i++) {
            if (salarios.get(i) > mediaSalarial) {
                System.out.println(nomes.get(i) + " - " + salarios.get(i));
            }
        }

        // B) Exibe nomes de todos os funcionarios que começam com a letra A
        System.out.println("\nFuncionários cujo nome começa com a letra 'A':");
        for (String nome : nomes) {
            if (nome.toUpperCase().startsWith("A")) {
                System.out.println(nome);
            }
        }

    }
}
