/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();
        double somaValores = 0;
        int contador = 0;

        // Leitura dos produtos
        while (true) {
            System.out.print("Digite a descricao do produto (ou '0' para finalizar): ");
            String descricao = ler.nextLine();
            if (descricao.equals("0")) { // Encerrar
                break;
            }

            System.out.print("Digite o valor do produto: ");
            double valor = ler.nextDouble();
            ler.nextLine();

            descricoes.add(descricao);
            valores.add(valor);
            somaValores += valor;
            contador++;
        }

        // Média dos valores
        double mediaValores = somaValores / contador;

        // A - Exibir produtos com valor abaixo da média
        System.out.println("\nProdutos com valor abaixo da media (R$ " + mediaValores + "):");
        for (int i = 0; i < descricoes.size(); i++) {
            if (valores.get(i) < mediaValores) {
                System.out.println(descricoes.get(i) + " - R$ " + valores.get(i));
            }
        }

        // B - Exibir produtos por caracter
        System.out.print("\nDigite um caractere para filtrar por este caracter: ");
        char letra = ler.nextLine().charAt(0);

        System.out.println("\nProdutos que começam com '" + letra + "':");
        for (int i = 0; i < descricoes.size(); i++) {
            if (descricoes.get(i).toLowerCase().charAt(0) == Character.toLowerCase(letra)) {
                System.out.println(descricoes.get(i));
            }
        }
    }
}
