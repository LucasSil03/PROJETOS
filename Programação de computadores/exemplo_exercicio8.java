
import java.util.Scanner;

public class exemplo_exercicio8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Double num1, num2;
        Double consumo;
        Double media;

        System.out.println("Informe o consumo do dia 1: ");
        num1 = s.nextDouble();
        System.out.println("Informe o tanto que foi gasto ate o dia 30: ");
        num2 = s.nextDouble();

        consumo = num1 - num2;
        media = consumo / 30;

            System.out.println("O resultado do consumo foi de: " + consumo);
            System.out.println("A media foi de: " + media);
        
            


    }
}
