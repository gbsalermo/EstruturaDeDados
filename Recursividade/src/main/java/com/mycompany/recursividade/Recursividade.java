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
    
    System.out.println(fatorial(10)); //informo o valor do parametro no caso 10
    System.out.println(fibonacci(5));
}

public static int fatorial(int n) { //Crio a função recursiva que vai ter um valor inteiro n como parametro
    if (n == 0 || n == 1){ //verifico, se n é igual a 0 ou 1, retorno n(Esse é o caso base)
        return n;
    }
    return n * fatorial(n - 1);//Agora se não, faço o calculo de n * fatorial(n - 1), dessa forma fico chamando o fatorial até ele chegar no caso base(1)
}


public static int fibonacci(int p){

    if(p == 1){ //Caso base 1
        return 0;
    }
    else if(p == 2){ //Caso base 2
        return 1;
    }
    return fibonacci(p - 1) + fibonacci(p - 2); //função recursiva
}
}
            

