package JavaUdemy_Nelio.Sessao_B_Cinco;
import java.util.Scanner;
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor;
        double preco;

        if(item == 1){
            valor = 4.00;
            preco = quantidade * valor;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (item == 2) {
            valor = 4.50;
            preco = quantidade * valor;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (item == 3) {
            valor = 5.00;
            preco = quantidade * valor;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (item == 4) {
            valor = 2.00;
            preco = quantidade * valor;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (item == 5) {
            valor = 1.50;
            preco = quantidade * valor;
            System.out.printf("Total: R$ %.2f\n", preco);
        }

    }
}
