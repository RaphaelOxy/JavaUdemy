package DevDojoJava.BIntroducaoMetodos.Test;

import DevDojoJava.BIntroducaoMetodos.Domain.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira os numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        Calculadora calculadora = new Calculadora();
        calculadora.multiplicacaoDoisNumeros(num1, num2);
        System.out.println("_____________");
        calculadora.multiDoisNumeros(num3, num4);
    }
}
