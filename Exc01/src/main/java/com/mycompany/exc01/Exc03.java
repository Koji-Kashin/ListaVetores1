/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc01;

/**
 *
 * @author The Great Garibaldo
 */

// Exc_03
public class Exc03 {

    public static void main(String[] args) {
        int[] n = new int[101];

        for (int i = 1; i <= n.length; i++) {
            if (i % 2 == 0) {
                n[i] = i;
                System.out.println(n[i]);
            }

        }
    }
}
