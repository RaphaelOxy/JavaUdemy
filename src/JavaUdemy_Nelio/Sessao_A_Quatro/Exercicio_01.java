package JavaUdemy_Nelio.Sessao_A_Quatro;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("SOMA = " + (a+b));

    }
}
