package Sessao_C_Seis;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <=N ; i++) {

            fatorial = fatorial * i;

        }
        System.out.println(fatorial);
    }
}
