package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

//      3. ESCREVA UM CODIGO QUE O USUARIO ENTRE COM UM PRIMEIRO NUMERO.
//         UM SEGUNDO NUMERO MAIOR QUE O PRIMEIRO E ESCOLHE A OP��O ENTRE 
//         PAR E IMPAR, COM ISSO O C�DIGO DEVE INFORMAR TODOS OS N�MEROS
//         PARES OU �MPARES (DE ACORDO COM A SELE��O INICIAL) NO INTERVALO
//         DE N�MEROS INFORMADOS, INCLUINDO OS N�MEROS INFORMADOS E EM ORDEM
//                 DECRESCENTE!

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro n�mero: ");
        int num1 = ler.nextInt();

        //  num1 = PRIMEIRO N�MERO INFORMADO
        //  num2 = SEGUNDO N�MERO INFORMADO
        var numMaior = true;
        while (numMaior) {
            System.out.printf("�timo! Agora informe um segundo n�mero MAIOR que %s: ", num1);
            int num2 = ler.nextInt();
            if (num2 < num1) {
                System.out.printf("O n�mero informado deve ser MAIOR que %s ", num1);
                continue;
            }
            numMaior = false;

            while (true) {

                System.out.println("Perfeito, agora digite 'par' se quer n�meros pares ou 'impar' se quer n�meros �mpares: ");
                var parimpar = ler.next().toLowerCase();
                
                // N�O ESQUECER DO TOLOWERCASE PARA ENTRAR TANTO MAI�SCULAS QUANTO MIN�SCULAS!

                if (parimpar.equals("par")) {
                    System.out.printf("Voc� escolheu n�meros pares entre %s e %s. ", num1, num2);
                    for (int i = num1; i < num2; i++) {
                        if (parimpar.equals("par")) {
                            if (i % 2 == 0) {
                                System.out.println(i + " ");
                            }
                        }
                    }
                    break;
                } else if (parimpar.equals("impar")) {
                    System.out.printf("Voc� escolheu n�meros impares entre %s e %s.", num1, num2);
                    for (int i = num1; i < num2; i++) {
                        if (parimpar.equals("impar")) {
                            if (i % 2 == 1) {
                                System.out.println(i + " ");
                            }
                        } 
                    }break;
                    } else {
                            System.out.println("Digite apenas 'par' para n�meros pares ou 'impar' para n�meros impares!");
                        }

                    }
                   
                }

            }
        }

    
