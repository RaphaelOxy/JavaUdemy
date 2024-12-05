package DevDojoJava.BIntroducaoMetodos.Domain;

import java.util.Scanner;

public class Funcionario {
    public String name;
    public int age;
    public double salary1;
    public double salary2;
    public double salary3;

    public double mediaSalario(){
        double media = (salary1 + salary2 + salary3) / 3;

        return media;
    }
    public void imprime(){
        System.out.println("______________");
        System.out.println("employee: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary for the last three months: ");
        System.out.println(this.salary1);
        System.out.println(this.salary2);
        System.out.println(this.salary3);
        System.out.println("Average of the last three months: ");
        System.out.printf("%.2f\n" , this.mediaSalario());
    }

}
