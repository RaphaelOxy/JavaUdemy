package JavaUdemy_Nelio.Sessao_D_Oito.Entities;
import JavaUdemy_Nelio.Sessao_D_Oito.Aplicacao.Estoque_Produto;
import java.util.Locale;
import java.util.Scanner;

public class Televisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Estoque_Produto televisao = new Estoque_Produto();
        System.out.println("Enter product Data: ");
        System.out.println("Name: ");
        televisao.name = sc.nextLine();
        System.out.println("Price: ");
        televisao.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        televisao.quantity = sc.nextInt();

        System.out.println("Product data: " + televisao);
        System.out.printf("");
        System.out.printf("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        televisao.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + televisao);

        System.out.println("");
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        televisao.removeProducts(quantity);

        System.out.printf("");
        System.out.printf("Updated data: " + televisao);

    }
}
