package Estrutura_De_Dados;

public class Aula_01_Lista_Vetor {
    public static void main(String[] args) {
//        int x = 3;
//        System.out.println("Valor de X: " + x);
//        x = 4;
//        System.out.println("Valor de X de novo: " + x);
        int[] vetorzao = new int [10];
        vetorzao[0] = 3;
        vetorzao[1] = 4;
        vetorzao[2] = 8;
        vetorzao[3] = 13;
        vetorzao[4] = 22;
        vetorzao[5] = 51;
        vetorzao[6] = 33;


//        System.out.println(vetorzao[3]);
        System.out.println("Imprimindo...");
        for (int i = 0; i < vetorzao.length ; i++) {
            System.out.println(vetorzao[i]);
        }

    }
}
