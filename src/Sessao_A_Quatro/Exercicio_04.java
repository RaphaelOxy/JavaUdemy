package Sessao_A_Quatro;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int funcionario = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double salario = sc.nextDouble();
        double salarioFinal = horasTrabalhadas * salario;

        System.out.println("Number = " + funcionario);
        System.out.println("SALARY = U$ " + salarioFinal);


    }
}
