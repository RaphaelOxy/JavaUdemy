package DevDojoJava.AIntroducaoClasses.Test;

import DevDojoJava.AIntroducaoClasses.Domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Mestre Kami";
        professor.age = 43;
        professor.sex = 'M';

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.sex);

    }
}
