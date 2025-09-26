import java.util.Scanner;

public class exemplo_operadores{


     public static void main (String[] args) {

            int A;
            int B;

            int soma;
            int subtracao;
            int multiplicacao;
            double divisao;
            double resto_divisao;

             int ex_inteiro;
            char ex_char;
            double ex_double;
            Boolean ex_Boolean;
            float ex_float;
            byte ex_byte;
            short ex_short;
            long ex_long;


            Scanner s = new Scanner(System.in);  //variavel para ler informaçoes do terminal (entrada de dados)

            System.out.println("Informe os valores inteiros para:");
            System.out.print("A: ");  // print sem ln pro usuario digitar do lado do A:
            A = s.nextInt();            // next = pega oq o usuario digita

            System.out.print("B: ");
            B = s.nextInt();

            A = 20; 
            B = 10;

                soma = A + B;
                subtracao = A - B;
                multiplicacao = A * B;
                divisao = A / B;
                resto_divisao = A % B;   //10 % 3 resultado vai ser 1.

            System.out.println("Resultados das operacoes entre A e B");
            System.out.println("A: " + A+"\nB: " + B);
            System.out.println("soma: " + soma);
            System.out.println("subtracao: " + subtracao);
            System.out.println("multiplicacao: " + multiplicacao);
            System.out.println("divisao: " + divisao);
            System.out.println("resto_divisao: " + resto_divisao);



            System.out.println("Resultados das operaçoes Relacionais entre A e B");
            System.out.println("A: " + A+"\nB: " + B);
            System.out.println("A < B" + (A < B));
            System.out.println("A <= B" + (A <= B) );
            System.out.println("A == B" + (A == B) );
            System.out.println("A != B" + (A != B) );
            System.out.println("A >= B" + (A >= B) );
            System.out.println("A > B" + (A > B) );

            
    // index é a posiçao
    // string conjunto de caracteres



            System.out.print("informe um valor inteiro:");
            ex_inteiro = s.nextInt();
            System.out.println("valor informado: " + ex_inteiro);

            System.out.print("informe uma letra:");  
            ex_char = s.next().charAt(0);
            System.out.println("letra informada: " + ex_char);

            System.out.print("informe um valor inteiro:");
            ex_double = s.nextDouble();
            System.out.println("valor informado: " + ex_double);
            
            System.out.print("informe um valor inteiro:");
            ex_Boolean = s.nextBoolean();
            System.out.println("valor informado: " + ex_Boolean);

            System.out.print("informe um valor inteiro:");
            ex_float = s.nextFloat();
            System.out.println("valor informado: " + ex_float);

            System.out.print("informe um valor inteiro:");
            ex_long = s.nextLong();
            System.out.println("valor informado: " + ex_long);

            System.out.print("informe um valor inteiro:");
            ex_short = s.nextShort();
            System.out.println("valor informado:" + ex_short);

            System.out.print("informe o valor inteiro:");
            ex_byte = s.nextByte();
            System.out.println("valor informado: " + ex_byte);

            

                



     }


// Criar as variaveis para cada tipo primitivo, peça os valores, armazene nas variaveis e depois
// mostre na tela os valores informados pelo usuario:
// System.out.print 
    
}
