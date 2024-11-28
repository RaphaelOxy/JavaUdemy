package JavaUdemy_Nelio.Sessao_D_Oito.Exercicios.Application;

import JavaUdemy_Nelio.Sessao_D_Oito.Exercicios.Entities.Salario;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Salario salario = new Salario();

        System.out.print("Name: ");
        salario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        salario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        salario.tax = sc.nextDouble();

        System.out.println("Employee: " + salario);
        System.out.print("Wich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        salario.increaseSalary(percentage);

        System.out.println("update data: " + salario);


    }
}
