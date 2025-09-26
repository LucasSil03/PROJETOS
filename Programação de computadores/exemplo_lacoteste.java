public class exemplo_lacoteste {
    public static void main(String[] args) {
        
        int cont;
        cont = 0;

        while (cont < 5) {
            System.out.println("Contador: " + cont);
            //cont++;
            cont = cont + 1;

                      System.out.println ("Exemplo com repita (do):");
        do { 
            System.out.println("Contador: " + cont);
            cont++;
            
        } while (cont < 5);

          System.out.println("Exemplo com Para (for)");
           for (int i = 67; i < 73; i++) {
            System.out.println("Contador: " + i);
        }



        
    }
}
}