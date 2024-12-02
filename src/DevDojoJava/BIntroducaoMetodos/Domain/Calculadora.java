package DevDojoJava.BIntroducaoMetodos.Domain;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    //metodo
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    //metodo
    public void subtraiDoisNumeros(){
        System.out.println(13 - 5);
    }

    public void multiplicacaoDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public void multiDoisNumeros (double num1, double num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;

    }
}
