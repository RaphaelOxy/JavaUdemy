package DevDojoJava.AIntroducaoClasses.Test;

import DevDojoJava.AIntroducaoClasses.Domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.name = "Jack";
        estudante.age = 18;
        estudante.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
        System.out.println(estudante);


    }
}
