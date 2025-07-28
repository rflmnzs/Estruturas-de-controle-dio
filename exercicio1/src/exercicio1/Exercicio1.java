package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
    
//        1. ESCREVA UM CÓDIGO ONDE O USUARIO INSERE UM NÚMERO
//                E O PROGRAMA LEIA ESTE NÚMERO E RETORNE A TABUADA
//                        DESTE NUMERO

    Scanner ler = new Scanner(System.in);
    
        System.out.println("Digite o número desejado para a tabuada: ");
        int num = ler.nextInt();
        
        for(int i = 0; i <= 10; i++){
            int resultado = num * i;
            System.out.printf("%s X %s = %s\n", num, i, resultado);
        }
        
    }
    
}
