package JavaUdemy_Nelio.Sessao_C_Seis;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {

            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            double media = ((A*2) + (B*3) + (C*5)) / 10;

            System.out.printf("%.1f\n", media);
        }
    }
}
