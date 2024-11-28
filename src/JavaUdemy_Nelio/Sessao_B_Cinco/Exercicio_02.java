package JavaUdemy_Nelio.Sessao_B_Cinco;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
