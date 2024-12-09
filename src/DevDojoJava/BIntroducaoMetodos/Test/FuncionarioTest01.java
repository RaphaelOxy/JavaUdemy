package DevDojoJava.BIntroducaoMetodos.Test;

import DevDojoJava.BIntroducaoMetodos.Domain.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();

        funcionario01.name = "Jack";
        funcionario01.age = 23;
        funcionario01.salary = new double[] {2500.32, 2568.29, 4312.11};

        funcionario02.name = "Ana";
        funcionario02.age = 29;
        funcionario02.salary = new double[] {4322.32, 4723.29, 5011.23};


        funcionario01.imprime();
        funcionario02.imprime();


    }
}
