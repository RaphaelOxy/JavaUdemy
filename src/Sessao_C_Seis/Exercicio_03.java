package Sessao_C_Seis;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        int Alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(tipo != 4){
            if (tipo == 1){
                Alcool ++;
            } else if (tipo == 2) {
                gasolina ++;
            } else if (tipo == 3) {
                diesel ++;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel );
    }
}
