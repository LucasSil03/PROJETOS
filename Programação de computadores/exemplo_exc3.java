import java.util.Scanner;
public class exemplo_exc3 {
    /**
     * @param args
     */
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Informe o primeiro valor: ");
    int a = sc.nextInt();
    System.out.println("Informe o segundo valor: ");
    int b = sc.nextInt();
    System.out.println("Informe o terceiro valor: ");
    int c = sc.nextInt();
   
            System.out.println("Ordem decrescente: ");
           
            if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " - " + b + " - " + c);
            } else {
                System.out.println(a + " - " + c + " - " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " - " + a + " - " + c);
            } else {
                System.out.println(b + " - " + c + " - " + a);
            }
        } else { // c é o menor
            if (a < b) {
                System.out.println(c + " - " + a + " - " + b);
            } else {
                System.out.println(c + " - " + b + " - " + a);
            }
        }


        sc.close();


    }
}
