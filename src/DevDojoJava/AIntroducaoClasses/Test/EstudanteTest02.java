package DevDojoJava.AIntroducaoClasses.Test;

import DevDojoJava.AIntroducaoClasses.Domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.name = "Jack";
        estudante.age = 18;
        estudante.sex = 'M';

        estudante02.name = "Joseph";
        estudante02.age = 21;
        estudante02.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

        System.out.println(" ----------------- ");

        System.out.println(estudante02.name);
        System.out.println(estudante02.age);
        System.out.println(estudante02.sex);
    }
}
