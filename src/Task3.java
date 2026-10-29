import java.util.Scanner;
import java.util.Arrays;
public class Task3 {
    public static void replaceNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Updated array : " + Arrays.toString(arr));
    }
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        int min = -100;
        int max = 100;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min + 1)) +  min;
        }
        System.out.println("Random array: " + Arrays.toString(numbers));
        replaceNegative(numbers);
    }

}
