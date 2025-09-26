
import java.util.Scanner;

public class exemplo_exercicio6 {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        num1 = s.nextInt();
        System.out.print("Informe o segundo numero: ");
        num2 = s.nextInt();

        System.out.println("Resultado das comparaçoes entre os numeros informados: ");
        System.out.println("num1 > num2: " + "\n" + (num1 > num2) + "\n");
        System.out.println("num1 < num2: " + "\n" + (num1 < num2) + "\n");
        System.out.println("num1 == num2: " + "\n" + (num1 == num2) + "\n");
        System.out.println("num1 != num2: " + "\n" + (num1 != num2) + "\n");

    }
}
