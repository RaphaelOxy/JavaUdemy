package DevDojoJava.BIntroducaoMetodos.Domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("student:");
        System.out.println("Name:" + estudante.name);
        System.out.println("Age:" + estudante.age);
        System.out.println("Sex: " + estudante.sex);
        System.out.println("__________");
    }
}
