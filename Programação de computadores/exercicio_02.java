
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        num1 = s.nextInt();

        System.out.println("Informe o segundo numero: ");
        num2 = s.nextInt();

        System.out.println("Resultado das operaçoes aritmeticas: ");
        System.out.println("Soma num1 + num2: " + (num1+num2));
        System.out.println("Subtracao num1 - num2: " + (num1-num2));
        System.out.println("Divisao num1 / num2: " + (num1/num2));
        System.out.println("Multiplicaçao num1 * num2: " + (num1*num2));


    }
    
}
