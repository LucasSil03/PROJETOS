
import java.util.Scanner;

public class exemplo_exercicio4 {
    public static void main(String[] args) {

    int num;
    Scanner s = new Scanner(System.in);
    String resultado="Numero PAR";

    System.out.println("Informe o primeiro numero: ");
    num = s.nextInt();
    
    System.out.println("\nExemplo lucas: ");
    if ( num % 2 != 0 ) {
        resultado = "Numero IMPAR!";
    } 
    System.out.println("Resultado: " + resultado);


    }

    
}

  