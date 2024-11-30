/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc06 {

    public static void main(String[] args) {
        
        int[] v = {5, 1, 4, 2, 7, 8, 3, 6};
        
        for (int i = 7; i >= 4; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }
        
        
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        
        
        for (int i = 0; i <= 7; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
