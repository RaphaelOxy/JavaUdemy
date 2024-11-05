package Sessao_D_Oito.Aplicacao;
import Sessao_D_Oito.Entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Area_Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area = %.4f\n", areaX);
        System.out.printf("Triangle Y area = %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area = X");
        }else{
            System.out.println("Larger area = Y");
        }
    }
}