package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

//      3. ESCREVA UM CODIGO QUE O USUARIO ENTRE COM UM PRIMEIRO NUMERO.
//         UM SEGUNDO NUMERO MAIOR QUE O PRIMEIRO E ESCOLHE A OPÇÃO ENTRE 
//         PAR E IMPAR, COM ISSO O CÓDIGO DEVE INFORMAR TODOS OS NÚMEROS
//         PARES OU ÍMPARES (DE ACORDO COM A SELEÇÃO INICIAL) NO INTERVALO
//         DE NÚMEROS INFORMADOS, INCLUINDO OS NÚMEROS INFORMADOS E EM ORDEM
//                 DECRESCENTE!

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = ler.nextInt();

        //  num1 = PRIMEIRO NÚMERO INFORMADO
        //  num2 = SEGUNDO NÚMERO INFORMADO
        var numMaior = true;
        while (numMaior) {
            System.out.printf("Ótimo! Agora informe um segundo número MAIOR que %s: ", num1);
            int num2 = ler.nextInt();
            if (num2 < num1) {
                System.out.printf("O número informado deve ser MAIOR que %s ", num1);
                continue;
            }
            numMaior = false;

            while (true) {

                System.out.println("Perfeito, agora digite 'par' se quer números pares ou 'impar' se quer números ímpares: ");
                var parimpar = ler.next().toLowerCase();
                
                // NÃO ESQUECER DO TOLOWERCASE PARA ENTRAR TANTO MAIÚSCULAS QUANTO MINÚSCULAS!

                if (parimpar.equals("par")) {
                    System.out.printf("Você escolheu números pares entre %s e %s. ", num1, num2);
                    for (int i = num1; i < num2; i++) {
                        if (parimpar.equals("par")) {
                            if (i % 2 == 0) {
                                System.out.println(i + " ");
                            }
                        }
                    }
                    break;
                } else if (parimpar.equals("impar")) {
                    System.out.printf("Você escolheu números impares entre %s e %s.", num1, num2);
                    for (int i = num1; i < num2; i++) {
                        if (parimpar.equals("impar")) {
                            if (i % 2 == 1) {
                                System.out.println(i + " ");
                            }
                        } 
                    }break;
                    } else {
                            System.out.println("Digite apenas 'par' para números pares ou 'impar' para números impares!");
                        }

                    }
                   
                }

            }
        }

    
