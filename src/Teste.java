import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 4, 10};

        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));
    }

}
