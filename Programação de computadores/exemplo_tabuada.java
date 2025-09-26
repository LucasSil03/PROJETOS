import java.util.Scanner;

public class exemplo_tabuada {
    public static void main (String [] args) {

// divisao de um problema em partes 
// passo 1: definiar as variaveis e seus tipos
// passo 2: obter os valores para as variaveis (pedir ao usuario ou informar)
// passo 3: fazer os calculos necessarios
// passo 4: mostrar os resultados

   int num;
   Scanner s = new Scanner (System.in);

   System.out.println("Informe um numero para calcular a tabuada: ");
   num = s.nextInt();

        System.out.println("\nTabuada do " + num + ": ");
        for(int i = 1; i <=10; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
                //exemplo usando printf:
            System.out.println("\nTabuada do " + num + ": ");
            for(int i = 1; i <=10; i++)
            System.out.printf("%d X %d = %d\n", num, i, (num*i));


        s.close();

   }
}

