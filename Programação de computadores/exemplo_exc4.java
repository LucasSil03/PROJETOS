import java.util.Scanner;


public class exemplo_exc4 {
    public static void main(String [] args) {
Scanner sc = new Scanner(System.in);


System.out.println("Digite qual a altura em metros: ");
Double altura = sc.nextDouble();


System.out.println("Digite qual o peso atual em KG: ");
Double peso = sc.nextDouble();


System.out.println("Digite o sexo (M para masculino, F para feminino): ");
String sexo = sc.nextLine();


Double pesoIdeal;
   
    if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Use M ou F.");
            sc.close();
            return;
        }


        System.out.printf("\nAltura: %.2f m\n", altura);
        System.out.printf("Peso atual: %.2f kg\n", peso);
        System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);


        if (peso < pesoIdeal) {
            System.out.println("Situação: Abaixo do peso ideal.");
        } else if (peso > pesoIdeal) {
            System.out.println("Situação: Acima do peso ideal.");
        } else {
            System.out.println("Situação: No peso ideal!");
        }


        sc.close();


    }

}