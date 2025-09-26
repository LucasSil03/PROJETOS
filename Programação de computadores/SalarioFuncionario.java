import java.util.Scanner;


public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Entrada de dados
        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = sc.nextLine();


        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();


        System.out.print("Digite o valor que recebe por hora: ");
        double valorHora = sc.nextDouble();


        sc.nextLine(); // limpar buffer
        System.out.print("Digite o mês de referência (ex: Maio/24): ");
        String mes = sc.nextLine();


        // Cálculo do salário
        double salario;
        int horasExtras = 0;


        if (horasTrabalhadas <= 200) {
            salario = horasTrabalhadas * valorHora;
        } else {
            horasExtras = horasTrabalhadas - 200;
            double salarioNormal = 200 * valorHora;
            double salarioExtras = horasExtras * (valorHora * 1.5);
            salario = salarioNormal + salarioExtras;
        }


        // Saída
        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Mês de Referência: " + mes);
        System.out.printf("Salário Total: R$ %.2f\n", salario);


        if (horasExtras > 0) {
            System.out.println("Houve " + horasExtras + " horas extras no mês.");
        } else {
            System.out.println("Não houve horas extras no mês.");
        }


        sc.close();
    }
}
