import java.util.Arrays;

public class Aufgabe2 {
    //Maxim
    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }
    //Minim
    public static int findMin(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }
    //Suma fara cel mai mic numar
    public static int findMaxSum(int[] numbers) {
        int totalSum = Arrays.stream(numbers).sum();
        return totalSum - findMin(numbers);
    }
    //Suma fara cel mai mare numar
    public static int findMinSum(int[] numbers) {
        int totalSum = Arrays.stream(numbers).sum();
        return totalSum - findMax(numbers);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 10, 17};

        System.out.println("The maximum number is " + findMax(numbers));
        System.out.println("The lowest number is " + findMin(numbers));
        System.out.println("The maximum sum of n-1 is " + findMaxSum(numbers));
        System.out.println("The minimum sum of n-1 is " + findMinSum(numbers));
    }
}
