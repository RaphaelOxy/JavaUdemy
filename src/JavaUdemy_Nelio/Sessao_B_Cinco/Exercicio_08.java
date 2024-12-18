package JavaUdemy_Nelio.Sessao_B_Cinco;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario <= 2000.00){
            imposto = 0.00;
        } else if (salario > 2000.00 && salario <= 3000.00) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario > 3000.00 && salario <= 4500.00) {
            imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
        } else if (salario > 4500.00) {
            imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
        }if (imposto == 0.00){
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
