package DevDojoJava.BIntroducaoMetodos.Domain;

import java.util.Scanner;

public class Funcionario {
    public String name;
    public int age;
    public double[] salary;

    public void mediaSalario(){
        double media = 0;
        for (double salario : salary) {
            media += salario;
        }
        media /= salary.length;
        System.out.println("Average of the last three months: ");
        System.out.printf("R$%.2f" , media);
    }

    public void imprime(){
        System.out.println("______________");
        System.out.println("employee: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary for the last three months: ");
        for(double salar : salary){
            System.out.println("R$" + salar);
        }
        mediaSalario();
    }
}
