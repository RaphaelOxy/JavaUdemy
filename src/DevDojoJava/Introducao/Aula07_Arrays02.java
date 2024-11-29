package DevDojoJava.Introducao;

public class Aula07_Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Jack";
        nomes[1] = "Davi";
        nomes[2] = "Jones";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
