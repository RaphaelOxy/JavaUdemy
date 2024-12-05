package DevDojoJava.BIntroducaoMetodos.Test;

import DevDojoJava.BIntroducaoMetodos.Domain.Estudante;
import DevDojoJava.BIntroducaoMetodos.Domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.name = "Jack";
        estudante01.age = 23;
        estudante01.sex = 'M';

        estudante02.name = "Annie";
        estudante02.age = 13;
        estudante02.sex = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

    }
}
