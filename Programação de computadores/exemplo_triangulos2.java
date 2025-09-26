
import java.util.Scanner;

public class exemplo_triangulos2 {

    public static void main(String[] args) {

int lado_a, lado_b, lado_c;
String msg="";

        Scanner s = new Scanner(System.in);
System.out.print("Algoritmo para calcular o tipo de um triangulo: ");
System.out.print("Informe o primeiro lado: ");
lado_a = s.nextInt();
System.out.print("Informe o segundo lado: ");
lado_b = s.nextInt();
System.out.print("Informe o terceiro lado: ");
lado_c = s.nextInt();

if (lado_a < lado_b + lado_c && lado_b < lado_a + lado_c && lado_c < lado_a + lado_b && lado_c < lado_a) {
    if (lado_a == lado_b && lado_b == lado_c) {
        msg = "É um triangulo equilatero!";   
    } else if (lado_a != lado_b && lado_b != lado_c && lado_c != lado_a) {
        msg = "É um triangulo escaleno!";
    } else {
        msg = "É um triangulo isosceles!";
    }
        
} else{
    msg = "Nao é um triangulo!";
}

System.out.print("Resultado: " + msg);










    }
}
