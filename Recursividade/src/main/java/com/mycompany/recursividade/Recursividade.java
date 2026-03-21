/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividade;

import java.util.Scanner;

/**
 *
 * @author enzog
 */
public class Recursividade {

public static void main(String[] args) {
    
    System.out.println(fatorial(5));
}

public static int fatorial(int n) {
    if (n == 0){
        return 1;
    }
    return n * fatorial(n -1);
}}
            

