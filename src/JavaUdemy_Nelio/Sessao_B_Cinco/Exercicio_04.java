package JavaUdemy_Nelio.Sessao_B_Cinco;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if (horaInicial == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicial > horaFinal) {
            int saida = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + saida + " HORA(S)" );
        }else{
            int saida = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU "+ saida + " HORA(S)");
        }


    }
}
