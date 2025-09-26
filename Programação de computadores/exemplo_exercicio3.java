import java.util.Scanner;

public class exemplo_exercicio3 {
    
    public static void main(String[] args) {
        
                Scanner s = new Scanner(System.in);
       
                System.out.print("Escolha um numero: ");
                int n1 = s.nextInt();

                System.out.print("Escolha o proximo numero: ");
                int n2 = s.nextInt();

                        if (n1 == n2) {
                            System.out.println("Sao iguais: ");  
                            //quando for verdadeiro
                        } else if (n1 > n2) {
                            System.out.println("O primeiro é maior que o segundo: ");
                            //quando resultado for verdadeiro
                        } else {
                            System.out.println("O primeiro é menor que o segundo: ");   
                            //quando for falso
                        }

    }
}
