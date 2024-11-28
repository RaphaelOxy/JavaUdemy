package JavaUdemy_Nelio.Sessao_B_Cinco;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

    }
}
