import java.util.Scanner;

public class exemplo_exc6 {
    public static void main(String[] args){

        double num1, num2, resultado=0;
        char operador;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        num1 = s.nextDouble();
        System.out.println("Informe o segundo numero: ");
        num2 = s.nextDouble();

        System.out.println("Informe um operador artmetico (+, -, /, *): ");
        operador = s.next().charAt(0);

        switch (operador) {
            case '+': 
            resultado = num1 + num2;
            break;
            case '-':
            resultado = num1 - num2;
            break;
            case '/':
            resultado = num1 / num2;
            break;
            case '*':
            resultado = num1 * num2;
        default:
            System.out.println("Operador invalido");
        }

        System.out.println("Resultado: " + num1 + operador + num2 + " = " + resultado);

    }

}
