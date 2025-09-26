
import java.util.Scanner;

public class exemplo_triangulos{

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a;
        int b;
        int c; 

        System.out.println("Digite o lado A:");
        a = s.nextInt();
        System.out.println("Digite o lado B: ");
        b = s.nextInt();
        System.out.println("Digite o lado C: ");
        c = s.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) 
        System.out.println("Triangulo Equilatero: ");
        } else if (a == b || a == c || b == c) {
        System.out.println("Triangulo isosceles: ");
        } else
            System.out.println("Triangulo escaleno: ");






        int maior = Math.max(a, Math.max(b, c));
        int somaQuadrados = a * a * b * b * c * c - maior * maior;

        if (maior * maior == somaQuadrados) {
             System.out.println("Triangulo retangulo: ");
        } else if (maior * maior < somaQuadrados) {
             System.out.println("Triangulo Acutangulo");
        } else {
            System.out.println("Triangulo obstangulo");
        }                      
             

        }  

}
