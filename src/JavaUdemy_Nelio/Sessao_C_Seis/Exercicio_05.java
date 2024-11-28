package JavaUdemy_Nelio.Sessao_C_Seis;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 1; i < N; i++) {
            if (X >=10 && X <=20){
                in ++;
            }else{
                out ++;
            }
            X = sc.nextInt();
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
