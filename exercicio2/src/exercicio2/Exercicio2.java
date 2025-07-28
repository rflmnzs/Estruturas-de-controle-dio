package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

//        2. ESCREVA UM CÓDIGO ONDE O USUARIO ENTRA COM SUA ALTURA E PESO,
//        SEJA FEITO O CALCULO DO IMC( IMC = PESO / (ALTURA * ALTURA))E
//        SEJA EXIBIDA A MENSAGEM DE ACORDO COM O RESULTADO :
//        
//        <= 18.5 - 'ABAIXO DO PESO'
//        <= 24.9 - 'PESO NORMAL'
//        <= 29.9 - 'LEVEMENTE ACIMA DO PESO'
//        <= 34,9 - 'OBESIDADE GRAU I'
//        <= 39.9 - 'OBESIDADE GRAU II (SEVERA)'
//        >= 40   - 'OBESIDADE GRAU III (MORBIDA)'

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Olá, informe seu nome: ");
        var nome = ler.next();
        
        System.out.println("Muito prazer " + nome + ", agora me informe sua idade: ");
        int idade = ler.nextInt();
        
        System.out.println("Certo, e qual a sua altura? ");
        float altura = ler.nextFloat();
        
        System.out.println("Muito bem! Por fim, me informe agora seu peso atual: ");
        float peso = ler.nextFloat();
        
        float imc = peso / (altura * altura);
        
        if (imc <= 18.5){
            System.out.printf("%s, seu imc está em %s, você está abaixo do peso ideal!", nome, imc);
        }
        if (imc <= 24.9){
            System.out.printf("%s, seu imc está em %s. Parabéns, você está no peso ideal!", nome, imc);
        }
        else if (imc <= 29.9){
            System.out.printf("%s, seu imc está em %s, levemente acima do peso.", nome, imc);
        }
        else if (imc <= 34.9){
            System.out.printf("%s, seu imc está em %s, você está em nível de obesidade grau I!", nome, imc);
        }
        else if (imc <= 39.9){
            System.out.printf("%s, seu imc está em %s, você está em nível de obesidade grau II(SEVERO)!", nome, imc);
        } else {
            System.out.printf("%s, seu imc está em %s, você está em nível de obesidade grau III(MÓRBIDA)", nome, imc);
        }
        
        

    }

}
