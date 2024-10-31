package Sessao_C_Seis;
import java.util.Scanner;
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cA = 1;
        int cB = 1;
        int cC = 1;

        for (int i = 1; i <= N ; i++) {
            System.out.println(cA + " " + cB + " " + cC);
            cA++;
            cB = cA * cA;
            cC = cA * cA * cA;


        }

    }
}
