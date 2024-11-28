package JavaUdemy_Nelio.Sessao_B_Cinco;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double intervalo = sc.nextDouble();

        if (intervalo >= 0.00 && intervalo <= 25.00){
            System.out.println("Intervalo [0,25]");
        }else if (intervalo > 25.00 && intervalo <= 50.00) {
            System.out.println("Intervalo [25,50]");
        }else if (intervalo > 50.00 && intervalo <= 75.00) {
            System.out.println("Intervalo [50,75]");
        }else if (intervalo > 75.00 && intervalo <= 100.00) {
            System.out.println("Intervalo [75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
