package DevDojoJava.Introducao;

public class Aula07_Arrays01 {
    public static void main(String[] args) {
//      int [] numeros = {5, 7, 15, 37};
        int [] idades = new int [3];

        idades [0] = 21;
        idades [1] = 11;
        idades [2] = 15;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
