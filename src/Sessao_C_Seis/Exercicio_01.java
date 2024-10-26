package Sessao_C_Seis;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        for (int i = 0; i != 2002 ; i++) {
//            num = sc.nextInt();
//            i = num;
//            if (i != 2002){
//                System.out.println("Senha invalida");
//
//            }else{
//                System.out.println("Acesso permitido");
//                break;
//            }
//        }
        while (num != 2002){
            System.out.println("Senha invalida");
            num = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
