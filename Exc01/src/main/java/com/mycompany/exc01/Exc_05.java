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
public class Exc_05 {
    public static void main(String[] args) {
     int[] vet = new int[10];
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i<10; i++){
            System.out.println("Digite o "+ (i+1) +"num para preencher o vetor: ");
            vet[i] = read.nextInt();
        }
        
        System.out.println("Exibindo a primeira metade dos valores armazenados... ");
        for (int i = 0; i<10; i++){
            System.out.print(vet[i]/2+" ");
        }
    }
}
