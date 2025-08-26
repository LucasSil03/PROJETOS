public class exemplo_operadores {
        public static void main (String[] args) {

            int soma;
            int subtracao;
            int multiplicacao;
            double divisao;
            double resto_divisao;

            int A;
            int B;

            A = 20;
            B = 10;

                soma = A + B;
                subtracao = A - B;
                multiplicacao = A * B;
                divisao = A / B;
                resto_divisao = A % B;

            System.out.println("Resultados das operacoes entre A e B");
            System.out.println("A: " + A+"\nB: " + B);
            System.out.println("soma: " + soma);
            System.out.println("subtracao: " + subtracao);
            System.out.println("multiplicacao: " + multiplicacao);
            System.out.println("divisao: " + divisao);
            System.out.println("resto_divisao: " + resto_divisao);


            System.out.println("Resultados das operacoes relacionais entre A e B");
            System.out.println("A: " +A+"\nB: " + B);
            System.out.println("A < B" + (A<B));
            System.out.println("A <= B" + (A<=B));
            System.out.println("A == B" + (A==B));
            System.out.println("A != B" + (A !=B));
            System.out.println("A >= B" + (A>=B));
            System.out.println("A > B" + (A>B));

            
            





            }



        }