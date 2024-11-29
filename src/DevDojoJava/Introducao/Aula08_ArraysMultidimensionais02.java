package DevDojoJava.Introducao;

public class Aula08_ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        int[] array = {100, 200, 300};

        arrayInt[0] = array;
        arrayInt[1] = new int[]{1, 3, 5, 7, 9};
        arrayInt[2] = new int[]{11, 13, 15, 17, 19, 21, 23};

        for (int[] arrayBase : arrayInt){
            System.out.println("-------");
            for(int num : arrayBase){
                System.out.print(num + ", ");

            }
            System.out.println(" ");
        }
    }
}
