package Sessao_B_Cinco;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NAO NEGATIVO");
        }

    }
}
