import java.util.Scanner;

public class lista2_ex10 {
    public static void main(String[] args) {
        
        Double num1, num2;
        Scanner s = new Scanner(System.in);

            System.out.println("Digite o primeiro numero:");
            num1 = s.nextDouble();
            System.out.println("Digite o segundo numero: ");
            num2 = s.nextDouble();

            System.out.println("O primeiro numero digitado foi: " + num1);

            System.out.println("O segundo numero digitado foi: " + num2);
    }
}
