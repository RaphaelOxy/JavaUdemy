package DevDojoJava.AIntroducaoClasses.Test;

import DevDojoJava.AIntroducaoClasses.Domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Mustang";
        carro1.model = "Mach 1";
        carro1.age = 1969;

        carro2.name = "Porsche";
        carro2.model = "911 Carrera GTS";
        carro2.age = 2025;

        System.out.println(carro1.name);
        System.out.println(carro1.model);
        System.out.println(carro1.age);
        System.out.println("__________________");
        System.out.println(carro2.name);
        System.out.println(carro2.model);
        System.out.println(carro2.age);

    }
}
