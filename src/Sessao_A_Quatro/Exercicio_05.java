package Sessao_A_Quatro;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int codItem1 = sc.nextInt();
        int numItem1 = sc.nextInt();
        double valorUnidade1 = sc.nextDouble();
        double valorTotal1 = numItem1 * valorUnidade1;

        int codItem2 = sc.nextInt();
        int numItem2 = sc.nextInt();
        double valorUnidade2 = sc.nextDouble();
        double valorTotal2 = numItem2 * valorUnidade2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", (valorTotal1 + valorTotal2));




    }
}
