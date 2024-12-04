package DevDojoJava.BIntroducaoMetodos.Test;

import DevDojoJava.BIntroducaoMetodos.Domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        //variavel primitiva original nunca sera alterada
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("___________");
        System.out.println("Dentro CalculadoraTest04: ");
        System.out.println(num1);
        System.out.println(num2);
    }
}
