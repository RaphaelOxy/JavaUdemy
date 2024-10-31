package Sessao_C_Seis;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = sc.nextInt();
        double x;
        double y;

        for (int i = 0; i < N; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (y == 0){
                System.out.println("Divisao impossivel");
            }else{
                System.out.printf("%.1f\n", x / y);
            }
        }
    }
}
