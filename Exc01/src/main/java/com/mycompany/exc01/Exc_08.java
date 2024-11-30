/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd_alunos = 20;
        Float[] aluno = new Float[qtd_alunos];
        Float total = 0f;
        Float media = 0f;
        int acima = 0;

        for (int i = 0; i <= (qtd_alunos - 1); i++) {
            System.out.print("Insira a nota do aluno:");
            aluno[i] = ler.nextFloat();
            total = total + aluno[i];
        }
        media = total / qtd_alunos;
        for (int i = 0; i <= (qtd_alunos - 1); i++) {
            if (aluno[i] >= media) {
                acima = acima + 1;
            }
        }
        System.out.println("A media da turma foi " + media + " e " + acima + " alunos ficaram acima da media");

    }

}
