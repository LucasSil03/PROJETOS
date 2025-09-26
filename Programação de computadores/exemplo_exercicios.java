import java.util.Scanner;

public class exemplo_exercicios {

    public static void main(String[] args) {

             System.out.println("Informe as respostas do usuario:");

        Scanner s = new Scanner(System.in);

        
            // Exercicio 1.

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();
    

        System.out.print("Qual sua idade?: ");
        String idade = s.nextLine();

        System.out.print("Qual o seu genero?: ");
        String genero = s.nextLine();

        System.out.print("Qual Sua cor favorita: ");
        String cor_favorita = s.nextLine();

        System.out.print("Esporte que pratica: ");
        String esporte = s.nextLine();

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("genero: " + genero);
        System.out.println("Sua cor favorita é: " + cor_favorita);
        System.out.println("Esporte que pratica: " + esporte);


            // Exercicio 2.

                System.out.print("Informe o numero1: ");
                int numero_1 = s.nextInt();

                System.out.print("Informe o numero2: ");
                int numero_2 = s.nextInt();


                System.out.println("numero_1: " + numero_1+"\nB: " + numero_2);
                System.out.println("soma: " + (numero_1 + numero_2));
                System.out.println("divisao: " + (numero_1 + numero_2));
                System.out.println("subtracao: " + (numero_1 + numero_2));
                System.out.println("multiplicaçao: " + (numero_1 + numero_2));


                // Exercicio 3

                System.out.print("Escolha um numero: ");
                int n1 = s.nextInt();

                System.out.print("Escolha o proximo numero: ");
                int n2 = s.nextInt();

                        if (n1 == n2) {
                                System.out.println("Sao iguais: ");
                        } else if (n1 > n2) {
                            System.out.println("O primeiro é maior que o segundo: ");
                        } else {
                            System.out.println("O primeiro é menor que o segundo: ");
                        }

                

        
                    

 }

  }

