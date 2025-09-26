import java.util.Scanner;

public class lista2_ex4 {
        public static void main(String[] args) {
        
        int soma=0, numDigitado=-1;
        Scanner s = new Scanner (System.in);


            while (numDigitado != 0) {
                         System.out.println("Informe um numero (Informe 0 para sair): ");
                        numDigitado = s.nextInt();
                if(numDigitado > 0 && numDigitado <=100){
                    if(numDigitado % 2 == 0){
                        soma += numDigitado;
                        System.out.println("Numero somado!");
                    } else {
                        System.out.println("Numero nao somado!");
                    }

                }else if(numDigitado != 0){
                    System.out.println("Numero fora do intervalo esperado (0 - 100)");
                }
            }
                    System.out.println("Resultado: Soma dos valores pares e: " + soma);

    }
}
