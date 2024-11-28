package JavaUdemy_Nelio.Sessao_A_Quatro;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int diferenca = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
