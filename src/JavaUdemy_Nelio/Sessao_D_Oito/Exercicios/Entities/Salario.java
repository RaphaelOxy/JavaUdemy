package JavaUdemy_Nelio.Sessao_D_Oito.Exercicios.Entities;

public class Salario {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
    public String toString() {
        return "Updated data: " + name + ", "+ String.format("%.2f\n", NetSalary());
    }
}
