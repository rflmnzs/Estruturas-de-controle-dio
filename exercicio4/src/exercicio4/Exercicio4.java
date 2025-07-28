package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
// 4. ESCREVA UM CÓDIGO ONDE O ÚSUARIO INFORME UM NÚMERO INICIAL
// POSTERIORMENTE IRÁ INFORMAR OUTROS 'N' NÚMEROS, A EXECUÇÃO
// DO CÓDIGO IRÁ CONTINUAR ATÉ QUE O NÚMERO INFORMADO DIVIDIDO PELO PRIMEIRO NÚMERO
// TENHA RESTO DIFERENTE DE 0 NA DIVISÃO, NÚMEROS MENORES QUE O PRIMEIRO NÚMERO
//  DEVEM SER IGNORADOS.

    Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num = ler.nextInt();
        
        var verificar = true;
        while(verificar){
            System.out.println("Informe um numero para verificar: ");
            int numVerif = ler.nextInt();
            if (numVerif < num){
                System.out.printf("Informe um numero maior que %s. \n", num);
                continue;
            }
            
            var resultado = numVerif % num;
            verificar = resultado == 0;
            System.out.printf("%s XX %s = %s ", numVerif, num, resultado);
        }
        
    
                
        
    }
    
}
